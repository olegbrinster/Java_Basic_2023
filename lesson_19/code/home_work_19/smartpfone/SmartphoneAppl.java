package smartpfone;

import java.util.Objects ;


public class SmartphoneAppl {

    public static void main(String[] args) {

        Smartphone smart1 = new Smartphone(300, "Weiss", 56, 600);
        Smartphone smart2 = new Smartphone(400, "Schwarz", 128, 1200);
        Smartphone smart3 = new Smartphone(500, "Braun", 256, 1100);
        Smartphone smart4 = new Smartphone(500, "Braun", 256, 1100);
        Smartphone smart5 = new Smartphone(400, "Schwarz", 128, 1200);

        System.out.println(smart3 == smart4);

        System.out.println(smart2.equals(smart5));

        Smartphone[] arrOfSmarts = new Smartphone[5];
        arrOfSmarts[0] = smart1;
        arrOfSmarts[1] = smart2;
        arrOfSmarts[2] = smart3;
        arrOfSmarts[3] = smart4;
        arrOfSmarts[4] = smart5;


        printArray(arrOfSmarts );

        int sum = 0;
        for (int i = 0; i < arrOfSmarts.length; i++) {

            sum = sum + arrOfSmarts[i].getStorage();
        }
            System.out.println("Total Price : + sum");

        }

        //------- Метод --------

        // печать массива


    public static void printArray (Object[] arr) {
        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i].toString() );



            }
        }


    }

