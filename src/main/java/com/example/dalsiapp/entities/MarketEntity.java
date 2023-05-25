package com.example.dalsiapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity(name="markets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "market", fetch = FetchType.LAZY)
    private Set<AssetEntity> assets = new HashSet<>();

    public MarketEntity(String name) {
        this.name = name;
    }
}
