package thePiyushPriyadarshi.expenseBuddy.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class TripMember {

    @Id
    private UUID id;
    private String name;
    private String email;

    @OneToOne
    private User user;

    @ManyToOne
    private Trip trip;
}
