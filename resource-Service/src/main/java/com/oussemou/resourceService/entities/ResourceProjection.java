package com.oussemou.resourceService.entities;

import com.oussemou.resourceService.enums.ResourceType;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer",types = Resource.class)
public interface ResourceProjection {
    public Long getId();
    public String getNom();
    public String getType();
}
