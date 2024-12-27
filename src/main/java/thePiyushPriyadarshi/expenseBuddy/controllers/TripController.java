package thePiyushPriyadarshi.expenseBuddy.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripDto;
import thePiyushPriyadarshi.expenseBuddy.Dto.TripMemberDto;
import thePiyushPriyadarshi.expenseBuddy.services.TripMemberService;
import thePiyushPriyadarshi.expenseBuddy.services.TripService;

import java.util.UUID;

@RestController
@RequestMapping("/trip")
@RequiredArgsConstructor
public class TripController {

    private final TripService tripService;
    private final TripMemberService tripMemberService;

    @PostMapping("/create")
    public ResponseEntity<TripDto> createTrip(@RequestBody TripDto tripDto){

        return new ResponseEntity<>(tripService.createTrip(tripDto), HttpStatus.CREATED);
    }

    @PostMapping("/{tripId}/addMember")
    public ResponseEntity<TripMemberDto> addMember(@PathVariable UUID tripId, @RequestBody TripMemberDto tripMemberDto){

        return ResponseEntity.ok(tripMemberService.addMember(tripId,tripMemberDto));
    }

}
