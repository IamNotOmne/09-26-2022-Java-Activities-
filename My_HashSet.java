import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class My_HashSet {
    public static void main(String[]args){
        Character userChoice;
        try (Scanner input = new Scanner(System.in)) {
            Set<Integer> integers = new HashSet<Integer>();
            while (true) {
                displaySelect();

                userChoice = input.next().charAt(0);
                userChoice = Character.toUpperCase(userChoice);
                switch (userChoice) {
                    case 'A':
                        System.out.println();
                        System.out.print("Add a number: ");
                        int addedNum = input.nextInt();
                        System.out.println("");

                        if (addedNum < 0) {
                           System.out.println("Error!!!! Input positive number!");
                        }
                        else if(integers.contains(addedNum)){
                            System.out.println("The number already existed. The number is not added ");
                            break;
                        }
                         else {
                            integers.add(addedNum);
                            System.out.println("The Number" + addedNum + " is successfully added to the HashSet!" );
                            break;
                        }

                    case 'B':
                        System.out.println(" ");
                        System.out.print("Number you want to remove from the HashSet: ");
                        int removedNum = input.nextInt();

                        if (integers.contains(removedNum)) {
                            integers.remove(Integer.valueOf(removedNum));
                            System.out.println(
                                    "The number " + removedNum + " is successfully removed from the hashset!");
                            System.out.println("");
                            break;
                        }

                    case 'C':
                        System.out.println(" ");
                        System.out.println("The numbers/number in your HashSet: ");
                        System.out.println("-------------------");
                        System.out.println(integers);
                        System.out.println("--------------------");
                        break;

                    case 'D':
                        System.out.println("Do you want to clear your HashSet?");
                        System.out.print("Type Y for yes and N for no: ");
                        String yesNo =input.next();

                        if (yesNo.equalsIgnoreCase("Y")) {
                            integers.clear();
                            System.out.println("---------------------------");
                            System.out.println("You cleared your HashSet");
                            System.out.println("----------------------------");
                            break;
                        } else {
                            System.out.println("-------------------------------");
                            System.out.println("You didn't clear your HashSet");
                            System.out.println("-------------------------------");
                            break;
                        }
                        

                    case 'E':
                    input.close();
                        System.out.println("Thank you for using the program.");
                        System.exit(0);

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
        System.out.println();
        System.out.print("Select your choice: ");

    }
    }

