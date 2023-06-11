package BAB5_Inheritance;
public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk, beasiswa;

    public MahasiswaFILKOM(String nama, String NIK, boolean jenisKelamin, boolean menikah, String nim, double ipk){
        super(nama, jenisKelamin, NIK, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNIM(){
        return this.nim;
    }
    public double getIPK(){
        return this.ipk;
    }
    public String getStatus(){
        String [] status = getNIM().split("");
        if("2".equals(status[6])){
            return "Teknik Informatika 20" + String.valueOf(status[0] + status[1]);
        }
        if("3".equals(status[6])){
            return "Teknik Komputer, 20" + String.valueOf(status[0] + status[1]);
        }
        if("4".equals(status[6])){
            return "Sistem Informasi, 20" + String.valueOf(status[0] + status[1]);
        }
        if("5".equals(status[6])){
            return "Pendidikan Teknologi Informasi, 20" + String.valueOf(status[0] + status[1]);
        }
        if("6".equals(status[6])){
            return "Teknologi Informasi, 20" + String.valueOf(status[0] + status[1]);
        }
        return getStatus();
    }
    public double getBeasiswa(){
        if(3.0 < ipk && ipk <= 3.5){
            beasiswa = beasiswa + 50;
        }else if(3.5 < ipk && ipk <= 4.0){
            beasiswa = beasiswa + 75;
        }
        return beasiswa;
    }

    @Override
    public String toString(){
        return super.toString() + "\n NIM: " + this.nim + "\n IPK: " + this.ipk + "\n Prodi Angkatan: " + getStatus() + "\n Beasiswa: " + getBeasiswa();
    }
}