package thePiyushPriyadarshi.expenseBuddy.Dto;

import lombok.Data;

import java.util.UUID;

@Data
public class TripMemberDto {

    private UUID id;
    private String name;
    private String email;
}
