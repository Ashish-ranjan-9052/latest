package com.example.UpdatedBackend;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "entities", path = "entities")
public interface EntityRepository extends MongoRepository<Entity, String> {
}

