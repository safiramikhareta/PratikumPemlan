package BAB7_Polymorphism;
public class poly1_KuePesanan extends poly1_Kue{
    private double berat;

    public poly1_KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat(){
        return this.berat; //berat
    }
    @Override
    public double hitungHarga(){
        return this.berat * super.getHarga();
    }
    @Override 
    public String toString(){
        return super.toString() + "\nBerat Kue: " + this.berat + "\nTotal Harga: " + hitungHarga() + "\nJenis Kue: Kue Pesanan ";
    }
}