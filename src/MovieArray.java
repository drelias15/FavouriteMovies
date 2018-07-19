import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;


public class MovieArray {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> favmov = new ArrayList<String>();
        System.out.println("Enter you favourite movies");
        String input = keyboard.nextLine().toLowerCase();

        while(!input.equalsIgnoreCase("q")){

            if(!favmov.contains(input.toLowerCase())){
                favmov.add(input);
                input = keyboard.nextLine();
            } else{
                System.out.println(input + " already exists.");
                input = keyboard.nextLine();
            }

        }

        favmov.sort(String::compareToIgnoreCase);
        for (String myValue : favmov) {
            System.out.println(myValue);
        }
    }
}