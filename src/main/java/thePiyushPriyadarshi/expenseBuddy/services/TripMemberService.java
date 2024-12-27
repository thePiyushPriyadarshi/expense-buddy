package thePiyushPriyadarshi.expenseBuddy.services;

import thePiyushPriyadarshi.expenseBuddy.Dto.TripDto;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripMemberDto;

import java.util.UUID;

public interface TripMemberService {

    TripMemberDto addMember(UUID tripId, TripMemberDto tripMemberDto);

}
