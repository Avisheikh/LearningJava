package Array;

/*
    Author       :- Avi-sheikh 
    Created Date :- 09/11/2022 
*/
public class Test {

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        reverse(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print( list[i] + " ");
        }
    }

    private static void reverse(int[] list) {
        int[] newList = new int[list.length];

        for(int i = 0; i < newList.length; i++) {
            newList[i] = list[list.length -1-i];
        }
        list = newList;
    }

//    private static void reverse(int[] list) {
//        for (int i =0; i < list.length; i++) {
//            list[i] = list[list.length - 1 -i];
//        }
//    }

}
