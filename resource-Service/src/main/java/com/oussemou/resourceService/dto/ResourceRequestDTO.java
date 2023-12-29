package com.oussemou.resourceService.dto;

import com.oussemou.resourceService.enums.ResourceType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ResourceRequestDTO {
    private String nom;
    private ResourceType type;
}
