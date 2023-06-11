package BAB2_Constructor_Instance;
public class Student1 {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int totalObjek = 0;
    
    public static void jumlahObjek(){
        System.out.println("Jumlah objek Student yang telah dibuat: " + totalObjek);
    }
    public Student1(){
    name = "";
    address = "";
    age = 0;
    totalObjek++;
    }
    public Student1(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;
    totalObjek++;
    }
    public Student1(String n, String a, int ag, int mat, int eng, int sci){
        name = n;
        address = a;
        age = ag;
        mathGrade = mat;
        englishGrade = eng;
        scienceGrade = sci;
        totalObjek++;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        average = 0;
        average = (mathGrade+scienceGrade+englishGrade)/3;
        return average;
    }
    private boolean statusAkhir(){
        if(getAverage()>=61)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        if(statusAkhir())
        {
            System.out.println("Siswa lulus");
        }
        else
        {
            System.out.println("Siswa remidi");
        }
    }
}