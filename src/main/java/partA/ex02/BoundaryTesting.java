package partA.ex02;

public class BoundaryTesting {

    public static String boundaryTesting() {
        String response = "";
        int CALENDAR_START = 1583;
        int year = 1582;
        int month = 1;

        // validate input 
        if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
            response += ("Bad request: " + year + " " + month);
        }


        return response;

    }
    public static void main(String[] args) {
        String output = boundaryTesting();
        System.out.print(output);
    }


}
