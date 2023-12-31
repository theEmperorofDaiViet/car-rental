package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopClientDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopClientDTORepository extends CrudRepository<ShopClientDTO, Integer>, ShopClientDTORepositoryCustom {

}
