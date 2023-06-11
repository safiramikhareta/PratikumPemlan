package BAB8_AbstractClass;
public abstract class abstract_vehicle {
  // buat variabel nama, tahun, dan rpm
  private String nama;
  private int tahun;
  private double rpm;

  public abstract_vehicle(String nama, int tahun, double rpm){
    this.nama = nama;
    this.tahun = tahun;
    this.rpm = rpm;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public String getNama(){
    return nama;
  }
  public void setTahun(int tahun){
    this.tahun = tahun;
  }
  public int getTahun(){
    return tahun;
  }
  public void setRpm(double rpm){
    this.rpm = rpm;
  }
  public double getRpm(){
    return rpm;
  }
  // buat sebuah method abstrak yang nantinya akan di override oleh class Car
  public abstract void drive();
}