package Practice_interface;

public class Vehicle implements I_Vehicles {

    public void start() {
        System.out.println("Vehicle Starts and Running.....");
    }
    @Override
    public void stop() {
        System.out.println("Engine Stopped");
    }

    @Override
    public void parts() {
        System.out.println("Vehicle Parts: Engine, Tank, ");
    }
}
