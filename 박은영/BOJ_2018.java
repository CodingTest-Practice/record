import java.util.Scanner;

public class BOJ_2018{//수들의합5(투포인터사용안함)
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //자연수N
        int cnt = 0; //가지수

        for(int i = 1; i <= num; i++){
            int sum=0; //<<아직도 이해 안 감
            for(int j = i; j <= num; j++){
                sum += j;
                if(sum > num)
                    break;
                else if(sum == num){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}