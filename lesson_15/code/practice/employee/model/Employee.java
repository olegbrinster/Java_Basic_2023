package practice.employee.model;

public class Employee {


    //Задача 2.
    // Создать класс Работник (Employee) c полями:
    //    уникальный номер
    //    имя
    //    фамилия
    //    пол
    //    зарплата
    //    уровень налогообложения Создать приложение FirmaAppl в котором принять на работу несколько сотрудников.


        //поля класса Employee

        public int personalNumber; // персональный номер -personal number
        public String name; // имя - name
        public String vorName; // фамилия - Vorname
        public String gender; // пол - gender
        public long lohn; // зарплата - lohn
        public int steuerklasse; // налогооблажение -steuerklasse

        // методы класса Employee
        // конструктор---------------
    public Employee(int personalNumber, String name, String vorName, String gender, long lohn, int steuerklasse) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.vorName = vorName;
        this.gender = gender;
        this.lohn = lohn;
        this.steuerklasse = steuerklasse;
    }
        public void display()
        {
            System.out.println("Personal number: " + personalNumber);
            System.out.println("Name: " + name);
            System.out.println("Vorname: " + vorName);
            System.out.println("Gender: " + gender);
            System.out.println("Lohn: " + lohn);
            System.out.println("Steuerklase: " + steuerklasse);
        }
        // геттеры и сеттеры
    public int getPersonalNumber() {
        return personalNumber;
    }
    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVorName() {
        return vorName;
    }
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public long getLohn() {
        return lohn;
    }
    public void setLohn(long lohn) {
        this.lohn = lohn;
    }
    public int getSteuerklasse() {
        return steuerklasse;
    }
    public void setSteuerklasse(int steuerklasse) {
        this.steuerklasse = steuerklasse;
    }
        }



