package Array;

/*
    Author       :- Avi-sheikh 
    Created Date :- 12/11/2022 
*/
public class SelectionSort {

    public static void main(String[] args) {
        int[] lists = {2, 9, 5, 4, 8, 1, 6};

        double[] doubleList = {1, 9, 4.5, 6.6, 5.7, -4.5};

        selectionSort(lists);
        doubleSelectionSort(doubleList);

//        for (int i:lists){
//            System.out.println("intSelectionSort: ");
//            System.out.print(i + " ");
//        }

        for(double i:doubleList) {
            System.out.print(i + " ");
        }
    }

    private static void doubleSelectionSort(double[] lists) {

        for (int i = 0; i < lists.length; i++) {

            double currentMin = lists[i];
            int currentIndex = i;

            for (int j = i+1; j<lists.length; j++) {
                if (currentMin < lists[j]) {
                    currentMin = lists[j];
                    currentIndex = j;
                }
            }

            if (i != currentIndex) {
                lists[currentIndex] = lists[i];
                lists[i] = currentMin;
            }
        }

    }

    private static void selectionSort(int[] lists) {
        for (int i=0; i<lists.length-1;i++) {

            int currentMin = lists[i];
            int currentMinIndex = i;

            for (int j=i+1; j<lists.length; j++) {
                if (currentMin > lists[j]) {
                    currentMin = lists[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                lists[currentMinIndex] = lists[i];
                lists[i] = currentMin;
            }
        }
    }

}
