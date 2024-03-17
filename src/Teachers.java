/**
 * Responsible for Teacher's id , name , salary;
 */
public class Teachers {

    private  int id;
    private String name;
    private  int salary;
    private int salaryEarned;

    /**
     * Teacher's constructor:
     * @param id
     * @param name
     * @param salary
     */
    public  Teachers ( int id , String name , int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds to the salary.
     * remove from total money earned to xSchool
     * @param salary
     */
    public void receivePayments(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
    @Override
    public String toString(){
        return "Teacher's name :" + name +
                " Total salary's paid: $" + salaryEarned;
    }

}
