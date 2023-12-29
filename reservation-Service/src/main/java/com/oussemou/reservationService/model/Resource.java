package com.oussemou.reservationService.model;

import com.oussemou.reservationService.enums.ResourceType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class Resource {
    private Long id;
    private String nom;
    private ResourceType type;
}
