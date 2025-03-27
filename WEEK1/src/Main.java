public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", 5, 6.0, 1.2, false, 2.3, true, "Hooked");
        Bird penguin = new Bird("Penguin", 3, 12.0, 1.1, false, 0.5, false, "Straight");

        Mammal dog = new Mammal("Dog", 3, 25.0, 0.6, true, "Brown", 63, 4, true);
        Mammal elephant = new Mammal("Elephant", 10, 5000.0, 3.0, false, "Gray", 660, 4, true);

        // Using Polymorphism
        Animal[] animals = {eagle, penguin, dog, elephant};

        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getName());
            animal.eat(); // Polymorphism: different implementations of eat()
            animal.moves(); // Polymorphism: overridden moves() method
            System.out.println("----------------------------");
        }

        // Using Interface
        IFlyable flyingBird = eagle;
        flyingBird.fly();
    }
}
