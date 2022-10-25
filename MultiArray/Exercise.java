public class Exercise {
    public static void main(String[] args) throws Exception {
        
        // Syntax Multiarray
        char [][] alpha = {{'A','B','C'}, {'D','E','F'}, {'G','H','I'}, {'J', 'K', 'L'}};
        
        // Calling MultiArray
        // System.out.println(alpha[0][0]);

        // //outer loop
        // for (int hours = 0; hours < 12 ; hours++) {
        //     //inner loop
        //     for (int minutes = 0; minutes < 60 ; minutes++) {
        //         System.out.println(hours + ":" + minutes);
        //     }
        // }

        //outer loop
        for (int rows = 0; rows < 4 ; rows++) {
            System.out.println("");
                //inner loop
                for (int columns = 0; columns < 3 ; columns++) {
                    // // if row is even
                    // if (rows % 2 == 0) {
                    //     System.out.println("");
                    // }
                    // else {
                    //     System.out.print(alpha[rows][columns]);
                    // }
                    
                    //if row is odd
                    if (rows % 2 != 0) {
                        System.out.println("");
                    }
                    else {
                        System.out.print(alpha[rows][columns]);
                    }
                }
        }
    }
  }
