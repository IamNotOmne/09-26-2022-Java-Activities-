import java.util.Scanner;
import java.util.ArrayList;

public class My_ArrayList {

    public static void main(String[] args) {

        Character userChoice;
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Integer> integers = new ArrayList<>();
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

                        if (addedNum > 0) {
                            integers.add(addedNum);
                            System.out.println("You successfully added " + addedNum + " to the ArrayList");
                            System.out.println(" ");
                            break;
                        } else {
                            System.out.println("please input positive numbers only");
                            break;
                        }

                    case 'B':
                        System.out.println(" ");
                        System.out.print("Number you want to remove from the ArrayList: ");
                        int removedNum = input.nextInt();

                        if (integers.contains(removedNum)) {
                            integers.remove(Integer.valueOf(removedNum));
                            System.out.println(
                                    "The number " + removedNum + " is successfully removed from the arraylist!");
                            System.out.println("");
                            break;
                        }

                    case 'C':
                        System.out.println(" ");
                        System.out.print("These are the number in your ArrayList: ");
                        System.out.println("");
                        System.out.println(integers);
                        System.out.println("");
                        break;

                    case 'D':
                        System.out.println("Do you want to clear your ArrayList?");
                        System.out.print("Type Y for yes and N for no: ");
                        String yesNo =input.next();

                        if (yesNo.equals("Y")) {
                            integers.clear();
                            System.out.println("---------------------------");
                            System.out.println("You cleared your ArrayList");
                            System.out.println("----------------------------");
                            break;
                        } else {
                            System.out.println("-------------------------------");
                            System.out.println("You didn't clear your ArrayList");
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