package BAB4_Encapsulation;
public class vehicle1Test {
    public static void main(String[] args){
        System.out.println("Creating a vehicle with a 10,000 kg maximumload.");
        vehicle1 vehicle = new vehicle1(10000);
        System.out.println("Add box #1 (500kg)  : " + vehicle.addBox(500));
        //System.out.println("Add load(100kg) : " + (vehicle.load=500));
        System.out.println("Add box #2 (250kg)  : " + vehicle.addBox(250));
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
        //System.out.println("Add load(100kg) : " + (vehicle.load=500));
        System.out.println("Add box #5 (300kg)  : " + vehicle.addBox(300));
        System.out.println("Vehicle load is " + vehicle.getLoad() + "kg");
    }
}
