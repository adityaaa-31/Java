
import java.util.Scanner;

import SY.*;
import TY.*;


class studentMarks{

    int rollno;
    float tyTotal, syTotal, gradeTotal, per;

    String name, grade;


    void getStudent(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the roll no and name: ");

       
        rollno = sc.nextInt();
        name = sc.next();



    }

}


public class studentpackcage {
   


        public static void main(String args[]){

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of students");
        n = sc.nextInt();   

        studentMarks stm[] = new studentMarks[n];
        tyMarks ty[] = new tyMarks[n];
        syMarks sy[] = new syMarks[n];
        //studentpackcage st[] = new studentpackcage[n];

            for(int i = 0; i < n; i++){


                stm[i] = new studentMarks();
                
                sy[i] = new syMarks();
                
                ty[i] = new tyMarks();

                
                stm[i].getStudent();
                sy[i].getSY();
                ty[i].getTY();


                stm[i].syTotal = sy[i].computerTotal + sy[i].mathsTotal + sy[i].electronicsTotal;
                stm[i].tyTotal = ty[i].Theory + ty[i].Practicals;

                stm[i].gradeTotal = stm[i].syTotal + stm[i].tyTotal;
                
                stm[i].per = (stm[i].gradeTotal/1300)*100;

                if(stm[i].per >= 70)
                    stm[i].grade = "A";

                else if(stm[i].per >= 60)
                    stm[i].grade = "B";

                else if(stm[i].per >= 50)
                    stm[i].grade = "C";

                else if(stm[i].per >= 40)
                    stm[i].grade = "D";

                else
                    stm[i].grade = "fail"; 


            //for ends

            }
          

          System.out.println("Roll No\tName\tSyTotal\tTytotal\tPercentage\tGrade");

        for(int i = 0; i < n; i++){

            System.out.println(stm[i].rollno+"\t"+stm[i].name+"\t"+stm[i].syTotal+"\t"+stm[i].tyTotal+"\t"+stm[i].per+"\t"+stm[i].grade+"\t");

        }

    }
}

