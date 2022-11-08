package JavaPractise;// Write a program that displays the following table:

    //a a^2 a^3
    //1  1   1
    //2  4   8
    //3  9   27
    //4  16  64

public class Tables {

    private static int a=2;
    private static int b=3;
    private static int c=4;

//    public static void printTables() {
//
//        for(int i=0; i<5;i++){
//            if(i == 0){
//                System.out.println("a");
//            } else {
//                System.out.println(i);
//            }
//            for(int j=0; j<i; j++){
//                System.out.println(j);
//            }
//        }
//    }

//    public static void printTables(){
//        for(int r = 0; r<=6; r++){
//            if(r == 5){
//                for (int c = 0; c < 5; c++){
//                    System.out.print("\t"+c*c);
//                }
//            } else if(r == 6){
//                for (int c = 0; c < 5; c++){
//                    System.out.println(c*c*c);
//                }
//            }
//            else {
//                System.out.print(r + "\n");
//            }
//
//        }
//    }

    public static void printTables(){
        for(int i=0; i<5; i++){
            if(i > 0){
                System.out.print("\n");
            }

            for(int j=0; j<3; j++){
                if(i == 0){
                    if(j == 0){
                        System.out.print("a ");
                    }
                    if (j == 1){
                        System.out.print("a^2 ");
                    }
                    if (j == 2){
                        System.out.print("a^3");
                    }
                }

                if(i == 1){
                    System.out.print(1 + "   ");
                }
                if(i == 2){
                    System.out.print(a + "   ");
                    a *= 2;
                }
                if(i == 3){
                    System.out.print(b + "   ");
                    b *= 3;
                }
                if ( i == 4){
                    System.out.print(c + "   ");
                    c *= 4;
                }

            }

        }
    }


    public static void main(String[] args) {
        printTables();
    }


}
