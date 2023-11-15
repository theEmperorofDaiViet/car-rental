package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import com.example.carrentalheadquarters.dto.ShopRevenueDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public class ShopRevenueRepositoryImpl implements ShopRevenueRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ShopRevenueDTO> getAllRevenue(){
        StoredProcedureQuery getAllRevenue = em.createNamedStoredProcedureQuery("getAllRevenue");
        return getAllRevenue.getResultList();
    }

    @Override
    public <S extends ShopRevenueDTO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ShopRevenueDTO> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShopRevenueDTO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ShopRevenueDTO> findAll() {
        return null;
    }

    @Override
    public Iterable<ShopRevenueDTO> findAllById(Iterable<Integer> integers) {
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
    public void delete(ShopRevenueDTO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ShopRevenueDTO> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
