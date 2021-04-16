package com.example.demo.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class FeatureService {
    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureService(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    public String getFeatureByEmailFeatureName(String email, String featureName){
        Optional<Feature> featureOptional = featureRepository.getAccess(email, featureName);
        if(!featureOptional.isPresent()) throw new IllegalStateException("feature not found");
        boolean enable = featureOptional.get().getEnable();
        if(enable){
            return "{\n" +
                    "\t\"canAccess\": true\n" +
                    "}";
        }else{
            return "{\n" +
                    "\t\"canAccess\": false\n" +
                    "}";
        }
    }

    @PostMapping
    public ResponseEntity addNewFeature(Feature feature) {
        Optional<Feature> featureOptional = featureRepository.getAccess(feature.getEmail(), feature.getFeatureName());
        if(!featureOptional.isPresent()){
            featureRepository.save(feature);
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }else{
            featureRepository.save(feature);
            return new ResponseEntity(HttpStatus.OK);
        }
    }
}
