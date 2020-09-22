public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            //System.out.println("Value was 1");
        } else if (value == 2) {
            //System.out.println("Value was 2");
        } else {
            //System.out.println("was not 1 or 2");
        }


        int switchValue = 1;
        switch (switchValue) {
            case 1:
                //System.out.println("Value was 1");
                break;
            case 2:
                //System.out.println("Value was 2");
                break;
            default:
                //System.out.println("Was not 1 or 2");
                break;
        }

        // Challenge //
        char switchVariable = 'A';
        switch (switchVariable) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                //System.out.println("Variable A, B, C, D, E was found case! " + switchVariable + " was found!");
                break;
            default:
                //System.out.println("None were found!");

        }

        String month  = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January is my birthday month");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Nothing YO!");
                break;
        }

    }


}
