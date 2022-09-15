
/**
 * 2022-09-15
 * 编写JAVA程序，创建数组arr1和arr2，将数组arr1中索引位置是0~3中的元素复制到数组arr2中，最后将arr1和arr2输出
 */
import java.util.Scanner;
import java.util.Arrays;//不要忘记导入

public class test671 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        length = input.nextInt();
        int arr1[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr1[i] = input.nextInt();
        }
        int arr2[] = Arrays.copyOfRange(arr1, 0, 3);
        for (int i : arr1)
            System.out.printf("arr1: %d ", i);
        System.out.println("");
        for (int i : arr2)
            System.out.printf("arr2: %d ", i);
        input.close();
    }
}