package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.Asset;
import com.example.carrentalheadquarters.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;

    public List<Asset> list(){
        return assetRepository.findAll();
    }

    public Asset get(Integer id) {
        Optional<Asset> assetOptional = assetRepository.findById(id);
        if(assetOptional.isPresent()){
            return assetOptional.get();
        }
        else {
            return null;
        }
    }

    public Asset save(Asset asset){
        return assetRepository.save(asset);
    }

    public Asset update(Integer id, Asset asset){
        Optional<Asset> assetOptional = assetRepository.findById(id);
        if(assetOptional.isEmpty()){
            return null;
        }
        else {
            Asset existingAsset = assetOptional.get();
            existingAsset.setAssetname(asset.getAssetname());
            return assetRepository.save(existingAsset);
        }
    }

    public void delete(Integer id){
        assetRepository.deleteById(id);
    }
}
