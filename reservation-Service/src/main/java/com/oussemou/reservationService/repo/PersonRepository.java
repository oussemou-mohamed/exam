package com.oussemou.reservationService.repo;
import com.oussemou.reservationService.entities.Person;
import com.oussemou.reservationService.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {
}
