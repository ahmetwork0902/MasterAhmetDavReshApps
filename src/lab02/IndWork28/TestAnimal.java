package lab02.IndWork28;

public class TestAnimal {
    public static void main(String[] args) {
        BirdAnimal myBird = new BirdAnimal("Петя", 2, true);
        CatAnimal myCat = new CatAnimal("Пушок", 3, "сухой корм");
        DogAnimal myDog = new DogAnimal("Жорик", 13, "пудель");
        // Собака
        myDog.makeSound();
        myDog.fetch();
        System.out.println("Порода собаки: " + myDog.getBreed());
        System.out.println();
        // Кошка
        myCat.makeSound();
        myCat.purr();
        System.out.println("Питание кошки: " + myCat.getTypeEat());
        System.out.println();
        // Птица
        myBird.makeSound();
        myBird.chirp();
        System.out.println("Моя птица " + (myBird.fly() ? "может" : "не может") + " летать.");
    }
}
