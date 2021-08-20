package wilson.james;

import animal.Animal;
import animal.carnivore.Lion;
import animal.herbivore.Giraffe;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal giraffe = new Giraffe();

        System.out.println(lion.speak());
        System.out.println(giraffe.speak());
    }
}
