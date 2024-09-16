package Modul_10;

public class Student implements Learner{

    protected final static int NUM_OF_TESTS = 3; 
    protected String name;
    protected int[] test;
    protected String courseGrade;
    
    public Student(){
        this("No Name");
    }
    public Student(String studentName){
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "****";
    }
    @Override
    public String getCourseGrade(){
        return courseGrade;
    }
    public String getName(){
        return name;
    }
    public int[] getTestScore(){
        return test;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTestScore(int testNumber , int score){
       test[testNumber-1] = score;
    }   
}
