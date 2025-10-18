import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int intarray[] = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            intarray[i] = n;
        }
        int v = sc.nextInt();
        for(int i = 0; i < N; i++) {
            if(intarray[i] == v)
            count ++;
        }
        System.out.println(count);
        sc.close();
    }
}
