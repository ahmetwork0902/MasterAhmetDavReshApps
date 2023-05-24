package lab02.IndWork28;

class CatAnimal extends Animal {
    private String typeEat;
    // Методы для наследования
    public CatAnimal(String name, int age, String typeEat) {
        super(name, age);
        this.typeEat = typeEat;
    }
    // Метод для звуков кошачих
    public void purr() {
        System.out.println(getName() + " мурлыкает");
    }
    // Метод отображающий тип питания для кошачих
    public String getTypeEat() {
        return typeEat;
    }
}
