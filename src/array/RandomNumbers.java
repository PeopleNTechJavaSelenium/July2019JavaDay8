package array;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {

        int [] studentID = new int [20];
        Random random = new Random(2);
        for(int i = 0; i<5; i++) {
            studentID[i] = random.nextInt(50);
        }

        for(int i=0; i<studentID.length; i++) {
            System.out.println(studentID[i]);
        }
    }

}
