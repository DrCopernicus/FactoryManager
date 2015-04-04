package drcopernicus.factorymanager;

import drcopernicus.factorymanager.machine.IMachine;
import drcopernicus.factorymanager.machine.MachineChest;
import drcopernicus.factorymanager.machine.MachineCobbleGen;
import drcopernicus.factorymanager.machine.MachinePump;

import java.util.ArrayList;

public class Simulator {
    public static final int NUMBER_OF_TICKS = 10;
    public ArrayList<IMachine> machines;

    public static void main(String[] args) {
        Simulator s = new Simulator();
    }

    public Simulator() {
        machines = new ArrayList<IMachine>();

        MachineCobbleGen a = new MachineCobbleGen();
        MachineChest b = new MachineChest();
        MachinePump c = new MachinePump();
        c.input = a;
        c.output = b;

        machines.add(a);
        machines.add(b);
        machines.add(c);

        for (int i = 0; i < NUMBER_OF_TICKS; i++) {
            System.out.println("Tick " + i + ": ");
            tick();
        }
    }

    private void tick() {
        for (IMachine machine : machines) {
            machine.tick();
        }
    }
}
