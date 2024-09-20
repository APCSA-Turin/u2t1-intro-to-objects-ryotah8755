public class Student {
    private String name;
    private double gpa;

    public Student(String studentName, double grades){
        name = studentName;
        gpa = grades;
    }
    public void Nameandgoal(){
        System.out.println("Hello, my name is " + name + " , nice to meet you!");
        if(gpa >= 90.0){
            System.out.println("And I have a A! I am hard working.");
        }
        if(gpa < 90.0){
            System.out.println("And I dont have an A, I need to work harder.");
        }
        System.out.println("My current gpa is: " + gpa );
    }
}
