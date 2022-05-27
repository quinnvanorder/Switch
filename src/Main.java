public class Main {
    public static void main(String[] args) {
//        int value = 12;
//        if (value == 1) {
//            System.out.println("value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("Value was 2");
//        }
//        else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
        }

        //challenge time!!
        /*
        Create a new switch statement using char instead of int
        Create a new char variable
        Create a switch statement testing for A, B, C, D, or E
        Display a message if any of these are found and then break
        Add a default which displays a message saying not found.
         */

        char charValue = 'A';

        switch(charValue){
            case 'A':
                System.out.println("Found A!");
                break;
            case 'B':
                System.out.println("Found B!");
                break;
            case 'C':
                System.out.println("Found C!");
                break;
            case 'D':
                System.out.println("Found D!");
                break;
            case 'E':
                System.out.println("Found E!");
                break;
            default:
                System.out.println("Target letters not found!");
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.printf("Jun");
                break;
            default:
                System.out.println("not sure");
        }
    }
}
