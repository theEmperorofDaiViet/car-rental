package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopClientDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

import java.util.List;
import java.util.Optional;

public class ShopClientDTORepositoryImpl implements ShopClientDTORepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ShopClientDTO> getAllClient() {
        StoredProcedureQuery getAllClient = em.createNamedStoredProcedureQuery("getAllClient");
        return getAllClient.getResultList();
    }

    @Override
    public <S extends ShopClientDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ShopClientDTO> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShopClientDTO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ShopClientDTO> findAll() {
        return null;
    }

    @Override
    public Iterable<ShopClientDTO> findAllById(Iterable<Integer> integers) {
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
    public void delete(ShopClientDTO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ShopClientDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
