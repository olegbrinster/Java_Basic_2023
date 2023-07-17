public class Main_hw_06 {

    public static void main(String[] args) {

        System.out.printf("Hw_06");
        System.out.println();

      double r = 5;

      double s = areaCircle(r) ;
        System.out.println("Area of a circle= " + s );

    }
       //_________ Methods______
       public static double areaCircle(double r) {
        double s = Math.PI * r * r;
        return s ;
       }
    // end of Methods
    }

