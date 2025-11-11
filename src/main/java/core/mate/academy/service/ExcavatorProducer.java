package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements  MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        Excavator e1 = new Excavator();
        e1.setName("Excavator X");
        e1.setColor("Blue");
        Excavator e2 = new Excavator();
        e2.setName("Excavator Y");
        e2.setColor("Green");
        list.add(e1);
        list.add(e2);
        return list;
    }
}
