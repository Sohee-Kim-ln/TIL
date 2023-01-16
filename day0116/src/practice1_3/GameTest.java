package practice1_3;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요 \n\n1. 5판 3승\n2. 3판 2승\n3. 1판1승\n\n 번호를 입력하세요.");
		int temp=sc.nextInt();//게임 방식 저장할 임시변수
		int playcount=0;//게임판 수
		int wincount=0;//이긴 판수. 최종합이 양수이면 유저가 승리, 음수이면 컴퓨터가 승리
		int winend=0;//이긴 판 별 끝나는 승수 저장
		String RSP=null; //가위바위보 받아올 변수
		
		switch(temp) {
		case 1:playcount=5; break;
		case 2:playcount=3; break;
		case 3:playcount=1; break;
		}//판수 지정
		winend=playcount/2+1;//끝나는 승수 계산
		//가위1 바위2 보3
		for (int i=0;i<playcount;i++) {
			System.out.print("가위바위보 중 하나 입력: ");
			RSP=sc.next();//가위바위보 입력받기
			int comran=(int)(Math.random()*3+1);//컴퓨터 랜덤결과 저장
			
			int userin=0;
			if(RSP.equals("가위")) userin=1;
			else if(RSP.equals("바위")) userin=2;
			else userin=3;//유저 가위바위보 숫자로 변환 후 저장
			
			if(comran==userin) System.out.println("비겼습니다!!!");//비길경우
			else if(comran-userin==1 || comran-userin==-2) {
				System.out.println("졌습니다!!!");
				wincount--;
			}//컴퓨터가 이길 경우
			else if(comran-userin==-1 || comran-userin==2) {
				System.out.println("이겼습니다!!!");
				wincount++;
			}
			if (wincount==winend||wincount==-(winend)) break;//유저나 컴퓨터 중 하나가 끝나는 승수에 도달했을 때 루프 종료
		}
		
		System.out.print("###");
		if(wincount==0) System.out.print("컴퓨터와 유저가 비겼습니다.");
		else if(wincount>0) System.out.print("유저 승!!!");
		else System.out.print("컴퓨터 승!!!");//최종 승리결과 출력
		sc.close();
	}
}

/*
 * 유저 컴퓨터 	컴-유		승리
 * 1	1	0		비김
 * 1	2	1		컴
 * 1	3	2		유
 * 2	1	-1		유
 * 2	2	0		비김
 * 2	3	1		컴
 * 3	1	-2		컴
 * 3	2	-1		유
 * 3	3	0		비김
 */




