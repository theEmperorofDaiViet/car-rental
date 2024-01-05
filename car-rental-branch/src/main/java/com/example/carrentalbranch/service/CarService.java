package com.example.carrentalbranch.service;

import com.example.carrentalbranch.model.Car;
import com.example.carrentalbranch.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> list(){
        return carRepository.findAll();
    }

    public Car get(Integer id){
        Optional<Car> carOptional = carRepository.findById(id);
        if(carOptional.isPresent()){
            return carOptional.get();
        }
        else{
            return null;
        }
    }

    public Car save(Car car){
        return carRepository.save(car);
    }

    public Car update(Integer id, Car car){
        Optional<Car> carOptional = carRepository.findById(id);
        if(carOptional.isEmpty()){
            return null;
        }
        else{
            Car existingCar = carOptional.get();
            existingCar.setCarname(car.getCarname());
            existingCar.setRangevehicle(car.getRangevehicle());
            existingCar.setLicenseplate(car.getLicenseplate());
            existingCar.setCarlife(car.getCarlife());
            existingCar.setExpense(car.getExpense());
            existingCar.setStatus(car.isStatus());
            existingCar.setDescribes(car.getDescribes());
            existingCar.setShop(car.getShop());
            return carRepository.save(existingCar);
        }
    }

    public void delete(Integer id){
        carRepository.deleteById(id);
    }
}
