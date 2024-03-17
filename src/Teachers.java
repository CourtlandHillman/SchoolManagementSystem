/**
 * Responsible for Teacher's id , name , salary;
 */
public class Teachers {

    private  int id;
    private String name;
    private  int salary;

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

}
