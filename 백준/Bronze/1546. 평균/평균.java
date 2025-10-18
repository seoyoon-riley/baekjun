import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = 0;
        double sum = 0;
        int intarray[] = new int[N];
        for(int i = 0; i < N; i++) {
            int score = sc.nextInt();
            intarray[i] = score;
            if (score > M)
            M = score;  // 점수 중 최댓값 계속 갱신
        }
        for(int i = 0; i < N; i++) {
            sum += (double)intarray[i]/M*100;  // 점수 갱신
        }
        double newmean = (double)sum/N;
        System.out.println(newmean);
        
        sc.close();
    }
}
