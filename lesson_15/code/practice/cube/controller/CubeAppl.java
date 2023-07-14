package practice.cube.controller;

import practice.cube.model.Cube;

public class CubeAppl {

    public static void main(String[] args) {

        System.out.println("Home work, lesson 15");

                 Cube cube1 = new Cube(10); // создаем объект типа Cube

                // вызываем метод perimeter класса Cube для конкретного экземпляра класса

                System.out.println( cube1 .perimeter(10));
                double s = cube1 .square(10);
                System.out.println("Square is : " + s);

               // вызываем метод volume класса Cube для конкретного экземпляра класса

                System.out.println(cube1 .volume(10) );

                cube1 .setA(30) ;

                System.out.println(cube1 .a);
            }
        }

