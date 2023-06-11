package BAB8_AbstractClass;
public class abstract_car extends abstract_vehicle {
// buat variabel owner yang bertipe data Owner
  abstract_owner owner;

  abstract_car(abstract_owner owner, String name, int year, double rpm) {
    super(name, year, rpm);
    this.owner = owner;
  }

  public void drive() {
    System.out.println("Car name\t: " + super.getNama());
    System.out.println("Car owner\t: " + this.owner.getName());
    System.out.println("Output year\t: " + super.getTahun());
    System.out.println("RPM\t\t: " + super.getRpm());
  }
}