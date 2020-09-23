package com.joenpaco.models.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Component
public class Feature implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	
	@JsonProperty("type")
    private String type;
	
//	@Column(columnDefinition="LONGBLOB")
    @JsonProperty("properties")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition="LONGBLOB")
    private Properties properties;
    
//    @Column(columnDefinition="LONGBLOB")
    @JsonProperty("geometry")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition="LONGBLOB")
    private Geometry geometry;
    
    @JsonProperty("id")
    private String id;

    public Feature() {
    }

    public Feature(String type, Properties properties, Geometry geometry, String id) {
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
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
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

	@Override
	public String toString() {
		return "Feature [type=" + type + ", properties=" + properties + ", geometry=" + geometry + ", id=" + id + "]";
	}
    
    

}
