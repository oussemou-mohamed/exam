package com.oussemou.resourceService.services;

import com.oussemou.resourceService.dto.ResourceRequestDTO;
import com.oussemou.resourceService.dto.ResourceResponseDTO;
import com.oussemou.resourceService.entities.Resource;

import java.util.List;

public interface ResourceService {
    ResourceResponseDTO addResource(ResourceRequestDTO resourceRequestDTO);
    List<Resource> findAll();
    Resource findById(Long id);
    Resource update(Long id, Resource resource);
}
