public class FinalExam {
    public static void main(String[] args) throws Exception {
            String[][] array = { 
                {"." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." } , 
                {"." , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } , 
                {"." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "#" } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } , 
                {"#" , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } , 
                {"." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "#" } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } , 
                {"#" , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } ,
                {"." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "#" } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } ,
                {"#" , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } ,
                {"." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "." , "#" } ,
                {"#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" , "#" } ,
            };
    
        for (int row = 0; row < 16; row++) {
            System.out.println(" ");
            for (int column = 0; column < 16; column++) {
                if (row < 16 && column < 16) {
                    System.out.print(array[row][column]);
                }
            }
        }
    }
}
