package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ClientRevenueDTO;

import java.util.List;

public interface ClientRevenueDTORepositoryCustom {

    List<ClientRevenueDTO> getRevenueByClient();
}
