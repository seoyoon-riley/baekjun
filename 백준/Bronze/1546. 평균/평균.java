import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = 0;
        double sum = 0;   // double 처리 중요
        int intarray[] = new int[N];
        for(int i = 0; i < N; i++) {
            int score = sc.nextInt();
            intarray[i] = score;
            if (score > M)
            M = score;  // 점수 중 최댓값 계속 갱신
        }
        for(int i = 0; i < N; i++) {
            sum += (double)intarray[i]/M*100;  // 점수 갱신, 정수 나눗셈이므로 double처리 중요!
        }
        double newmean = (double)sum/N;  // 평균이 실수값이므로 double처리
        System.out.println(newmean);
        
        sc.close();
    }
}

