package lab02;

//Имя класса IndWork24 подразумевает название Person по заданию
public class IndWork24 {
    private String name;
    private int age;
    private String gender;

    public IndWork24(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    //Пример использования класса Person:
    public static void main(String[] args) {
        IndWork24 person = new IndWork24("Ахмет", 24, "Мужской");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());

        person.setAge(30);
        System.out.println("Новый возраст: " + person.getAge());
    }
}
