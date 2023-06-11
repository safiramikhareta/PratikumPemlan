package BAB8_AbstractClass;
public class abstract_owner {
    private String name;
  // buat constructor
  public abstract_owner(String name){
    this.name = name;
  }

  // buat method getter untuk mendapatkan nilai name
  public String getName(){
    return this.name;
  }
}