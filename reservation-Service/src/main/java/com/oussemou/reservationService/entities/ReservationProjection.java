package com.oussemou.reservationService.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "fullCustomer",types = Reservation.class)
public interface ReservationProjection {
    public Long getId();
    public String getNom();
    public String getType();
}
