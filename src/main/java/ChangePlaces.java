
public class ChangePlaces {
    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);
        System.out.println("-----------------------------------");
        changeMaxAndMin(array);
        printArray(array);
    }

     static int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
        }
        return array;
    }

     static int[] changeMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxInd = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                minInd = i;
            }
        }
        int change = arr[maxInd];
        arr[maxInd] = arr[minInd];
        arr[minInd] = change;
        return arr;
    }

     static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
