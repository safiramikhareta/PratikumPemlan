package BAB7_Polymorphism;
import PratikumTugas.poly1_Kue;
import PratikumTugas.poly1_KueJadi;
import PratikumTugas.poly1_KuePesanan;
public class poly1_MainKue {
    public static void main(String[] args){
        poly1_Kue[] kueku = new poly1_Kue[20];
        //kue pesanan
        kueku[0] = new poly1_KuePesanan("Mille crepes Strawberry", 20000 , 4);
        kueku[1] = new poly1_KuePesanan("Strawberry shortcake slice", 30000, 6);
        kueku[2] = new poly1_KuePesanan("Cake Black Forest", 50000, 6);
        kueku[3] = new poly1_KuePesanan("Cake Yellow Manggo", 60000, 6);
        kueku[4] = new poly1_KuePesanan("Cheese cake slice", 30000, 6);
        kueku[5] = new poly1_KuePesanan("Mille crepes melon", 20000, 4);
        kueku[6] = new poly1_KuePesanan("Banana cake", 45000, 8);
        kueku[7] = new poly1_KuePesanan("Rainbow cake", 85000, 8);
        kueku[8] = new poly1_KuePesanan("Mille crepes matcha", 25000, 4);
        kueku[9] = new poly1_KuePesanan("Mille crepes milo", 20000, 4);
        //kuejadi
        kueku[10] = new poly1_KueJadi("Lemon cake", 65000, 7);
        kueku[11] = new poly1_KueJadi("Chocolate sponge cake", 55000, 5);
        kueku[12] = new poly1_KueJadi("Blueberry shortcake slice", 35000, 6);
        kueku[13] = new poly1_KueJadi("Lava cake", 20000, 6);
        kueku[14] = new poly1_KueJadi("Lapis legit", 30000, 6);
        kueku[15] = new poly1_KueJadi("Tiramisu cake", 65000, 7);
        kueku[16] = new poly1_KueJadi("Chocolate muffin", 15000, 3);
        kueku[17] = new poly1_KueJadi("Banana roll", 55000, 5);
        kueku[18] = new poly1_KueJadi("Matcha chocolate cake", 95000, 7);
        kueku[19] = new poly1_KueJadi("Apple cake", 95000, 8);

        System.out.println("---------- ORDERAN KUE ----------");
        System.out.println();
        for(int i = 0; i < 20; i++){
            if(i==20){
                System.out.println("Kue gaada bos");
                System.out.println();
            }
            System.out.println(kueku[i].toString());
            System.out.println();
        }
            double hargaTotal = 0;
            for(int i = 0; i < 20; i++){
                hargaTotal += kueku[i].hitungHarga();
            }
            double hargaK = 0;
            double beratK = 0;
            for(int i = 0; i < 10; i++){
                hargaK += kueku[i].hitungHarga();
                if(kueku[i] instanceof poly1_KuePesanan){
                    poly1_KuePesanan pesanKue = (poly1_KuePesanan) kueku[i];
                    beratK += pesanKue.getBerat();
                }
            }
            double hargaU = 0;
            double jumlahU = 0;
            for(int i = 10; i < 20; i++){
                hargaU += kueku[i].hitungHarga();
                if(kueku[i] instanceof poly1_KueJadi){
                    poly1_KueJadi kueJadi = (poly1_KueJadi) kueku[i];
                    jumlahU += kueJadi.getJumlah();
                }
            }
            double harga[] = new double[20];
            for(int i = 0; i < 20; i++){
                harga[i] = kueku[i].hitungHarga();
            }
            String termahal = "";            
            double tertinggi = getTertinggi(harga);
            for(int j = 0; j < 20; j++){
                if(kueku[j].hitungHarga() == tertinggi){
                    termahal = kueku[j].getNama();
                }
            }
            System.out.println("============================================");
            System.out.println("Total Harga Kue\t\t: Rp. " + hargaTotal);
            System.out.println("Total Harga Kue Pesanan\t: Rp. " + hargaK);
            System.out.println("Total Berat Kue Pesanan\t: " + beratK + " gram");
            System.out.println("Total Harga Kue Jadi\t: Rp. " + hargaU);
            System.out.println("Total Jumlah Kue Jadi\t: " + jumlahU + " kue");
            System.out.println("Kue Termahal\t\t: " + termahal);
            System.out.println("============================================");
    }
            public static double getTertinggi(double[] inputArray){
                double nilaiTertinggi = inputArray[0];
                for(int i = 1; i < inputArray.length;i++){
                    if(inputArray[i] > nilaiTertinggi){
                        nilaiTertinggi = inputArray[i];
                    }
                }
                return nilaiTertinggi;
            }
}