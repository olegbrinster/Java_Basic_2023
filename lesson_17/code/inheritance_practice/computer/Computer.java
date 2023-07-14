package inheritance_practice.computer;

public class Computer {

    // Поля объекта класса
    private String cpu;
    private int  ram;
    private int ssd;
    private String brand;

    // Конструктор класса


    public Computer(String cpu, int  ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public void display () {
        System.out.println("Brand: " + brand + " CPU: " + cpu + "RAM: " + ram + "ssd: " + ssd );
        System.out.println();

    }

    // геттеры и сеттеры
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int  getRam() {
        return ram;
    }

    public void setRam(int  ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
