package BAB5_Inheritance;
import java.time.*;
public class Pekerja extends Manusia{
    private static double gaji;
    private static LocalDate tahunMasuk;
    private static int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String NIK, boolean menikah, double gaji, int jumlahAnak, int month, int day, int year){
        super(nama, jenisKelamin, NIK, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        tahunMasuk = LocalDate.of(year, month, day);
    }

    public static double getGaji(){
        return gaji;
    }
    public static int getJumlahAnak(){
        return jumlahAnak;
    }
    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }
    public static double getBonus(){
        LocalDate now = LocalDate.now();
        int selisih = now.getYear() - tahunMasuk.getYear();
        if(selisih>0 && selisih<5){
            return 0.05 * gaji;
        }else if(selisih>=5 && selisih<=10){
            return 0.1 * gaji;
        }else if(selisih>=10){
            return 0.15 * gaji;
        }else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\n Tahun Masuk: " + tahunMasuk + "\n Jumlah Anak: " + jumlahAnak + "\n Bonus: " + getBonus() + "\n Gaji: " + gaji;
    }
}