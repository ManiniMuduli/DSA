package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println("Element of the two-dimensional array");
        for (int i = 0;i< arr.length;i++){ //for array
            for (int j = 0 ;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
