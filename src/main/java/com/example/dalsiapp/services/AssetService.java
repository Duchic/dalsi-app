package com.example.dalsiapp.services;

import com.example.dalsiapp.dto.AssetDto;
import com.example.dalsiapp.entities.AssetEntity;
import org.hibernate.type.AssociationType;

import java.util.List;

public interface AssetService {
    List<AssetDto> get();

    AssetDto create(int marketID, AssetDto assetDto) throws Exception;
}
