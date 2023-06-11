package BAB5_Inheritance;
import java.util.Scanner;
public class modulBab6 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        byte pilihan;
        do {
            System.out.println("====== M E N U =======");
            System.out.println("| 1. Manusia         |");
            System.out.println("| 2. MahasiswaFILKOM |");
            System.out.println("| 3. Pekerja         |");
            System.out.println("| 4. Manager         |");
            System.out.println("| 5. Keluar          |");
            System.out.println("----------------------");
            System.out.print("Masukkan Pilihan: ");
            pilihan = io.nextByte();
            System.out.println("----------------------");
            
            switch (pilihan) {
                case 1:
                    System.out.println("Laki-Laki Telah Menikah");
                    Manusia human1 = new Manusia("Andre", true, "11264738201", true);
                    System.out.println(human1 + "\n");
                    
                    System.out.println("Perempuan Telah Menikah");
                    Manusia human2 = new Manusia("Raina", false, "1213749392", true);
                    System.out.println(human2 + "\n");
                    
                    System.out.println("Belum Menikah");
                    Manusia human3 = new Manusia("Askara",true,  "1112483903", false);
                    System.out.println(human3 + "\n");
                    break;
   
                case 2:
                    System.out.println("IPK < 3");
                    MahasiswaFILKOM mhsfilkom1 = new MahasiswaFILKOM("Dodit Saputra", "7763749251", true, false, "215150401111037", 2.7);
                    System.out.println(mhsfilkom1 + "\n");
                    
                    System.out.println("IPK 3 - 3.5");
                    MahasiswaFILKOM mhsfilkom2 = new MahasiswaFILKOM("Gabriella Anita", "7758459383", false, false, "225150301111012", 3.4);
                    System.out.println(mhsfilkom2 + "\n");
                    
                    System.out.println("IPK 3.5 - 4");
                    MahasiswaFILKOM mhsfilkom3 = new MahasiswaFILKOM("Paramitha Dewi", "8885467832", false, false, "225150401111009", 4.0);
                    System.out.println(mhsfilkom3 + "\n");
                    break;
                    
                case 3:
                    System.out.println("Lama Bekerja 2 Tahun, 2 Anak");
                    Pekerja orang1 = new Pekerja("Gyanendra Kala", true, "2544536729", true, 1500, 2, 3, 4, 2016);
                    System.out.println(orang1 + "\n");
                    
                    System.out.println("Lama Bekerja 9 Tahun");
                    Pekerja orang2 = new Pekerja("Rini",false,  "5432910312", false, 2000, 0, 2, 4, 1999);
                    System.out.println(orang2 + "\n");
                    
                    System.out.println("Lama Bekerja 20 Tahun, 10 Anak");
                    Pekerja orang3 = new Pekerja("Bob", true, "9251235437", true, 2500, 10, 1, 4, 2000);
                    System.out.println(orang3 + "\n");
                    break;
                
                case 4:
                    System.out.println("Lama Bekerja 15 Tahun, gaji $7500");
                    Managerr manager1 = new Managerr("Hanggara Putra", true, "8218965214", true, 7500, 1, 4, 2003, 0,"Marketing");
                    System.out.println(manager1 + "\n");
                    break;

                case 5:
                    System.out.println("========== Terima Kasih ==========");
                    System.exit(0);
                    break;

                default:
                    System.out.println("----- !!! Pilihan Tidak Terdaftar !!! ------");
                    System.out.println("--- !!! Silakan Mulai Ulang Program !!! ---");
                    System.exit(0);
                    break;
                }
            } while (pilihan != 5);
                io.close();
    }
}