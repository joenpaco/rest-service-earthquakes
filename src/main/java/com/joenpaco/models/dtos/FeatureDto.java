package com.joenpaco.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeatureDto {

    @JsonProperty("type")
    private String type;
    @JsonProperty("properties")
    private PropertiesDto properties;
    @JsonProperty("geometry")
    private GeometryDto geometry;
    @JsonProperty("id")
    private String id;

    public FeatureDto() {
    }

    public FeatureDto(String type, PropertiesDto properties, GeometryDto geometry, String id) {
        this.type = type;
        this.properties = properties;
        this.geometry = geometry;
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("properties")
    public PropertiesDto getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(PropertiesDto properties) {
        this.properties = properties;
    }

    @JsonProperty("geometry")
    public GeometryDto getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(GeometryDto geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}
