
/*
class responsible for keep the track of students , fees , name , id , grade ;

 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Create new Student object by initializing .]
     * fees for school is $30000 per year
     *
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id , String name ,int grade  ){
            this.feesPaid = 0;
            this.feesTotal = 30000;
            this.id = id;
            this.name = name;
            this.grade = grade;
    }

    /**
     * @param grade new grade  of student;
     *
     */

    public void setGrade (int grade){
        this.grade = grade;
    }

    /**
     * @param fees new grade  of student;
     *
     */

    public  void payFees ( int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId(){
        return id;
    }
    public int getGrade(){
        return grade;
    }
    public String getName(){
        return name;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     * GET remain fees selected amount
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
    @Override
    public String toString(){
        return "Student's name :" + name +
                " Total fee's paid: $" + feesPaid;
    }


}
