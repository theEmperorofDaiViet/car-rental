package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import com.example.carrentalheadquarters.dto.ShopRevenueDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

import java.util.List;
import java.util.Optional;

public class ShopRevenueByMonthRepositoryImpl implements ShopRevenueByMonthRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ShopRevenueByMonthDTO> getRevenueByMonth(Integer shopid){
        StoredProcedureQuery getRevenueByMonth = em.createNamedStoredProcedureQuery("getRevenueByMonth");
        getRevenueByMonth.setParameter("shopid", shopid);

        return getRevenueByMonth.getResultList();
    }

    @Override
    public <S extends ShopRevenueByMonthDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ShopRevenueByMonthDTO> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShopRevenueByMonthDTO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ShopRevenueByMonthDTO> findAll() {
        return null;
    }

    @Override
    public Iterable<ShopRevenueByMonthDTO> findAllById(Iterable<Integer> integers) {
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
    public void delete(ShopRevenueByMonthDTO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ShopRevenueByMonthDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
