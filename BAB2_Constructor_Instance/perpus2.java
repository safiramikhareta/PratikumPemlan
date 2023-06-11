package BAB2_Constructor_Instance;
import java.util.Arrays;

public class perpus2
{
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String sinopsis;
    private String[] penulisbanyak; 

public perpus2()
{

}

public perpus2(String category, String writer, String title, String language, String publish, String edition, int page, String synopsis)
{
    kategori = category;
    penulis = writer;
    judul = title;
    bahasa = language;
    penerbitan = publish;
    edisi = edition;
    halaman = page;
    sinopsis = synopsis;
}

public String[] getpenulisbanyak() 
{
    return penulisbanyak;
}

public void setPenulisbanyak(String[] s) 
{
    this.penulisbanyak = s;
}

public void setKategori(String k) 
{
    kategori = k;
}

public void setPenulis(String p) 
{
    penulis = p;
}

public void setJudul(String j) 
{
    judul = j;
}

public void setPenerbitan(String terbit) 
{
    penerbitan = terbit;
}

public void setEdisi(String e) 
{
    edisi = e;
}

public void setHalaman(int hal) 
{
    halaman = hal;
}

public void setBahasa(String b) 
{
    bahasa = b;
}

public void setSinopsis(String sinop)
{
    sinopsis = sinop;
}

//method hitung jumlah kata
public static int hitungKata(String sinopsis) 
{
    if (sinopsis == null || sinopsis.isEmpty()) 
    {
        return 0;
    }
    
    String[] kata = sinopsis.split("\\s+");
    return kata.length;
}

//method cek tingkat kesamaan
public double cekTingkatKesamaan(perpus2 objek) 
{
    int kesamaanAtribut = 0;
    int totalAtribut = 0;

    if (Arrays.equals(this.penulisbanyak, objek.penulisbanyak)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.kategori.equals(objek.kategori)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.penulis.equals(objek.penulis)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.judul.equals(objek.judul)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.bahasa.equals(objek.bahasa)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.penerbitan.equals(objek.penerbitan)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.edisi.equals(objek.edisi)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.halaman == objek.halaman) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.sinopsis.equals(objek.sinopsis)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    double persenKesamaan = 0;
    persenKesamaan = ((double) kesamaanAtribut / totalAtribut) * 100;
    return persenKesamaan;
}

public void displayMessage() 
{
    System.out.println(judul);
    System.out.println("Informasi Buku: ");
    System.out.println("Kategori : " + kategori);
    if (this.penulisbanyak == null) 
    {
        System.out.println("Penulis : " + penulis);
    } 
    else 
    {
        System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]", ""));
    }
    System.out.println("Penerbitan : " + penerbitan);
    System.out.println("Edisi : " + edisi);
    System.out.println("Jumlah Halaman : " + halaman);
    System.out.println("Bahasa : " + bahasa);
    System.out.println("Sinopsis : " + sinopsis);
    System.out.println("Jumlah Kata Sinopsis : " + hitungKata(sinopsis));
}
}