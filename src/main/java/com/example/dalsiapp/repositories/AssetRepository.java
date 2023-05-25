package com.example.dalsiapp.repositories;

import com.example.dalsiapp.entities.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<AssetEntity, Integer> {
}
