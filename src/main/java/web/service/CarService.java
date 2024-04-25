package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;

public interface CarService {
    public List <Car> show(int number);
}
