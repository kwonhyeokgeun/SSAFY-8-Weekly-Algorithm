package problem.BJ;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ15652_N과M4 {
	static int ans, N, M;
	static int[] tgt;

	static StringBuilder sb = new StringBuilder();


	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		tgt = new int[M];

		perm(0);

		System.out.println(sb.toString());
	}


	private static void perm(int dep) {
		if (dep == M) {
			for (int n : tgt) sb.append(n).append(" ");
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (dep > 0 && i < tgt[dep - 1]) continue;
			tgt[dep] = i;
			perm(dep + 1);
		}
	} // end perm
}

/*
 * 조건을 만족하는 수열을 출력 
 * 중복순열이되, 비내림차순 
 * 아 전부다 그니까 오름차순이어야한다는 말인듯 
 * */
