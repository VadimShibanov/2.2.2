package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> listOfCars(int number) {

        List<Car> list = new ArrayList<>();

        list.add(new Car(1,"Tesla","Black"));
        list.add(new Car(2,"Ford","Green"));
        list.add(new Car(3,"Hammer","White"));
        list.add(new Car(4,"Toyota","Grey"));
        list.add(new Car(5,"Dodge","Red"));

        if (number <= 5) {
                return list.subList(0,number);
            } else
        return list.subList(0,5);
    }
}
