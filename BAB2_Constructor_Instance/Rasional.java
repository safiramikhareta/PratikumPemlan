package BAB2_Constructor_Instance;
public class Rasional {
    private int pembilang, penyebut, a, b;
    public Rasional(){
        pembilang = 0;
        penyebut = 0;
        a = pembilang;
        b = penyebut;
    }
    public Rasional(int pbl, int pyb){
        pembilang = pbl;
        penyebut = pyb;
        a = pembilang;
        b = penyebut;
    }
    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);   
    }
    //menyederhanakan bilangan rasional pakai for
    public void Sederhana() {
        if (penyebut == 0) {
            return;
        }
        int A = Math.max(pembilang, penyebut);
        int B = Math.min(pembilang, penyebut);
        for (int temp = A % B; temp != 0; temp = A % B) {
            A = B;
            B = temp;
        }
        pembilang /= B;
        penyebut /= B;
    }
    
    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    //operator >
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    //operator <
    public boolean lessThan (Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    //operator <=
    public boolean lessThanOrEqual (Rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    //operator >=
    public boolean moreThanOrEqual (Rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = a;
        penyebut = b;
        pembilang = - pembilang;
    }
    //operator unary +=
    public void unaryPlus(Rasional A){
        pembilang = a;
        penyebut = b;
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }
    //operator binary -
    public void kurang(Rasional A){
        pembilang = a;
        penyebut = b;
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
     //operator binary *
     public void kali(Rasional A){
        pembilang = a;
        penyebut = b;
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
    }
    //operator binary /
    public void bagi(Rasional A){
        pembilang = a;
        penyebut = b;
        pembilang = (pembilang * A.penyebut);
        penyebut *= A.pembilang;
    }
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}

//referensi menyederhanakan bilangan rasional pakai while
    /*public void Sederhana(){
        int temp, A, B;
        if (penyebut ==0){
            return;
        }
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

    while (B != 0){
        temp= A % B;
        A = B;
        B = temp;
    }

    pembilang /=A;
    penyebut /=A;
    }*/