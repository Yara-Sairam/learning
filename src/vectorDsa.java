package src;
import java.util.*;

public class vectorDsa {

    public static void rotateVector(Vector<Integer> vector, int k) {
        int n = vector.size();
        System.out.println("size" + vector);
        k = k % n; // Handle cases where k > n

        if (k == 0) return; // No rotation needed

        reverse(vector, 0, n - 1); // Reverse the entire vector
        reverse(vector, 0, k - 1); // Reverse the first part
        //reverse(vector, k, n - 1); // Reverse the second part
    }



    private static void reverse(Vector<Integer> vector, int i, int j) {
        // TODO Auto-generated method stub

    }



    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int k = 3;
        rotateVector(vector, k);
        System.out.println(vector); // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}

