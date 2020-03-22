import Bird.*;

import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) {
        ArrayList <Vertebrata> animals = new ArrayList<>();
        addAnimals (animals);
        for (Vertebrata animal : animals){
            animal.voice();
        }
    }

    public static void addAnimals (ArrayList<Vertebrata> animals)
    {
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Beefs());
        animals.add(new Sparrow());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Beefs());
        animals.add(new Sparrow());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Beefs());
        animals.add(new Sparrow());

    }

}
