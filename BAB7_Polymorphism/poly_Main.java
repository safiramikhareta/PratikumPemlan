package BAB7_Polymorphism;
public class poly_Main {
    public static void main(String[] args){
        //poly_Employee employee = new poly_Employee();
        poly_SalaryEmployee salariedEmployee = new poly_SalaryEmployee("Daniel", "135", 800.00, 14, 2, 1992);
        poly_HourlyEmployee hourlyEmployee = new poly_HourlyEmployee("Karina", "234", 16.75, 30, 25, 3, 2000);
        poly_CommisionEmployee commissionEmployee = new poly_CommisionEmployee("Keanu", "145", 10000, .06, 2, 8, 2002);
        poly_BasePlusCommissionEmployee basePlusCommissionEmployee = new poly_BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, 2, 7, 1999);

        poly_Employee[] employees = new poly_Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
    
        System.out.println(salariedEmployee);
            if(salariedEmployee instanceof poly_SalaryEmployee){
                poly_SalaryEmployee employee = (poly_SalaryEmployee) salariedEmployee;
                if(employee.getBulan()==4){
                employee.setWeeklySalary((4 * employee.getWeeklySalary())+100000);
                System.out.printf("Bulan ini adalah ulang tahunnya.\n" + "Lahir pada " + employee.getTglLahir() + "\n" + "Gaji setelah ditambah 100000: $%,.2f\n", employee.getWeeklySalary());
                }
            }
                System.out.printf("Total Pendapatan Bulan Ini: $%,.2f\n", salariedEmployee.earnings());
   }
}