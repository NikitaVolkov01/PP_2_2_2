package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Volkswagen Tiguan", "White", 2011));
        cars.add(new Car("Kia Rio", "Red", 2014));
        cars.add(new Car("BMW M5", "Blue", 2020));
        cars.add(new Car("Hyundai Solaris", "Brown", 2018));
        cars.add(new Car("Mercedes GLE", "Black", 2022));
    }

    @Override
    public List<Car> getAllCars(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}