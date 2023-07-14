package home_work_17;

public class Pet {
   // public void voice(){
      //  System.out.println("Голос");
    //}

    // Поля объекта класса
    public String type;
    public double   weight;
    public String livingConditions;

    // Конструктор класса

    public Pet(String type, double   weight, String livingConditions) {
        this.type = type;
        this.weight = weight;
        this.livingConditions = livingConditions;
    }

    // пустой конструктор
    public Pet() {
    }

    // метод eat

    public void eat (String type ,double   weight, String livingConditions) {
        System.out.println("Go to eat" + type + "" + livingConditions);

        this.type = type;
        this.livingConditions = livingConditions;
    }
        // метод sleep

    public void sleep (String type , String livingConditions ) {
        System.out.println("Go to sleep" + type + "" + livingConditions);
    }




    public void display() {
         System.out.println("Type: " + type + "Weight: " + weight + "Living conditions:" + livingConditions );
         System.out.println();


     }
     public void voice(){
         System.out.println("Голос");
     }
    // геттеры и сеттеры

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLivingConditions() {
        return livingConditions;
    }

    public void setLivingConditions(String livingConditions) {
        this.livingConditions = livingConditions;
    }
}

