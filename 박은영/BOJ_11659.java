import java.util.*;

public class BOJ_11659 { //구간합구하기
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); //수의 개수 (N)
        int num2 = sc.nextInt(); //합을 구해야하는 횟수 (M)
        int[] nums = new int[num1+1]; //합을 구해야하는 구간을 담아줄 배열 >> 0의 자리를 만들어 outOfIndex를 없애기 위해 num1+1을 해준다.
        nums[0] = 0;

        for(int i = 1; i <= num1; i++){ //
            nums[i] = nums[i-1]+sc.nextInt();
        }
        for(int j = 0; j < num2; j++){
            int inputNum = sc.nextInt();
            int inputNum2 = sc.nextInt();
            
            System.out.println(nums[inputNum2]-nums[inputNum-1]);
        }
    }
}