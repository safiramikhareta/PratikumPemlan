package BAB6_ArrayList;
import java.util.Scanner;
public class MainMhs {
    public static void main(String[] args) {
      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));
      
      // Lakukan modifikasi data tambah mahasiswa ...
      Mahasiswa mhs3 = new Mahasiswa("Gyanendra Kala", "Sistem Informasi", false);
      Mahasiswa mhs4 = new Mahasiswa("Gyaneeka Indira", "Teknik Informatika", true);
      DataMahasiswa.tambahMahasiswa(mhs3);
      DataMahasiswa.tambahMahasiswa(mhs4);
      
      // Method tampilSemuaData
      DataMahasiswa.tampilSemuaData();
      
      // Method cariMahasiswa (jika data ada)
      DataMahasiswa.cariMahasiswa("Grenda Jamaludin");
      
      // Method cariMahasiswa (jika data tidak ada)
      DataMahasiswa.cariMahasiswa("Grenda Jamaludi");

      // Method tampilMahasiswa (sebelum diupdate)
      System.out.println("===== Informasi Mahasiswa =====");
      DataMahasiswa.tampilMahasiswa(mhs3);

      // Method tampilMahasiswa (setelah diupdate)
      Scanner io = new Scanner(System.in);
      String updateNama, updateJurusan;
      boolean updateStatus;

      System.out.println("===== Input Informasi Mahasiswa Terbaru =====");
      System.out.print("Nama Mahasiswa  : ");
      updateNama = io.nextLine();
      System.out.print("Jurusan         : ");
      updateJurusan = io.nextLine();
      System.out.print("Status          : ");
      updateStatus = io.nextBoolean();
      System.out.println(" ");
      
      DataMahasiswa.updateMahasiswa(updateNama, updateJurusan, updateStatus, mhs3);
      System.out.println("===== Informasi Mahasiswa Terbaru =====");
      DataMahasiswa.tampilMahasiswa(mhs3);
      io.close();
    }
}