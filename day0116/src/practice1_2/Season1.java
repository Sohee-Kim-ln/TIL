package practice1_2;

import java.util.Scanner;

public class Season1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int month=0;//월 저장
		String season=null;//계절 저장
		
		for (int i=0; i<3;i++) {
			System.out.print("월 입력>>");//입력받음
			month = sc.nextInt();
			
			if(month<=5&&month>=3) season="봄";
			else if(month<=8&&month>=6) season="여름";
			else if(month<=11&&month>=9) season="가을";
			else season="겨울";//계절 지정
			
			System.out.printf("%d월은 %s입니다.\n",month,season);
		}
		sc.close();
	}
}
