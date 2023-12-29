package com.oussemou.reservationService;

import com.oussemou.reservationService.entities.Person;
import com.oussemou.reservationService.entities.Reservation;
import com.oussemou.reservationService.repo.PersonRepository;
import com.oussemou.reservationService.repo.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class ReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ReservationRepository reservationRepository, PersonRepository personRepository){
		return args -> {
			Stream.of("Mohamed","Hassan","Hind","Mallak").forEach(c->{
				Person person=Person.builder()
						.name(c)
						.email(c+"@gmail.com")
						.function("responsable1")
						.build();
				personRepository.save(person);
			});
			personRepository.findAll().forEach(person -> {
				Random random = new Random();
				Reservation reservation=Reservation.builder().name("R1").context("C1").date(new Date()).duration(3).person(person).idResource((long) random.nextInt()).build();
				reservationRepository.save(reservation);
			});
		};
	}
}
