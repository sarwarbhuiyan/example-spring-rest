package com.example.repositories;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.RelationshipOperationsRepository;
import org.springframework.data.neo4j.template.Neo4jOperations;

import com.example.core.domain.User;
import com.example.core.services.Neo4jUserDetailsService;

public interface UserRepository extends GraphRepository<User>, RelationshipOperationsRepository<User>, Neo4jUserDetailsService {

}
