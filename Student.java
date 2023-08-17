import java.util.*;
class Demo{
    void Demo(int marks1,int marks2,int marks3,int marks4,int marks5){
        float sum=marks1+marks2+marks3+marks4+marks5;
        float percentage=(sum/500)*100;
        if(percentage>=85){
            System.out.println("Grade A ");
        }
      else if(percentage>=75 && percentage<85){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
        
        
    }
}
public class Student
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter marks for 1st subject: ");
	  int a=sc.nextInt();
	  System.out.println("Enter marks for 2nd subject: ");
	  int b=sc.nextInt();
	    System.out.println("Enter marks for 3rd subject: ");
	  int c=sc.nextInt();
	    System.out.println("Enter marks for 4th subject: ");
	  int d=sc.nextInt();
	    System.out.println("Enter marks for 5th subject: ");
	  int e=sc.nextInt();
	 Demo obj=new Demo();
	 obj.Demo(a,b,c,d,e);
	 
	  
	}
}