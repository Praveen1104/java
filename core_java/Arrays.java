
class Student {

    int rollno;
    String name;
    int marks;

}

public class Arrays {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 95;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        System.out.println("Student 1: " + students[0]);
        System.out.println("Student 2: " + students[1]);

        for (Student student : students) {
            System.out.println("Student: " + student);
        }

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
// enhanced for loop is useful for jagged array and multi dimensional array
        for (int m : arr) {
            for (int j : arr) {
                System.out.println("Enhanced for loop: " + m + " " + j);
            }
        }

        //jagged array
        int arr5[][] = new int[3][];
        arr5[0] = new int[2];
        arr5[1] = new int[3];
        arr5[2] = new int[4];
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.println("Jagged array: " + arr5[i][j]);
            }
        }
    }
}
