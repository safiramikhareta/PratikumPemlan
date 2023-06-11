package BAB8_AbstractClass;
import BAB8_AbstractClass.abstract_car;
import BAB8_AbstractClass.abstract_owner;
public class abstract_app {
  public static void main(String[] args) {
    abstract_car car1 = new abstract_car(new abstract_owner("Arsyad"), "Toyota GR Yari's", 2022, 6500);
      car1.drive();
      System.out.println();
    abstract_car car2 = new abstract_car(new abstract_owner("Ardhan"), "Jeep Wrangler", 1972, 6000); 
      car2.drive();
      System.out.println();
    abstract_car car3 = new abstract_car(new abstract_owner("Budhi"), "Mazda RX 87", 1967, 10500); 
      car3.drive();
      System.out.println();
    abstract_car car4 = new abstract_car(new abstract_owner("Galuh"), "Mercedes Benz 220", 1958, 5500); 
      car4.drive();
  }
}