                                                      //STUDENT GRADE CALCULATOR

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class result {
    public static void main(String[] args) {

        int sum=0;
        int Number_subjects =0;
        try{
            Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Number of subjects
        System.out.println("Number of subjects : ");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("Subject : ");
            String Subject = reader.readLine();
            System.out.print("Mark : ");
            int mark = sc.nextInt();
            sum = sum + mark;
            Number_subjects =i;
        }
        }
        catch(Exception e){
            System.out.println("Issue solved");
        }

        // Total marks
        System.out.println("Total marks : " + sum);

        // Average percentage
        int Average = sum/(Number_subjects);
        System.out.println("Average Percentage : "+Average + "%");

        // Grades time
        if(90<Average && Average<=100){
            System.out.println("A grade");
        }
        else if(80<Average && Average<=90){
            System.out.println("B grade");
        }
        else if(70<Average && Average<=80){
            System.out.println("C grade");
        }
        else if(60<Average && Average<=70){
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail!!");
        }
    }
}
