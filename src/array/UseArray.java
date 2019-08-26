package array;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] studentID = new int [5];
        System.out.println("Please enter your number: ");
        for(int i = 0; i<studentID.length; i++) {
            studentID[i] = sc.nextInt();
        }

        for(int i=0; i<studentID.length; i++) {
            System.out.println(studentID[i]);
        }


    }
}
