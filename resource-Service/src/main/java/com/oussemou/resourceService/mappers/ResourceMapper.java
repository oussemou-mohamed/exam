package com.oussemou.resourceService.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.oussemou.resourceService.dto.ResourceRequestDTO;
import com.oussemou.resourceService.dto.ResourceResponseDTO;
import com.oussemou.resourceService.entities.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ResourceMapper {
    public ResourceResponseDTO fromResource(Resource resource){
        ResourceResponseDTO resourceResponseDTO=new ResourceResponseDTO();
        BeanUtils.copyProperties(resource,resourceResponseDTO);
        return resourceResponseDTO;
    }
    /*ResourceResponseDTO resourceResponseDTO=ResourceResponseDTO.builder()
               .id(saveResource.getId())
               .nom(saveResource.getNom())
               .type(saveResource.getType())
               .build();*/
    public Resource fromResourceRequestDTO(ResourceRequestDTO resourceRequestDTO){
        Resource resource=Resource.builder()
                .id(new Random().nextLong())
                .nom(resourceRequestDTO.getNom())
                .type(resourceRequestDTO.getType())
                .build();
        return resource;
    }
}
