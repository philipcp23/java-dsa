import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
    }







}
