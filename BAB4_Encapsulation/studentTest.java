package BAB4_Encapsulation;
public class studentTest {
    public static void main(String[] args){
        student s1 = new student();
        s1.setName("Enkapsulasi");
        s1.setMark(90);
        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
        System.out.println("name dan mark "+s1.getName()+" "+s1.getMark());
    }
}
