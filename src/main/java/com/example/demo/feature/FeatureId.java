package com.example.demo.feature;

import java.io.Serializable;

public class FeatureId  implements Serializable {
    private String featureName;
    private String email;

    public FeatureId(){

    }

    public FeatureId(String featureName, String email) {
        this.featureName = featureName;
        this.email = email;
    }
}
