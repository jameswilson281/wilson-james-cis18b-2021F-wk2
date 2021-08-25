package wilson.james;

import animal.Animal;
import animal.carnivore.Lion;
import animal.herbivore.Giraffe;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Giraffe()};
        Scanner scanner = new Scanner(System.in);

        System.out.println(MessageFormat.format("There are {0} animals in the array", animals.length) );
        System.out.println("Enter a number to ask one to speak!");
        System.out.println();

        int index = scanner.nextInt();

        try {
            System.out.println(animals[index].getName());
        }
        catch(Exception ex)
        {
            System.out.println("You entered an invalid number!");
        }
        finally
        {
            System.out.println("Goodbye!");
        }


    }
}
