package home_work_17;

import home_work_17.Pet ;
import home_work_17.Cat ;
import home_work_17.Dog ;


public class HouseAppl {

    public static void main(String[] args) {

      Pet cat1 = new Pet() ;
      cat1 .display() ;
      cat1 .eat("Cat", 6, "Haus") ;
      cat1 .voice() ;
      cat1 .display() ;

      Pet dog1 = new Pet() ;
      dog1 .display() ;
      dog1 .eat("Dog", 25, "on the street");
      dog1 .voice() ;
     dog1 .display() ;

     Pet cat2 = new Pet();
     cat2 .display() ;
     cat2 .eat("Кошка", 7.0,"в доме");
     cat2 .voice() ;
     cat2 .display() ;

     dog1 .voice() ;
     cat1 .voice() ;


    }
}
