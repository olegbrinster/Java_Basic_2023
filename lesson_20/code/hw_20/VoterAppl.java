package hw_20;

import java.util.*;
import java.util.Objects;

import hw_20.Voter;

public class VoterAppl {

    public static void main(String[] args) {

        Voter voter1 = new Voter("Ivan", "Petrovka 38", 20);

        Voter voter2 = new Voter("Alex", "Hauptstr.", 15);

        Voter voter3 = new Voter("Jon", "Feld", 14);

        Voter[] arrayOfVoter = new Voter[3];
        arrayOfVoter[0] = voter1;
        arrayOfVoter[1] = voter2;
        arrayOfVoter[2] = voter3;

        printArrayVoter(arrayOfVoter);

    }
    public static void printArrayVoter(Voter[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}



