 

public class Kirkman {
    // day, row, col, used in day, stood next to that girl 
    static int [][][] week = new int [7][5][3];
    static boolean [][] days = new boolean [7][15];
    static boolean [][] girls = new boolean [15][15];

    public static void main (String [] args) {
        Kirkman.printWelcomeMessage();
        Kirkman.solve();
    }

    public Kirkman () {

    }

    public static void printWelcomeMessage () {
        System.out.println("Hello! My name is Tom Kirkman! " +
                           "I have begun solving your Kirkman problem!");
    }

    // THESE ARE NOT NEEDED IF WE ARE TO PROPERLY STORE THE 


    public static void solve () {
        // start guessing, what goes into making a guess
        // first, know how to iterate over days
        for (int day = 0; day < 7; day++) {
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 3; col++) {
                    for (int girl = 1; girl < 16; girl++) {
                        // another way of saying the row question is has girl being guessed
                        // stood next to the other 2 in her row
	                       week[day][row][col] = girl;
	                        printSolution(); 
                        // if (girl is NOT valid for row or girl is NOT valid for day) {
                        //     if (girl == 14) {
                        //         // backtrack
                        //     }
                        // } else {
                        //     week[day][row][col] = girl;
	                       //  printSolution();
                        //     break;
                        // }
                    }   
                }
            }
        }        

    }

    public static void printSolution () {
    	String output = "";
    	for (int day = 0; day < 7; day++) {
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 3; col++) {
                	output += "" + week[day][row][col] + "";
                }
            }
        }
    	System.out.println(output);
    }
}

