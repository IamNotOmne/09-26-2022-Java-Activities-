import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hash_Set {

    public static void main(String[] args) {
        HashSet<String> personalInfo = new HashSet<String>();
        try (Scanner fave = new Scanner(System.in)) {
            System.out.print("Favorite Singer: ");
            String singer = fave.next();
            System.out.print("Favorite Drink: ");
            String drink = fave.next();
            System.out.print("Favorite Animal: ");
            String animal = fave.next();
            System.out.print("Favorite Place: ");
            String place = fave.next();
            System.out.print("Favorite Food: ");
            String food = fave.next();

            personalInfo.add(singer);
            personalInfo.add(drink);
            personalInfo.add(animal);
            personalInfo.add(place);
            personalInfo.add(food);
        }
        Iterator it = personalInfo.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}