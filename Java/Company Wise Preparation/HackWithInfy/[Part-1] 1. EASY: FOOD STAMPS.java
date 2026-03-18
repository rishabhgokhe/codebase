import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();

        int[] v=new int[n];
        int[] d=new int[n];

        for (int i=0; i<n; i++) {
            v[i]=sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            d[i]=sc.nextInt();
        }

        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<n; i++) {
            for (int j=1; j<m; j++) {
                int points = v[i] - d[i] * (j-1);
                pq.offer(points);
            }
        }

        for (int i=0; i<n; i++) {
            ans += pq.remove();
        }

        System.out.println(ans);

    }
}