import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
   
    public static void main(String[] args){
        ArrayList<Object> personalInfo = new ArrayList<Object>();
        try (Scanner info = new Scanner(System.in)) {
            System.out.print("Name: " );
            String name = info.nextLine();
            System.out.print("Age: ");
            int age = info.nextInt();
            System.out.print("Address: ");
            String address = info.next();
            System.out.print("Gender: ");
            String gender = info.next();
            System.out.print("School: ");
            String school = info.next();
            
            personalInfo.add(name);
            personalInfo.add(age);
            personalInfo.add(address);
            personalInfo.add(gender);
            personalInfo.add(school);
        }
        System.out.println(personalInfo);
        
        
         }
 
}