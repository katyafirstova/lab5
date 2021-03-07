package core;

import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class WorkerFabric {
    public static Worker create(String name, float x, Integer y, Integer salary,
                                LocalDate startDate, Date endDate, Status status, float height, Integer weight,
                                Color hairColor) {
        Coordinates coordinates = new Coordinates(x, y);
        Person person = new Person(height, weight, hairColor);
        Worker worker = new Worker(name, coordinates, salary, startDate, endDate, status, person);
        return worker;
    }
}
