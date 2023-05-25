package com.example.dalsiapp.services;

import com.example.dalsiapp.dto.AssetDto;
import com.example.dalsiapp.entities.AssetEntity;
import com.example.dalsiapp.repositories.AssetRepository;
import com.example.dalsiapp.repositories.MarketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private final MarketRepository marketRepository;

    private final AssetRepository assetRepository;

    public AssetServiceImpl(MarketRepository marketRepository, AssetRepository assetRepository) {
        this.marketRepository = marketRepository;
        this.assetRepository = assetRepository;
    }

    @Override
    public List<AssetDto> get() {
        return List.of();
    }

    @Override
    public AssetDto create(int marketId, AssetDto assetDto) throws Exception {
        var market = marketRepository.findById(marketId)
                .orElseThrow(() -> new Exception("Market not found"));

        var assetEntity = mapToEntity(assetDto); // tady prijde AssetEntity
        assetEntity.setMarket(market);

        var newAsset = assetRepository.save(assetEntity);
        return mapToDto(newAsset);
    }

    private AssetEntity mapToEntity(AssetDto assetDto) {
//        return AssetEntity
//                .builder()
//                .name(assetDto.getName())
//                .build();  // 1

//        var assetEntity = new AssetEntity(); // 2
//        assetEntity.setName(assetDto.getName());
//
//        return assetEntity

        return new AssetEntity(assetDto.getName()); // 3
    }

    private AssetDto mapToDto(AssetEntity assetEntity) {
        return AssetDto
                .builder()
                .name(assetEntity.getName())
                .build();
    }
}
