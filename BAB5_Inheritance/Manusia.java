package BAB5_Inheritance;
import static PratikumTugas.Pekerja.getGaji;
public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah;
    private double tunjangan;

    public Manusia(String nama, boolean jenisKelamin, String NIK, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = NIK;
        this.menikah = menikah;
    }

    public String getNama(){
        return nama;
    }
    public String getJenisKelamin(){
        if(jenisKelamin == true){
            return "Laki-laki";
        }else{
            return "Perempuan";
        }
    }
    public String getNIK(){
        return nik;
    }
    public String getMenikah(){
        if(menikah == true){
            return "Menikah";
        }else{
            return "Belum Menikah";
        }
    }
    public double getTunjangan(){
        if (menikah == true){
            if (jenisKelamin == true){
                if (Pekerja.getJumlahAnak() != 0){
                    tunjangan = 25 + (20 * Pekerja.getJumlahAnak());
                }else{
                    tunjangan = 25;
                }
            }else{
                if (Pekerja.getJumlahAnak() != 0) {
                    tunjangan = 20 + (20 * Pekerja.getJumlahAnak());
                }else{
                    tunjangan = 20;
                }
            }
        }else{
            tunjangan = 15;
        }
        return tunjangan;
    } 
    public double getPendapatan(){
        if(Managerr.getDepartemen() != null){
            return getTunjangan() + Pekerja.getBonus() + Pekerja.getGaji() + (0.1 * getGaji());
        }else if(Pekerja.getGaji() !=0){
            return getTunjangan() + Pekerja.getBonus() + Pekerja.getGaji();
        }else{
            return getTunjangan();
        }
    }

    @Override
    public String toString(){
        return " Nama: " + this.nama + "\n NIK: " + this.nik + "\n Jenis Kelamin: " + getJenisKelamin() + "\n Status Menikah: " + getMenikah() + "\n Pendapatan: " + getPendapatan();
    }
}