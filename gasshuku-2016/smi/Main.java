import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] teishutu = new int[31];

		for(int i = 0;i < 28 ;i++){
			int a = scan.nextInt();

			teishutu[a] = 1;
		}

		for(int i = 1;i < 31;i++){
			if(teishutu[i] == 0){
				System.out.println(i);
			}
		}

	}
}
