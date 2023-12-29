package com.oussemou.resourceService.web;

import com.oussemou.resourceService.dto.ResourceRequestDTO;
import com.oussemou.resourceService.dto.ResourceResponseDTO;
import com.oussemou.resourceService.entities.Resource;
import com.oussemou.resourceService.mappers.ResourceMapper;
import com.oussemou.resourceService.repo.ResourceRepository;
import com.oussemou.resourceService.services.ResourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResourceRestController {
    private ResourceRepository resourceRepository;
    private ResourceService resourceService;
    private ResourceMapper resourceMapper;

    public ResourceRestController(ResourceRepository resourceRepository, ResourceService resourceService, ResourceMapper resourceMapper) {
        this.resourceRepository = resourceRepository;
        this.resourceService = resourceService;
        this.resourceMapper = resourceMapper;
    }
    @GetMapping("/resources")
    public List<Resource> resources(){
        return resourceService.findAll();
    }
    @GetMapping("/resources/{id}")
    public Resource resource(@PathVariable Long id){
        return resourceService.findById(id);
    }
    @PostMapping("/resources")
    public ResourceResponseDTO save(@RequestBody ResourceRequestDTO requestDTO){
        return resourceService.addResource(requestDTO);
    }
    @PutMapping("/resources/{id}")
    public Resource update(@PathVariable Long id,@RequestBody Resource resource){
        return resourceService.update(id,resource);
    }
    @DeleteMapping("/resources/{id}")
    public void deleteAccount(@PathVariable Long id){
        resourceRepository.deleteById(id);
    }

}
