package com.oussemou.resourceService.services;

import com.oussemou.resourceService.dto.ResourceRequestDTO;
import com.oussemou.resourceService.dto.ResourceResponseDTO;
import com.oussemou.resourceService.entities.Resource;
import com.oussemou.resourceService.mappers.ResourceMapper;
import com.oussemou.resourceService.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;
@Service
@Transactional
public class ResourceServiceImpl implements ResourceService{
    @Autowired
    private ResourceRepository resourceRepository;
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public ResourceResponseDTO addResource(ResourceRequestDTO resourceRequestDTO) {
        Resource resource=resourceMapper.fromResourceRequestDTO(resourceRequestDTO);
        Resource saveResource=resourceRepository.save(resource);
        ResourceResponseDTO resourceResponseDTO=resourceMapper.fromResource(saveResource);
        return resourceResponseDTO;
    }
    @Override
    public List<Resource> findAll() {
        return resourceRepository.findAll();
    }
    @Override
    public Resource findById(Long id) {
        return resourceRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Account %s not found",id)));
    }
    @Override
    public Resource update(Long id, Resource resource) {
        Resource resource1=resourceRepository.findById(id).orElseThrow();
        if (resource.getType()!=null) resource1.setType(resource.getType());
        if (resource.getNom()!=null) resource1.setNom(resource.getNom());
        return resourceRepository.save(resource1);
    }
}
