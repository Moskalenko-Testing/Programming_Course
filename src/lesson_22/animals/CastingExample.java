package lesson_22.animals;

public class CastingExample {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal animal  = cat;
        Animal animal1 = new Cat();

        animal1.voice();

        System.out.println("\n====================\n");
        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
        Cat catLink;

        Animal animalLilnk = new Cat();
        catLink = (Cat) animalLilnk;

        for (int i = 0; i < animals.length; i++) {
            Animal current = animals[i];
            System.out.println("sout : " + current );


            System.out.println("current.getClass() : " + current.getClass());

            if (animals[i] instanceof Cat){
                System.out.println(i + "-й индекс можно безопасно привести к Cat");
                Cat tempCat = (Cat) animals[i];
                tempCat.eat();
            }



            System.out.println("===============\n");

        }

    }
}
