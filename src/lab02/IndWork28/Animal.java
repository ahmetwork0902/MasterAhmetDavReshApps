package lab02.IndWork28;

class Animal {
    private String name;
    private int age;
    // Конструктор для создания объектов класса Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Метод для отображения имя животного
    public String getName() {
        return name;
    }
    // Метод для отображения возраста животного
    public int getAge() {
        return age;
    }
    // Метод отображающий звук, издаваемого животным
    public void makeSound() {
        System.out.println("Звуки животного!!!");
    }
}
