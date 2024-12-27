package thePiyushPriyadarshi.expenseBuddy.services.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripMemberDto;
import thePiyushPriyadarshi.expenseBuddy.entities.Trip;
import thePiyushPriyadarshi.expenseBuddy.entities.TripMember;
import thePiyushPriyadarshi.expenseBuddy.repositories.TripMemberRepository;
import thePiyushPriyadarshi.expenseBuddy.services.TripMemberService;
import thePiyushPriyadarshi.expenseBuddy.services.TripService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TripMemberServiceImpl implements TripMemberService {

    private final TripMemberRepository tripMemberRepository;
    private final TripService tripService;
    private final ModelMapper modelMapper;

    @Override
    public TripMemberDto addMember(UUID tripId, TripMemberDto tripMemberDto) {

        Trip trip = tripService.getTripById(tripId);

        TripMember tripMember = modelMapper.map(tripMemberDto,TripMember.class);
        tripMember.setTrip(trip);
        TripMember savedTripMember = tripMemberRepository.save(tripMember);

        return modelMapper.map(savedTripMember,TripMemberDto.class);
    }
}
