package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopRevenueByYearDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

import java.util.List;
import java.util.Optional;

public class ShopRevenueByYearDTORepositoryImpl implements ShopRevenueByYearDTORepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<ShopRevenueByYearDTO> getRevenueByYear(Integer shopid) {
        StoredProcedureQuery getRevenueByYear = em.createNamedStoredProcedureQuery("getRevenueByYear");
        getRevenueByYear.setParameter("shopid", shopid);

        return getRevenueByYear.getResultList();
    }

    @Override
    public <S extends ShopRevenueByYearDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ShopRevenueByYearDTO> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShopRevenueByYearDTO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ShopRevenueByYearDTO> findAll() {
        return null;
    }

    @Override
    public Iterable<ShopRevenueByYearDTO> findAllById(Iterable<Integer> integers) {
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
    public void delete(ShopRevenueByYearDTO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ShopRevenueByYearDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
