package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @SuppressWarnings("unchecked")
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == null) {
            return new ArrayList<>();
        }

        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            List<Bulldozer> list = producer.get();
            return (List<T>) new ArrayList<>(list);
        }

        if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();
            List<Truck> list = producer.get();
            return (List<T>) new ArrayList<>(list);
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (machines == null || machines.isEmpty()) {
            return;
        }
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        if (machines == null || machines.isEmpty()) {
            return;
        }
        for (Machine m : machines) {
            if (m != null) {
                m.doWork();
            }
        }
    }
}
