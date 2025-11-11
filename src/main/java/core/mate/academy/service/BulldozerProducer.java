package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer b1 = new Bulldozer();
        b1.setName("Bulldozer A");
        b1.setColor("Yellow");

        Bulldozer b2 = new Bulldozer();
        b2.setName("Bulldozer B");
        b2.setColor("Orange");

        List<Bulldozer> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        return list;
    }
}
