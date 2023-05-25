package com.example.dalsiapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Autoboxing

@Entity(name="assets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToOne()
    @JoinColumn(name="market_id", nullable = false)
    private MarketEntity market;

    public AssetEntity(String name) {
        this.name = name;
    }
}
