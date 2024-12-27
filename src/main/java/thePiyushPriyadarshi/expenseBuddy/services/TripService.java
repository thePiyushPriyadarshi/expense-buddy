package thePiyushPriyadarshi.expenseBuddy.services;


import org.springframework.http.ResponseEntity;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripDto;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripMemberDto;
import thePiyushPriyadarshi.expenseBuddy.entities.Trip;

import java.util.UUID;

public interface TripService {

    TripDto createTrip(TripDto tripDto);

    Trip getTripById(UUID tripId);
}
