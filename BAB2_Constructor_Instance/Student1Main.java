package BAB2_Constructor_Instance;
public class Student1Main {
    public static void main(String[] args) {
        Student1 clara = new Student1("Clara", "Malang", 19, 90, 95, 85);
        clara.displayMessage();
        System.out.println("===================");
        Student1 bara = new Student1("Bara", "Pati", 19, 50, 65, 60);
        bara.displayMessage();

        System.out.println("===================");
        Student1 anna = new Student1();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("===================");
        Student1 chris = new Student1("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student1("Anna", "Batu", 18);
        anna.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        Student1.jumlahObjek();
    }
}