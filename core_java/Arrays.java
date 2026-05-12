
public class Arrays {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr2[] = new int[5];
        System.out.println("array2: " + arr2[3]);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        //multi dimentional array
        int arr3[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr4[][] = new int[3][4];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("Multi Dimensional: " + arr3[i][j]);
            }
        }

        for (int m : arr) {
            for (int j : arr) {
                System.out.println("Enhanced for loop: " + m + " " + j);
            }
        }
    }
}
