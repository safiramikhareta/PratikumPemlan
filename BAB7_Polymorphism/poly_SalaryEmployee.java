package BAB7_Polymorphism;
public class poly_SalaryEmployee extends poly_Employee{
    private double weeklySalary; //gaji per minggu
    
    public poly_SalaryEmployee (String name, String noKTP, double salary, int tanggal, int bulan, int tahun){
        super(name, noKTP, tanggal, bulan, tahun);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        weeklySalary = salary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public double earnings(){
        return getWeeklySalary();
    }

    public String toString(){
        return String.format("Salaried employee: " + super.toString() + "\nWeekly salary: " + getWeeklySalary());
    }
}