package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ClientRevenueDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

import java.util.List;
import java.util.Optional;

public class ClientRevenueDTORepositoryImpl implements ClientRevenueDTORepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<ClientRevenueDTO> getRevenueByClient() {
        StoredProcedureQuery getRevenueByClient = em.createNamedStoredProcedureQuery("getRevenueByClient");
        return getRevenueByClient.getResultList();
    }

    @Override
    public <S extends ClientRevenueDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ClientRevenueDTO> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ClientRevenueDTO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ClientRevenueDTO> findAll() {
        return null;
    }

    @Override
    public Iterable<ClientRevenueDTO> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(ClientRevenueDTO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ClientRevenueDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
