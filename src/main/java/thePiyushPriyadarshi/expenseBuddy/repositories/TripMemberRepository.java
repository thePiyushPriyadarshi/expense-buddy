package thePiyushPriyadarshi.expenseBuddy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thePiyushPriyadarshi.expenseBuddy.entities.TripMember;

import java.util.UUID;

@Repository
public interface TripMemberRepository extends JpaRepository<TripMember, UUID> {
}
