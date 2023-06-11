package BAB7_Polymorphism;
public class poly_CommisionEmployee extends poly_Employee{
    private double grossSales;  //penjualan per minggu
    private double commissionRate; //komisi

    public poly_CommisionEmployee(String name, String noKTP, double sales, double rate, int tanggal, int bulan, int tahun){
        super(name, noKTP, tanggal, bulan, tahun);
        setGrossSales(sales);
        setCommisionRate(rate);
    }

    public void setGrossSales(double sales){
        grossSales = sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommisionRate(double rate){
        commissionRate = rate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    public String toString(){
        return String.format("Commision employee: " + super.toString() + "\nGross sales: " + getGrossSales() + "\nCommission rate: " + getCommissionRate());
    }
}