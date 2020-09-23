package com.joenpaco.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joenpaco.models.entities.Properties;

public interface PropertiesRepository extends JpaRepository<Properties, Long> {

}
