package home_work_17;

public class Cat extends Pet {
    @Override
    public void voice(){
        System.out.println("Мяу!");

    }

    String name;
    String breed;
    int age;

    // Конструктор


    public Cat(String type, double weight, String livingConditions, String name, String breed, int age) {
        super(type, weight, livingConditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
   // public void voice() {
       // System.out.println("Мяу!");


    public void run() {
        System.out.println("Go to run" + name + livingConditions + "!");
        System.out.println();



    }

    public void display() {
        super.display() ;
        System.out.println("Name: " + name + "Breed: " + breed + "Age: " + age );
        System.out.println();
    }
    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    }

