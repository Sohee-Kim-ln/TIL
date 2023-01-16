package practice1_3;

public class DigitTest1 {
	public static void main(String[] args) {
		int num=1;//출력 숫자 시작

		for(int row=0;row<5;row++) {
			for (int col=0;col<5;col++) {
				if(col!=0) {//맨앞이 아니라면
					if (col<row||num<10) System.out.print(" ");// 열<행이면 공백추가 ||한자릿수 숫자면 자릿수 맞출 공백 추가
					System.out.print(" ");//숫자 사이에 공백 추가
				}
				if(col<row) System.out.print(" "); //열<행 이면 숫자 대신 공백
				else {System.out.print(num); num++;} //숫자 출력 후 ++
			}
			System.out.println();	
		}

//		System.out.println("1  2  3  4  5");
//		System.out.println("   6  7  8  9");
//		System.out.println("     10 11 12");
//		System.out.println("        13 14");
//		System.out.println("           15");
	}
}
/* System.out.printf("%4s", "");   	공백출력
 * System.out.printf("%4d", number)	숫자출력
 */
