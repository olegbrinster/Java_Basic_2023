package hw_25.model;

public class BusAppl {

    public static void main(String[] args) {

        Bus bus1 = new Bus(13,50,30,25);
        bus1 .go() ;
        bus1 .speedUp(20);
        bus1 .speedDovn(20) ;
        bus1 .stop() ;

        System.out.println();
        bus1.display() ;
        System.out.println();
        System.out.println();

        Bus bus2 = new Bus(15, 60, 40, 20);
        bus2 .go() ;
        bus2 .speedUp(20);
        bus2 .speedDovn(20) ;
        bus2 .stop() ;

        System.out.println();
        bus2.display() ;
        System.out.println();
    }
}
