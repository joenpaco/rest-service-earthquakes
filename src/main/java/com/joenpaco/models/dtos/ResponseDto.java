
package com.joenpaco.models.dtos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {

    @JsonProperty("type")
    private String type;
    @JsonProperty("metadata")
    private MetadataDto metadata;
    @JsonProperty("features")
    private List<FeatureDto> features = new ArrayList<FeatureDto>();
    @JsonProperty("bbox")
    private List<String> bbox = new ArrayList<String>();

    public ResponseDto() {
    }

    public ResponseDto(String type, MetadataDto metadata, List<FeatureDto> features, List<String> bbox) {
        this.type = type;
        this.metadata = metadata;
        this.features = features;
        this.bbox = bbox;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("metadata")
    public MetadataDto getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(MetadataDto metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("features")
    public List<FeatureDto> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<FeatureDto> features) {
        this.features = features;
    }

    @JsonProperty("bbox")
    public List<String> getBbox() {
        return bbox;
    }

    @JsonProperty("bbox")
    public void setBbox(List<String> bbox) {
        this.bbox = bbox;
    }

}
