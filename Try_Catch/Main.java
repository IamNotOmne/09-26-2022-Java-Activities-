import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Artist> artists = new ArrayList<Artist>();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Input the number of artists you want to add in the list: ");
            int InputNum = input.nextInt();
            input.nextLine();

            try {
                if (InputNum > 0) {
                    for (int art = 0; art < InputNum; art++) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("List " +art);
                        System.out.print("In the list, type the artist's name: ");
                        String name = input.nextLine();
                        System.out.print("In the list, enter the name of the artist's song: ");
                        String song = input.nextLine();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        artists.add(new Artist(name,song));
                    }

                    for (int ar = 0; ar < InputNum; ar++) {
                        System.out.println("These are your lists:");
                        System.out.println("Artist: "+ artists.get(ar).getName() +" ==" + " Song: " +  artists.get(ar).getSong());

                    }
                } 
                else if (InputNum == 0){
                    input.close();
                    throw new MyException ("You cannot put zero it is not valid.");
                }
                else{
                    input.close();
                    throw new MyException ("Please don't input negative variable");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
