import ageCalculator.employee;
import ageCalculator.person;
import ageCalculator.student;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static int cd,cm,cy,bd,bm,by;
    static String nameEm,nameSt;

    public static void main(String[] args) throws ParseException {


        System.out.println("Age Calculator");
        System.out.println("Select the person : 1)Employee  2)Student");
        int n=sc.nextInt();
        System.out.println(n);

        person p=new person();
        employee e=new employee();
        student s=new student();

        //for employee
        if(n==1){
            System.out.println("number of person : ");
            int num=sc.nextInt();
            for(int i=0;i<num;i++){
                System.out.println("*****Employee " +(i+1)+" *****  ");
                System.out.print("Name of Employee : ");

                nameEm= sc.next();

                takeInput();
                System.out.println("Name : "+nameEm);
                employee.findAge(cd,cm,cy,bd,bm,by);

            }

        }
        //for student
        else{
            System.out.println("number of person : ");
            int num=sc.nextInt();
            for(int i=0;i<num;i++){
                System.out.println("**** Student " +(i+1)+" **** ");
                System.out.print("Name of Student : ");
                nameSt=sc.next();

                takeInput();

                System.out.println("Name : "+nameSt);
                student.findAge(cd,cm,cy,bd,bm,by);

            }
        }


    }
    public static void takeInput(){
        System.out.print("current_date : ");
        cd=sc.nextInt();
        System.out.print("current_month : ");
        cm=sc.nextInt();
        System.out.print("current_year : ");
        cy=sc.nextInt();
        System.out.print("Birth_date : ");
        bd=sc.nextInt();
        System.out.print("Birth_month : ");
        bm=sc.nextInt();
        System.out.print("Birth_year : ");
        by=sc.nextInt();
    }
}