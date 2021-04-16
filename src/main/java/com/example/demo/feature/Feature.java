package com.example.demo.feature;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@IdClass(FeatureId.class)
public class Feature implements Serializable{
    @Id
    private String featureName;
    @Id
    private String email;
    private Boolean enable;

    public Feature() {
    }

    public Feature(String featureName, String email, Boolean enable) {
        this.featureName = featureName;
        this.email = email;
        this.enable = enable;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "featureName='" + featureName + '\'' +
                ", email='" + email + '\'' +
                ", enable=" + enable +
                '}';
    }
}
