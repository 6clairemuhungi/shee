package com.claire;

public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {78,45,67,89,35,65,79,90,54,67,31,62};
        String names[] = {"Kim", "Jim", "Joan", "Jack", "Jerry"};
        System.out.println( marks[0] );
        try {
            System.out.println( names[10] );

        }
        catch (Exception e)
        {
            System.out.println("Error while fetching the name");
        }

        System.out.println(12345);

    }
}



