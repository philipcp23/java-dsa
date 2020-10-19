import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> vacation = new LinkedList<String>();
        vacation.add("Italy");
        vacation.add("Spain");
        vacation.add("Ireland");
        vacation.add("Germany");
        vacation.add("France");
        vacation.add("Hawaii");
        vacation.add("Switzerland");

        printList(vacation);

        vacation.add(2, "Australia");
        printList(vacation);

        vacation.remove(6);
        printList(vacation);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newVacation) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            int compare = listIterator.next().compareTo(newVacation);
            if (compare == 0) {
                System.out.println(newVacation + " is already included as a destination");
                return false;
            } else if (compare > 0) {
                listIterator.previous();
                listIterator.add(newVacation);
                return true;
            } else if (compare < 0) {
                //
            }
        }

        listIterator.add(newVacation);
        return true;
    }

    private static void visit(LinkedList cities) {
        var scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator listIterator = cities.listIterator();

        if (cities.getFirst() == "") {
            System.out.println("No cities in the schedule");
        } else {
            System.out.println("Now visiting" + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation has come to an end");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("End of the list .");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.hasPrevious());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to the next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }


}
