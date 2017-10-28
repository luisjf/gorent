package com.gorent.repository;

import org.springframework.data.repository.CrudRepository;

import com.gorent.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
