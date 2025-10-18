import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // N 입력받음
        int intarray[] = new int[N];  // N개 길이의 intarray 생성
        int count = 0;  // count 초기화
        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();  // N개의 정수를 공백을 구분으로 입력받겠다
            intarray[i] = n;  // 입력된 정수 intarray에 저장
        }
        int v = sc.nextInt();  // v입력
        for(int i = 0; i < N; i++) {
            if(intarray[i] == v)
            count ++;  // intarray의 원소가 v일때마다 count 1씩 증가
        }
        System.out.println(count);
        sc.close();
    }
}

