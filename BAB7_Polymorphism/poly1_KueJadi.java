package BAB7_Polymorphism;
public class poly1_KueJadi extends poly1_Kue {
    private double jumlah;

    public poly1_KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return this.jumlah;
    }
    @Override
    public double hitungHarga(){
        return this.jumlah * super.getHarga() * 2;
    }
    @Override
    public String toString(){
        return super.toString() + "\nJumlah Kue: " + this.jumlah + "\nTotal Harga: " + hitungHarga() + "\nJenis Kue: Kue Jadi";
    }
}