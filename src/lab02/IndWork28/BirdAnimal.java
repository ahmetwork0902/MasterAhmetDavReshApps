package lab02.IndWork28;

class BirdAnimal extends Animal {
    private boolean fly;
    // Наследуемые методы
    public BirdAnimal(String name, int age, boolean fly) {
        super(name, age);
        this.fly = fly;
    }
    // Метод звука птиц
    public void chirp() {
        System.out.println(getName() + " чирикает.");
    }
    // Метод полета у птиц
    public boolean fly() {
        return fly;
    }
}