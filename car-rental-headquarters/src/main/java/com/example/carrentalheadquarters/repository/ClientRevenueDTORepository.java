package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ClientRevenueDTO;
import org.springframework.data.repository.CrudRepository;

public interface ClientRevenueDTORepository extends CrudRepository<ClientRevenueDTO, Integer>, ClientRevenueDTORepositoryCustom {
}
