public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
    
    public void start(String mode) {
        System.out.println("Vehicle started in " + mode + " mode");
    }
    
    public void start(String mode, int speed) {
        System.out.println("Vehicle started in " + mode + " mode with speed " + speed + " mph");
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        
        vehicle.start();
        vehicle.start("Economy");
        vehicle.start("Sport", 77);
    }
}
