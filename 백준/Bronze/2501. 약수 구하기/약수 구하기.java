import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if( N % i == 0) {
                count ++;  // 약수가 발견될때마다 count를 늘려서 count가 K가 됐을때 약수 출력
                if (count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);  //약수의 개수가 K보다 작을경우
        sc.close();
    }
}
