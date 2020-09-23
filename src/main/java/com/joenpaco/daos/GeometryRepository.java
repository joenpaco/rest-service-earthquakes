package com.joenpaco.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joenpaco.models.entities.Geometry;

public interface GeometryRepository extends JpaRepository<Geometry, Long> {

}
