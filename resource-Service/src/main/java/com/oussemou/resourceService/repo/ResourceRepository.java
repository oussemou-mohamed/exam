package com.oussemou.resourceService.repo;

import com.oussemou.resourceService.entities.Resource;
import com.oussemou.resourceService.enums.ResourceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findByType(ResourceType type);
}
