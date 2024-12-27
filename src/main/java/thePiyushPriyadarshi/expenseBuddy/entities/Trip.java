package thePiyushPriyadarshi.expenseBuddy.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Trip {

    @Id
    private UUID id;
    private String tripName;

    @OneToMany(mappedBy = "trip", fetch = FetchType.LAZY)
    private List<TripMember> members;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    private User createdBy;
}
