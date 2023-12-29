package com.oussemou.reservationService.web;

import com.oussemou.reservationService.entities.Reservation;
import com.oussemou.reservationService.repo.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ReservationRestController {
    private ReservationRepository reservationRepository;

    public ReservationRestController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    @GetMapping("/reservations")
    public List<Reservation> resources(){
        return reservationRepository.findAll();
    }
}
