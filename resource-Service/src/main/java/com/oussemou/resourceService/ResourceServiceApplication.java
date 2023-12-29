package com.oussemou.resourceService;

import com.oussemou.resourceService.entities.Resource;
import com.oussemou.resourceService.enums.ResourceType;
import com.oussemou.resourceService.repo.ResourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ResourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ResourceRepository resourceRepository){
		return args -> {
			resourceRepository.saveAll(List.of(
					Resource.builder().nom("Mohamed").type(Math.random()>0.5? ResourceType.MATERIEL_INFO:ResourceType.MATERIEL_AUDIO_VISUEL).build(),
					Resource.builder().nom("Hassan").type(Math.random()>0.5? ResourceType.MATERIEL_INFO:ResourceType.MATERIEL_AUDIO_VISUEL).build(),
					Resource.builder().nom("Yassin").type(Math.random()>0.5? ResourceType.MATERIEL_INFO:ResourceType.MATERIEL_AUDIO_VISUEL).build()
			));
			resourceRepository.findAll().forEach(System.out::println);
		};
	}
}
