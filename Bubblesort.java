import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }
        Bubblesort sorter = new Bubblesort();
        sorter.sort(a);
        input.close();
    }

    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
                    a[j] ^= a[j + 1];
                    
                }
            }
        }
        for (int i : a) {
            System.out.printf("%d ", i);
        }
    }

}