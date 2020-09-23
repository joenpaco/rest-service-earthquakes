package com.joenpaco.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joenpaco.models.entities.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long>{

}
