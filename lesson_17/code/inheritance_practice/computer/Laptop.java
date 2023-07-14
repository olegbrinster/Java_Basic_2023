package inheritance_practice.computer;

public class Laptop extends Computer {

  private int size;
  private int weight;
  private String color;

// Конструктор по всем полям
    public Laptop(String cpu, int  ram, int ssd, String brand, int size, int weight, String color) {
        super(cpu, ram, ssd, brand);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }
// конструктор без color
    public Laptop(String cpu, int  ram, int ssd, String brand, int size, int weight) {
        super(cpu, ram, ssd, brand);
        this.size = size;
        this.weight = weight;
    }
    public void display () {
        super.display();
        System.out.println("Size: " + size  + "Weight: " + weight + "color:" + color  );

    }

    //  это методы которые устанавливают и получают значения полей

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
