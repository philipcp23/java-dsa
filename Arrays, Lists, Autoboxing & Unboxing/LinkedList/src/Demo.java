import java.util.Iterator;
import java.util.LinkedList;

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

        vacation.remove(1);
        printList(vacation);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("=============================");
    }
}
