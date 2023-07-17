package hw_25.model;

public class Bus {

      // Задача 2.
      // Создать класс Bus (автобус) - с полями номер маршрута, вместимость, скорость на маршруте, длина маршрута.
      // Реализовать методы go, stop, speedUp, speedDown

       // Поля класса Bus

      public int routeNumber;    // номер маршрута
      public int capacity;       // вместимость
      public int speedOnTheRoute; // скорость на маршруте
      public double lengthOfTheRoute;  //длина маршрута

       // методы класса Bus
       // конструктор

    public Bus(int routeNumber, int capacity, int speedOnTheRoute, double lengthOfTheRoute) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.speedOnTheRoute = speedOnTheRoute;
        this.lengthOfTheRoute = lengthOfTheRoute;

    }
    public void go(int speed) {
        if (speed < getSpeedOnTheRoute()){

          return ;

        }
        speedOnTheRoute += speed ;
        System.out.println("Gib Gas");
        System.out.println("Bus: " + routeNumber + " is on the move");
    }
    public void stop() {
        System.out.println("Bus: " + routeNumber + " has stopped");
    }
    public void speedUp(double acceleration) {
      speedOnTheRoute += acceleration  ;
        System.out.println("Bus: " + routeNumber + " acceleration" + speedOnTheRoute + "km/s^2");
    }
    public void speedDovn(double braking ){
        speedOnTheRoute -= braking ;
        System.out.println("Bus: " + routeNumber + " braking" + speedOnTheRoute + "km/s^2");
    }

    public void display() {
        System.out.println("Route number: " + routeNumber );
        System.out.println("Bus capacity: " + capacity );
        System.out.println("Speed on the route: " + speedOnTheRoute );
        System.out.println("Length of the route: " + lengthOfTheRoute );
    }
    // геттеры и сеттеры

    public int getRouteNumber() {
        return routeNumber;
    }
    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getSpeedOnTheRoute() {
        return speedOnTheRoute;
    }
    public void setSpeedOnTheRoute(int speedOnTheRoute) {
        this.speedOnTheRoute = speedOnTheRoute;
    }
    public double getLengthOfTheRoute() {
        return lengthOfTheRoute;
    }
    public void setLengthOfTheRoute(double lengthOfTheRoute) {
        this.lengthOfTheRoute = lengthOfTheRoute;
    }
}
