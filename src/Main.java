import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teachers> teachersTeam = new ArrayList<>();
        List<Student> studentsTeam = new ArrayList<>();

        Teachers lizzy = new Teachers(1 , "Lizzy" , 500);
        Teachers collin = new Teachers(2 , "Collin" , 700);
        Teachers mike = new Teachers(3 , "Mike" , 650);

        teachersTeam.add(lizzy);
        teachersTeam.add(collin);
        teachersTeam.add(mike);

        Student kim = new Student(01 , "Kim" , 5 );
        Student lim = new Student(02 , "Lim" , 3);
        Student lee = new Student(03 , "Lee" , 4);

        studentsTeam.add(kim);
        studentsTeam.add(lim);
        studentsTeam.add(lee);

        School xSchool = new School( teachersTeam , studentsTeam);



        kim.payFees(1000);
        lim.payFees(5000);
        lee.payFees(3500);

        System.out.println("Earned money: $"+xSchool.getTotalMoneyEarned());
        System.out.println("Salary payments: ");
        lizzy.receivePayments(lizzy.getSalary());
        collin.receivePayments(collin.getSalary());
        mike.receivePayments(mike.getSalary());
        System.out.println("Spent money: $"+xSchool.getTotalMoneyEarned());
        System.out.println(kim);
        System.out.println(lim);
        System.out.println(lee);
        System.out.println("");
        System.out.println(lizzy);
        System.out.println(collin);
        System.out.println(mike);
    }
}