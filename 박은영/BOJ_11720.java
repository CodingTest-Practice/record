import java.util.Scanner;

public class BOJ_11720 { //숫자의 합구하기
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 합을 구할 수의 개수를 담는 변수
        
        String nums = sc.next();// 연속된 숫자를 받을 변수
        int sum = 0; // 연솟된 숫자의 합을 담을 변수
        
        for(int i = 0; i < num; i++) {
            sum += nums.charAt(i)-'0'; //아스키코드에서 '0' = 48과 같다
            //charAt : 문자열에서 한글자만 선택해서 char타입으로 변환, 인덱스값으로 값을 선택할 수 있다.
            // charAt은 해당 글자의 아스키코드 값(10진수)을 리턴해준다.
            //그러므로 -'0' 이나 -48을 해주면 입력받은 숫자값으로 변환하여 사용할 수 있다. 
            //ex) nums[0]=3
            //    nums.charAt[0]-'0'
            //   = 51-48 = 3
        }
        System.out.println(sum);
    }
}