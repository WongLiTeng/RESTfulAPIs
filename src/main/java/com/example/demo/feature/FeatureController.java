package com.example.demo.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FeatureController {

    private final FeatureService featureService;

    @Autowired
    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping(path="/feature")
    public String getFeatureByEmailFeatureName(@RequestParam("email") String email, @RequestParam("featureName") String featureName){
        return this.featureService.getFeatureByEmailFeatureName(email, featureName);
    }

    @PostMapping(path="/feature")
    public ResponseEntity registerNewFeature(@RequestBody Feature feature){
        return this.featureService.addNewFeature(feature);
    }
}
