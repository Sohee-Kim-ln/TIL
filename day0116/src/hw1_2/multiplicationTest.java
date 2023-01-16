package hw1_2;
import java.util.Scanner;
public class multiplicationTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int frdigit=0;
		do {
			if(frdigit==0) System.out.print("숫자를 입력하세요: ");
			else System.out.print("다음 숫자 입력: ");
			frdigit=sc.nextInt();
			if (frdigit==0) break;
			for(int i=1;i<=9;i++) System.out.printf("%d*%d=%d\n", frdigit,i,frdigit*i);
		}while(frdigit!=0);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
