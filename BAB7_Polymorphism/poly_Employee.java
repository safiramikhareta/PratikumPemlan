package BAB7_Polymorphism;
public abstract class poly_Employee {
    private String name;
    private String noKTP;
    private String tglLahir;
    private int tanggal, bulan, tahun;

    public poly_Employee(String name, String noKTP, int tanggal, int bulan, int tahun){
        this.name = name;
        this.noKTP = noKTP;
        setTglLahir(tanggal, bulan, tahun);
        setBulan(bulan);
    }

    public poly_Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    public String getName(){
        return name;
    }

    public String getNoKTP(){
        return noKTP;
    }
    public String getTglLahir(){
        return tglLahir;
    }
    public int getBulan(){
        return bulan;
    }

    public void setBulan(int bulan){
        this.bulan = bulan;
    }
    public void setTglLahir(int tanggal, int bulan, int tahun){
        tglLahir = tanggal + "-" + bulan + "-" + tahun;
    }

    public String toString(){
    return String.format(" " + getName() + "\nNo. KTP: " + getNoKTP());
    }

    public abstract double earnings(); //pendapatan
}