package BAB6_ArrayList;
public class Mahasiswa {
    private String nama;
    private String jurusan;
    private boolean status; // true=Menikah ; false=Lajang
      
    // Tambahkan constructor disini ...
    Mahasiswa(){
            
    }
    Mahasiswa(String nama, String jurusan, boolean status) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.status = status;
    }
      
    // Tambahkan method setter & getter disini ...
    public void setNama(String name){
        this.nama = name;
    }
    public String getNama(){
        return nama;
    }
    public void setJurusan(String major){
        this.jurusan = major;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setStatus(boolean status1){
        this.status = status1;
    }
    public String getStatus(){
        if(status == true){
            return "Menikah";
        }else{
            return "Lajang";
        }
    }
}