package app;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Concert {

    public static void main(String[] args) {

        // Each available show has been represented by a Dictionary

        Dictionary<String, String> sharks = new Hashtable<>();
        Dictionary<String, String> whale = new Hashtable<>();
        Dictionary<String, String> fish = new Hashtable<>();

        sharks.put("name", "Sharks");
        sharks.put("price", "10");
        sharks.put("datetime", "11/7/20");
        sharks.put("instock", "20");

        whale.put("name", "Whale");
        whale.put("price", "10");
        whale.put("datetime", "12/4/20");
        whale.put("instock", "15");

        fish.put("name", "Fish");
        fish.put("price", "10");
        fish.put("datetime", "5/13/20");
        fish.put("instock", "1");

        System.out.println("Welcome To The Show ! \n");

        // The available shows are all displayed to the user following the date and
        // tickets in stock
        String availableShows = (sharks.get("name") + " " + "at " + sharks.get("datetime") + " " + sharks.get("instock")
                + " ticket(s) available" + "\n" + whale.get("name") + " " + "at " + whale.get("datetime") + " "
                + whale.get("instock") + " ticket(s) available" + "\n" + fish.get("name") + " " + "at "
                + fish.get("datetime") + " " + fish.get("instock") + " ticket(s) available" + "\n");

        System.out.println(availableShows);

        // The User chooses a show
        Scanner showChoice = new Scanner(System.in);
        System.out.println("Which Show Would You Like To Watch ?");
        String userInput = showChoice.nextLine();

        // Each show available can be purchased
        if (userInput.equals("Sharks")) {
            String sharkInfo = ("The movie " + sharks.get("name") + " " + "for" + " " + sharks.get("datetime") + " ?");
            System.out.println("Your total will be " + "$" + sharks.get("price") + ".00");
            int instock = Integer.parseInt(sharks.get("instock"));
            instock = instock - 1;
            System.out.print(instock + " " + "tickets left" + "\n");

        }

        else if (userInput.equals("Whale")) {
            String sharkInfo = ("The movie " + whale.get("name") + " " + "for" + " " + whale.get("datetime") + " ?");
            System.out.println("Your total will be " + "$" + whale.get("price") + ".00");
            int instock = Integer.parseInt(whale.get("instock"));
            instock = instock - 1;
            System.out.print(instock + " " + "tickets left" + "\n");

        }

        else if (userInput.equals("Fish")) {
            String sharkInfo = ("The movie " + fish.get("name") + " " + "for" + " " + fish.get("datetime") + " ?");
            System.out.println("Your total will be " + "$" + fish.get("price") + ".00");
            int instock = Integer.parseInt(fish.get("instock"));
            instock = instock - 1;
            System.out.print(instock + " " + "tickets left" + "\n");

        }

    }
}
