package BAB5_Inheritance;
public class Managerr extends Pekerja{
    private static String departemen;

    public Managerr(String nama, boolean jenisKelamin, String NIK, boolean menikah, double gaji, int day, int month, int year, int jumlahAnak, String departemen){
        super(nama, jenisKelamin, NIK, menikah, gaji, jumlahAnak, month, day, year);
        this.departemen = departemen;
    }

    public static String getDepartemen(){
        return departemen;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Departemen: " + departemen;
    }
}