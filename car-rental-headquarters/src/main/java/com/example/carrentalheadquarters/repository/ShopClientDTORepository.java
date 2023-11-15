package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopClientDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopClientDTORepository extends CrudRepository<ShopClientDTO, Integer>, ShopClientDTORepositoryCustom {

}
