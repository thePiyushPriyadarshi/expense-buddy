package thePiyushPriyadarshi.expenseBuddy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thePiyushPriyadarshi.expenseBuddy.entities.Trip;

import java.util.UUID;

@Repository
public interface TripRepository extends JpaRepository<Trip, UUID> {
}
