package com.example.spring5kotlinboilerplate.repository

import com.example.spring5kotlinboilerplate.model.Person
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
interface ProjectSettingsRepository : MongoRepository<Person, String> {
    fun findByFirstName(@Param("name") name: String): List<Person>
}
