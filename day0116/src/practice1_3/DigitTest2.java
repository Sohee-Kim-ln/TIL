package practice1_3;

public class DigitTest2 {
	public static void main(String[] args) {
		int num=1;//출력 숫자 시작
		int linemax=5; //한 줄의 최대 숫자 갯수
		int linecurr=0;//현재 줄에 기재된 숫자 갯수
		
		for(int row=0; row<5; row++) {
			linecurr=0;// 현재 줄에 기재 완료된 숫자 갯수
			switch(row) {
			case 0: linemax=5; break;
			case 1: linemax=4; break;
			case 2: linemax=3; break;
			case 3: linemax=4; break;
			case 4: linemax=5; break;
			}//줄 별 최대 숫자 갯수 지정
			
			for (int col=0;col<5;col++) {
				if((col==1 && row==2)||(col==0 && (row>0 && row<4)))System.out.print("  ");//(row,col)(1,0) (2,0) (3,0) (2,1) 위치 숫자 대신 공백
				else {
				if(num<10) System.out.print(" ");//한자리수 이면 공백 출력
				System.out.print(num);//숫자 출력
				num++;//출력할 숫자 ++
				}
				
				linecurr++;//줄에 기재된 숫자 갯수 ++
				if(col!=4)System.out.print(" ");//마지막 숫자가 아니면 공백으로 띄워주기
				if(linecurr==linemax) break;//줄 별 최대 숫자에 도달하면 같은 행 루프 끝
			}
			System.out.println();//한 줄 끝에 개행문자 입력
		}
		
//		System.out.println(" 1  2  3  4  5");
//		System.out.println("    6  7  8");
//		System.out.println("       9");
//		System.out.println("   10 11 12");
//		System.out.println("13 14 15 16 17");
	}
}
