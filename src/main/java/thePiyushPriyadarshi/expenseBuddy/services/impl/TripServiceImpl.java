package thePiyushPriyadarshi.expenseBuddy.services.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripDto;
import thePiyushPriyadarshi.expenseBuddy.entities.Trip;
import thePiyushPriyadarshi.expenseBuddy.exceptions.ResourceNotFoundException;
import thePiyushPriyadarshi.expenseBuddy.repositories.TripRepository;
import thePiyushPriyadarshi.expenseBuddy.services.TripService;

import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    private final ModelMapper modelMapper;
    private final TripRepository tripRepository;
    @Override
    public TripDto createTrip(TripDto tripDto) {
        Trip trip = modelMapper.map(tripDto,Trip.class);
        trip.setId(UUID.randomUUID());
        return modelMapper.map(tripRepository.save(trip),TripDto.class);
    }

    @Override
    public Trip getTripById(UUID tripId) {
        return tripRepository.findById(tripId).orElseThrow(()->
                new ResourceNotFoundException("No trip Found with id : "+tripId));
    }

}
