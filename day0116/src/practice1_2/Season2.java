package practice1_2;

import java.util.Scanner;

public class Season2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=1;//while 3번 반복을 위한 변수
		int month=0;//월 저장
		String season=null;//계절 저장
		
		while(count<=3) {
			System.out.print("월 입력>>");
			month=sc.nextInt();
			switch(month) {
			case 1: season="겨울";break;
			case 2: season="겨울";break;
			case 3: season="봄";break;
			case 4: season="봄";break;
			case 5: season="봄";break;
			case 6: season="여름";break;
			case 7: season="여름";break;
			case 8: season="여름";break;
			case 9: season="가을";break;
			case 10: season="가을";break;
			case 11: season="가을";break;
			case 12: season="겨울";break;
			}//월 별 계절 지정
			
			System.out.printf("%d월은 %s입니다.\n",month,season);
		}
		sc.close();
	}
}
