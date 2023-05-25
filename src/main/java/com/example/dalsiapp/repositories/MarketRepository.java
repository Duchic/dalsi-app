package com.example.dalsiapp.repositories;

import com.example.dalsiapp.entities.MarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<MarketEntity, Integer> {
}
