package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("carService1")
public class CarServiceImpl implements CarService{
    private  int carsCount;
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++carsCount,"powerful","orange"));
        cars.add(new Car(++carsCount,"weak","white"));
        cars.add(new Car(++carsCount,"average","red"));
        cars.add(new Car(++carsCount,"outdated","blue"));
        cars.add(new Car(++carsCount,"old","black"));
    }
    @Override
    public List<Car> show(int number) {
        return cars.stream().filter(car -> car.getNumber() <= number).collect(Collectors.toList());
    }
}
