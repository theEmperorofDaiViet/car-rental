package com.example.carrentalbranch.service;

import com.example.carrentalbranch.model.Asset;
import com.example.carrentalbranch.repository.AssetRepository;
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
}
