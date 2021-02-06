package com.cavalcanti.heroesapp.repository;
 
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cavalcanti.heroesapp.document.Heroes;

@EnableScan 
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
