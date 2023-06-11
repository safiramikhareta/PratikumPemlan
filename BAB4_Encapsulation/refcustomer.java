package BAB4_Encapsulation;
class refcustomer {
    private String namaPelanggan, nomorAkun, tipeMember, pin;
    private int balance;
    private boolean isAccess;

    public refcustomer(){
        
    }
    public refcustomer(String namaPelanggan, String nomorAkun, int balance, boolean isAccess, String pin){
        this.namaPelanggan = namaPelanggan;
        this.balance = balance;
        this.nomorAkun = nomorAkun;
        this.isAccess = isAccess;
        this.pin = pin;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setNomorAkun(String nomorAkun){
        this.nomorAkun = nomorAkun;
    }
    public void setNamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    public void setTipeMember(String tipeMember){
        this.tipeMember = tipeMember;
    }
    public void setIsAccess(boolean isAccess){
        this.isAccess = isAccess;
    }
    public void setPin(String pin){
        this.pin = pin;
    }

    public int getBalance(){
        return this.balance;
    }
    public String getNomorAkun(){
        return this.nomorAkun;
    }
    public String getNamaPelanggan(){
        return this.namaPelanggan;
    }
    public String getTipeMember(){
        return this.tipeMember;
    }
    public boolean getIsAccess(){
        return this.isAccess;
    }
    public String getPin(){
        return this.pin;
    }
}