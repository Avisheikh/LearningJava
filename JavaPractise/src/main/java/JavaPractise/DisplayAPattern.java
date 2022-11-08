package JavaPractise;

/**

(Display a pattern) Write a program that displays the following pattern:

    J     A     V   V     A
    J    A A    V   V    A A
J   J   AAAAA   V   V   AAAAA
 J J    A   A     V     A   A

 */

public class DisplayAPattern{

    private final String j = "J";
    private final String a = "A";
    private final String v = "V";

    private void print(){
        for(int i=0; i<4; i++){
            if(i == 0){
                System.out.println("    " + j + "     " + a + "    " + v + "         " + v + "     " + a);
            }
            if(i == 1){
                System.out.println("    " + j + "    " + a + " "+ a + "     " + v +  "     " + v + "      " + a + " "+ a );
            }
            if(i == 2){
                System.out.println( j + "   " + j + "   " + a+a+a+a+a + "      " + v +" " + v + "       " + a+a+a+a+a) ;
            }
            if(i == 3){
                System.out.println(" "+ j +" " + j + " " + "  " + a + "     " + a + "      " + v   + "       " + a + "     " + a );
            }
        }

    }


    public static void main(String args[]){

        DisplayAPattern display = new DisplayAPattern();
        display.print();
    }

}