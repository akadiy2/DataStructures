package LinkedLists;

import java.util.Locale;
import java.util.Scanner;

public class AirlineTicketReservation {

    public static void main (String [] args) {
        MyLinkedList<String> names = new MyLinkedList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Reserve, Cancel, Display Passengers, (make sure to type Name of the person): ");
            input = sc.nextLine();
            String lowerCaseInput = input.toLowerCase(Locale.ROOT);
            if (lowerCaseInput.equalsIgnoreCase("display passengers")) {
                System.out.println(names);
            } else if (lowerCaseInput.contains("reserve")) {
                names.insert(input.split(" ")[1]);
                System.out.println(names);
            } else if (lowerCaseInput.contains("cancel")) {
                names.delete(input.split(" ")[1]);
                System.out.println(names);
            } else {
                System.out.println("Invalid command given");
            }
        } while (!input.equalsIgnoreCase("exit"));
    }
}
