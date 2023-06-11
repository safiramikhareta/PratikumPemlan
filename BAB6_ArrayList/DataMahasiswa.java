package BAB6_ArrayList;
import java.util.ArrayList;
public class DataMahasiswa {
    private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private static Mahasiswa mahasiswa1 = new Mahasiswa();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa orang){
        mhs.add(orang);
        return mhs;
    }

    public static void tampilSemuaData(){
    // Gunakan perulangan
        for(int i = 0; i < mhs.size(); i++){
            System.out.println("==== Tampilan Data Mahasiswa " + (i+1) + " Filkom UB ====");
            System.out.println("Nama Mahasiswa  : " + mhs.get(i).getNama());
            System.out.println("Jurusan         : " + mhs.get(i).getJurusan());
            System.out.println("Status          : " + mhs.get(i).getStatus());
            System.out.println();
        }
    }

    public static Mahasiswa cariMahasiswa(String nama){
    // Gunakan perulangan
        for(Mahasiswa mahasiswa1 : mhs){
            if(mahasiswa1.getNama().equals(nama)){
                System.out.println("Data mahasiswa atas nama " + nama + " ditemukan");
                System.out.println(" ");
                return mahasiswa1;
            }
        }
        System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan");
        System.out.println(" ");
        return mahasiswa1;
    }

    public static void tampilMahasiswa(Mahasiswa mahasiswa1){
        System.out.println("Nama Mahasiswa  : " + mahasiswa1.getNama());
        System.out.println("Jurusan         : " + mahasiswa1.getJurusan());
        System.out.println("Status          : " + mahasiswa1.getStatus());
        System.out.println();
    }

    public static void updateMahasiswa(String nama, String jurusan, boolean status, Mahasiswa baru){
        baru.setNama(nama);
        baru.setJurusan(jurusan);
        baru.setStatus(status);
    }
}