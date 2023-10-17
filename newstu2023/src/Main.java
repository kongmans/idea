public class Main {
    public static void main(String[] args) {
        var h1 = new house();
        h1.run();
        h1.getVehicle();
    }
}

class Vehicle {
    public void run() {
        System.out.println("run.....");
    }

    public void getVehicle() {
        System.out.println("get a house ");
    }
}

class house extends Vehicle{
    @Override
    public void run() {
        System.out.println("de..de..de..");
    }
}