package BAB7_Polymorphism;
public abstract class poly1_Kue {
    private String nama;
    private double harga;

    public poly1_Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return this.nama;
    }
    public double getHarga(){
        return this.harga;
    }

    abstract public double hitungHarga();
    public String toString(){
        return "Nama Kue: " + this.nama + "\nHarga Kue: " + this.harga;
    }
}