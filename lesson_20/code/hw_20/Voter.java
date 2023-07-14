package hw_20;

public class Voter {

    //Задача 2.
    // Реализовать класс Избиратель (модель).
    // Обеспечить невозможность регистрации в качестве избирателя лица,
    // которому еще не исполнилось 18 лет в классе-апликации.

    //поля класса
    private String name;
    private String address;
    private int age;

    // конструктор

    public Voter(String name, String address, int age) {
        this.name = name;
        this.address = address;
        if (age >= 18) {
           this.age = age;
        } else {
            System.out.println("too young to vote");
           this.age = -1;

            return ;
        }

    }
    // геттеры и сеттеры


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age >= 18) {
            return;
        }
    }
        @Override
        public String toString () {
            return "name: " + name + ", address: " + address + ", age: " + age;

        }
    }

