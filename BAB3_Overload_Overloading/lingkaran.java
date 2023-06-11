package BAB3_Overload_Overloading;
public class lingkaran {
    int alas, tinggi;
    public lingkaran(int alas){
        this.alas = alas;
    }
    public lingkaran(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public lingkaran(String alasString, String tinggiString){
        this.alas = parseInt(alasString);
        this.tinggi = parseInt(tinggiString);
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double hitungLuas(){
        double hasil = (double)(getTinggi()*getAlas())/2;
        return hasil;
    }
    public int parseInt(String string){
        return Integer.parseInt(string);
    }
    public void displayMessage(){
        System.out.println("Hitung Luas : "+hitungLuas());
    }
}