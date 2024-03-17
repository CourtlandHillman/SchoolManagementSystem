import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teachers> teachersList;
    private List<Student> studentList;
    private static int totalMoneyEarned;
    private  static int totalMoneySpent;

    /**
     *
     * @param teachersList
     * @param studentList
     */

    public School(List<Teachers> teachersList , List<Student> studentList){
        this.teachersList = teachersList;
        this.studentList = studentList;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Teacher's list:
     * @return
     */
    public List<Teachers> getTeachersList(){
        return teachersList;
    }
    public void addTeachers(Teachers teacher){
        teachersList.add(teacher);
    }
    public void setTeachersList(List<Teachers> teachersList){
        this.teachersList = teachersList;
    }

    /**
     * Student's list:
     * @return
     */

    public List<Student> getStudentList(){
        return studentList;
    }
    public void addStudents(Student student){
        studentList.add(student);
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }
    /**
     * totalMoneyEarned:
     *
     */
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public static void  updateTotalMoneyEarned( int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }
    /**
     * totalMoneySpent
     */
    public int getTotalMoneySpent(){
        return  totalMoneySpent;
    }
    public static  void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -= moneySpent ;
    }
}
