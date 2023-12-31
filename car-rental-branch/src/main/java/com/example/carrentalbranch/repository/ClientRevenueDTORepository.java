package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ClientRevenueDTO;
import org.springframework.data.repository.CrudRepository;

public interface ClientRevenueDTORepository extends CrudRepository<ClientRevenueDTO, Integer>, ClientRevenueDTORepositoryCustom {

}
