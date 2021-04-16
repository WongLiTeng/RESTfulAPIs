package com.example.demo.feature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, String>{
    @Query("SELECT f FROM Feature f WHERE f.email=?1 AND f.featureName = ?2")
    Optional<Feature> getAccess(String email, String featureName);
}
