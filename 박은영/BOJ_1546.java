import java.util.Scanner;
import java.util.Arrays;

public class BOJ_1546 { //평균
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // int[] arr = new int[num];
        double[] arr = new double[num]; // 소수점을 담기위해 double사용

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        double result = 0;
        
        for (int i = 0; i < arr.length; i++) {
            result += ((arr[i]/arr[arr.length - 1])*100); // 식 = 과목점수/최고점*100
        }
        System.out.println(result/num); //마지막에 전체 점수에 대한 평균 구하기
    }
}