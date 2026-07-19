public class Cat extends Animal {

    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
