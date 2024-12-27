package thePiyushPriyadarshi.expenseBuddy.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class TripExpense {

    @Id
    private UUID id;
    private String name;
    private String description;

    @ManyToOne
    private Trip trip;
}
