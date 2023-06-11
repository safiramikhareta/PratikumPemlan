package BAB4_Encapsulation;
import java.util.Scanner;
public class refswalayan {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        refcustomer [] pelanggan = new refcustomer [3];

        refcustomer pelanggan1 = new refcustomer("Elmanuel", "3811111111", 3000000, true, "1111");
        refcustomer pelanggan2 = new refcustomer("Margantara", "5622222222", 5000000, true, "2222");
        refcustomer pelanggan3 = new refcustomer("Clarissa Santoso", "7433333333", 9000000, true, "3333");
        
        pelanggan[0] = pelanggan1;
        pelanggan[1] = pelanggan2;
        pelanggan[2] = pelanggan3;

        for(int a = 0; a<pelanggan.length; a++){
            if(pelanggan[a].getNomorAkun().substring(0,2).equals("38")){
                pelanggan[a].setTipeMember("SILVER");
            }
            else if(pelanggan[a].getNomorAkun().substring(0,2).equals("56")){
                pelanggan[a].setTipeMember("GOLD");
            }
            else if(pelanggan[a].getNomorAkun().substring(0,2).equals("74")){
                pelanggan[a].setTipeMember("PLATINUM");
            }
        }

        int numAccess = 0;
        boolean kondisi = true;
        String nama, nomor, pin;
        for(int a = 0; a<pelanggan.length; a++){
            System.out.println("=========================================");
            System.out.println("Selamat Datang di Swalayan Tiny!");
            System.out.println("=========================================");
            System.out.print("Masukkan Nama Anda: ");
            nama = io.nextLine();

            for(int j = 0; j<pelanggan.length; j++){
                if(pelanggan[j].getNamaPelanggan().equalsIgnoreCase(nama)){
                    if(pelanggan[j].getIsAccess()){
                        System.out.print("Masukkan Nomor Akun Pelanggan: ");
                        nomor = io.nextLine();
                        System.out.print("Masukkan PIN: ");
                        pin = io.nextLine();

                        if(pelanggan[j].getNomorAkun().equals(nomor)){
                        if(pelanggan[j].getPin().equals(pin)){
                            while(kondisi){
                                int menu;
                                System.out.println("-----------------------------------------");
                                System.out.println("MENU TRANSAKSI SWALAYAN TINY");
                                System.out.println("-----------------------------------------");
                                System.out.println("1. Pembelian");
                                System.out.println("2. Top-Up");
                                System.out.println("3. Cek Saldo");
                                System.out.println("4. Keluar");
                                System.out.print("Pilih Menu: ");
                                menu = io.nextInt();
                                switch(menu){
                                    case 1:
                                        String namaBarang;
                                        int hargaBarang;
                                        System.out.print("Nama Barang: ");
                                        io.nextLine();
                                        namaBarang = io.nextLine();
                                        System.out.print("Harga Barang: ");
                                        hargaBarang = io.nextInt();
                                        int newBalance = 0, diskon = 0, cashback = 0;
                                        if(pelanggan[j].getBalance()<10000){
                                            System.out.println("Saldo kurang! silakan Top-Up");
                                        }else{
                                            if(hargaBarang>=1000000){
                                                if(pelanggan[j].getTipeMember().equalsIgnoreCase("SILVER")){
                                                    diskon = (int)(hargaBarang * 0.05);
                                                    newBalance = pelanggan[j].getBalance() - (hargaBarang - diskon);
                                                }else if(pelanggan[j].getTipeMember().equalsIgnoreCase("GOLD")){
                                                        diskon = (int)(hargaBarang * 0.07);
                                                        cashback = (int)(hargaBarang * 0.02);
                                                        newBalance = pelanggan[j].getBalance() - (hargaBarang - diskon) + cashback;
                                                }else if(pelanggan[j].getTipeMember().equalsIgnoreCase("PLATINUM")){
                                                        diskon = (int)(hargaBarang * 0.1);
                                                        cashback = (int)(hargaBarang * 0.05);
                                                        newBalance = pelanggan[j].getBalance() - (hargaBarang - diskon) + cashback;
                                                }else{
                                                        newBalance = pelanggan[j].getBalance() - hargaBarang;
                                                }
                                            }
                                                pelanggan[j].setBalance(newBalance);
                                                System.out.println("-------- Rekap Transaksi --------");
                                                System.out.println("Barang yang dibeli: " + namaBarang);
                                                System.out.println("Harga Barang: " + hargaBarang);
                                                System.out.println("Transaksi Berhasil");
                                                System.out.println();
                                                break;
                                            }
                                                case 2:
                                                int nominalTopUp;
                                                System.out.print("Nominal Top-Up: ");
                                                nominalTopUp = io.nextInt();
                                                pelanggan[j].setBalance(pelanggan[j].getBalance() + nominalTopUp);
                                                System.out.println("Anda Berhasil Top-Up");
                                                System.out.println("Saldo Anda sekarang: " + pelanggan[j].getBalance());
                                                System.out.println();
                                                break;
                                                case 3:
                                                    System.out.println("Saldo Anda: " + pelanggan[j].getBalance());
                                                    System.out.println();
                                                    break;
                                                    default:
                                                    System.out.println("Terima Kasih Telah Mengunjungi Swalayan Tiny!");
                                                    System.exit(0);
                                                }
                                            }
                                        }
                                        else{
                                            numAccess++;
                                            System.out.println("Nomor Akun Pelanggan yang Anda masukkan salah! Silakan input ulang.");
                                            System.out.println("Jika nomor akun pelanggan yang diinput salah, maka akun akan diblokir!!!");
                                            //System.out.println();
                                            if(numAccess >= 3){
                                                pelanggan[j].setIsAccess(false);
                                                System.out.println("AKUN ANDA DIBLOKIR");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!kondisi){
                        System.exit(0);
                    }
                    io.close();
    }
}