public class M3l3act2 {

    public static void main(String[] args) {

        Animal animal = new Animal("Tiger", 5);
        Dog dog = new Dog("Rocky", 4, "Golden Retriever");
        Cat cat = new Cat("Misty", 2, false);

        System.out.println("Animal Details");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        animal.makeSound();

        System.out.println();

        System.out.println("Dog Details");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        dog.makeSound();

        System.out.println();

        System.out.println("Cat Details");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Indoor: " + cat.isIndoor());
        cat.makeSound();
    }
}
