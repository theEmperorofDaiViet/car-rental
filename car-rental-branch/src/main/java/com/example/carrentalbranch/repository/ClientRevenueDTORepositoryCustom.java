package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ClientRevenueDTO;

import java.util.List;

public interface ClientRevenueDTORepositoryCustom {

    List<ClientRevenueDTO> getRevenueByClient();

}
