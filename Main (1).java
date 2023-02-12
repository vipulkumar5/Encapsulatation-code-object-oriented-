import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        
        System.out.println("Enter your first_name : ");
        s1.first_name=sc.next();
        
        System.out.println("Enter your Last name: " );
        s1.last_name=sc.next();
        
        System.out.println("Enter your Age: ");
        s1.age=sc.nextInt();
        
        System.out.println("Enter your section:");
        s1.sec=sc.next().charAt(0);
        
        System.out.println("Enter your Roll no: ");
        s1.roll_no=sc.nextInt();
        
       // System.out.println("Enter your Gender: ");
        //s1.gender=sc.next();
        
        s1.printInfo();
    }
    
}
class Student{
    String first_name;
    String last_name;
    int age;
    int roll_no;
    char sec;
    //String gander;
    public void printInfo(){
    System.out.println("Your name is Name="+this.first_name + this.last_name);
    System.out.println("Your age is =" +this.age);
    System.out.println("Your Roll no is="+ this.roll_no);
    System.out.println("Your section is="+this.sec);
    //System.out.println("Your Gender is ="+this.gender);
    }    
    Student(){
        System.out.println("hello guys");
        
    }
    
}