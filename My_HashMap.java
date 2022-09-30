import java.util.HashMap;
import java.util.Scanner;
public class My_HashMap {
    public static void main(String[]args){
        Character userChoice;
        try (Scanner input = new Scanner(System.in)) {
            HashMap<Integer, Integer> Integers = new HashMap<Integer, Integer>();
            while(true){
                displaySelect();
                userChoice = input.next().charAt(0);
                userChoice = Character.toUpperCase(userChoice);
                switch (userChoice){
                    case 'A':
                        System.out.println("Add composite Numbers only!");
                        System.out.print("Add Number: ");
                        int addedNum = input.nextInt();

                        int j = addedNum/2;
                        int PrimeNum = 0;

                        if(addedNum == 0 || addedNum == 1){
                            System.out.print("Enter key for the number you want to add: ");
                            int key = input.nextInt();
                            Integers.put(key,addedNum);
                            System.out.println("Num" + key + "=>" + addedNum + " Successfully added to the HashMap");
                        }
                        else{
                            for(int i =2; i <= j; i++){
                                if(addedNum%i == 0){
                                    System.out.print("Enter key for the number you want to add: ");
                                    int key = input.nextInt();
                                    Integers.put(key, addedNum);
                                    System.out.println("Num"+ key + "=>" + addedNum + " is successfully added to HashMap");
                                    PrimeNum = 1;
                                    break;
                                }
                            }
                        }
                        if(PrimeNum == 0){
                            System.out.println("You input a prime number. It is not added in the HashMap");
                            System.out.println("");
                        }
                        break;
                        
                    case 'B':
                        System.out.println("Number you want to remove: ");
                        int removedNum = input.nextInt();
                        System.out.println("");

                        if(Integers.containsKey(removedNum)){
                            System.out.println(removedNum + " =>" + Integers.get(removedNum) + " is removed!");
                        }
                        break;

                    case 'C':
                    System.out.println(" ");
                    System.out.println("The numbers/number in your HashMap: ");
                    System.out.println("-------------------");
                   System.out.println(Integers);
                    System.out.println("--------------------");
                    break;
                    
                    case 'D':
                    System.out.println("Do you want to clear your HashMap?");
                    System.out.print("Type Y for yes and N for no: ");
                    String yesNo =input.next();

                    if (yesNo.equalsIgnoreCase("Y")) {
                        Integers.clear();
                        System.out.println("---------------------------");
                        System.out.println("You cleared your HashMap");
                        System.out.println("----------------------------");
                        break;
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("You didn't clear your HashMap");
                        System.out.println("-------------------------------");
                        break;
                    }

                    case 'E':
                    input.close();
                    System.out.println("Thank you for using the program.");
                    System.exit(0);
                    break;

                    default:
                        System.out.println("Please input a proper choices in the program!");

                }
            }
        }
    }
    private static void displaySelect() {
        System.out.println("||||||||||||||||||||||||||||||");
        System.out.println("A. Add Numbers");
        System.out.println("B. Remove Numbers");
        System.out.println("C. Display Numbers");
        System.out.println("D. Clear Numbers");
        System.out.println("E. Exit");
        System.out.println("||||||||||||||||||||||||||||||||");
        System.out.println("");
        System.out.print("Select your choice: ");

    }
}
