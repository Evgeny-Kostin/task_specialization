import java.util.ArrayList;
import java.util.List;

public class Main {
      public static void main(String[] args){

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Hamster> hamsters = new ArrayList<>();
        List<Camel> camels = new ArrayList<>();
        List<Horse> horses = new ArrayList<>();
        
        Cat cat1 = new Cat("cat","Barsik","2019","jamp");
        Cat cat2 = new Cat("cat","Kisa","2019", "Catch");
        Dog dog1 = new Dog("dog","Syan","2020","Sit");
        Dog dog2 = new Dog("dog","Butch","2019", "To me");
        Hamster hamster1 = new Hamster("hamster","Belyash","2022","eat");
        Hamster hamster2 = new Hamster("hamster","Trufel","2022", "sleep");
        Camel camel1 = new Camel("camel","Vasya", "2010","don't spit");
        Horse horse1 = new Horse("horse", "Gnedoy", "2015","Trot");
        Horse horse2 = new Horse("horse", "Rjaka", "2016","barrier");

        cats.add(cat1);
        cats.add(cat2);
        dogs.add(dog1);
        dogs.add(dog2);
        hamsters.add(hamster1);
        hamsters.add(hamster2);
        camels.add(camel1);
        horses.add(horse1);
        horses.add(horse2);
        
        for (Cat item: cats) {
            System.out.println(item.getType()+ ": name " + item.getName() + ", birthdate " + item.getAge() + ", commands " + item.getCommand());

        }
        for (Dog item: dogs) {
            System.out.println(item.getType()+ ": name " + item.getName() + ", birthdate " + item.getAge() + ", commands " + item.getCommand());
            
        }
        for (Hamster item: hamsters) {
            System.out.println(item.getType()+ ": name " + item.getName() + ", birthdate " + item.getAge() + ", commands " + item.getCommand());
            
        }
        for(Camel item: camels){
            System.out.println(item.getType()+ ": name  " + item.getName() + ", birthday " + item.getAge() +
                    ", commands " + item.getCommand());
        }
        for(Horse item: horses){
            System.out.println(item.getType()+ ": name  " + item.getName() + ", birthday " + item.getAge() +
                    ", commands " + item.getCommand());
        }

    }
}
