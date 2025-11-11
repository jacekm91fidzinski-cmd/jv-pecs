package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        Truck t1 = new Truck();
        t1.setName("Truck 1");
        t1.setColor("Red");
        Truck t2 = new Truck();
        t2.setName("Truck 2");
        t2.setColor("Black");
        list.add(t1);
        list.add(t2);
        return list;
    }
}
