package practice1_4;
import java.util.Scanner;

public class GabjaTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		int numgan=-2;//십간 상태 저장변수
		int numeasy=-2;//십이지 상태 저장변수
		String gjinput=null;//갑자 입력 받을 변수
		
		while(true) {
			System.out.print("60갑자를 입력하세요: ");
			gjinput=sc.next();//갑자 입력 받음
			if (gjinput.equals("종료")) break;//종료가 입력되면 루프 종료
			
			switch(gjinput.charAt(0)) {
			case '갑': numgan=4;break;
			case '을': numgan=5;break;
			case '병': numgan=6;break;
			case '정': numgan=7;break;
			case '무': numgan=8;break;
			case '기': numgan=9;break;
			case '경': numgan=0;break;
			case '신': numgan=1;break;
			case '임': numgan=2;break;
			case '계': numgan=3;break;
			default : numgan=-1;break;
			}//앞글자에 따른 십간 상태 지정. 연도 %10 값
			
			switch(gjinput.charAt(1)) {
			case '자': numeasy=0;break;
			case '축': numeasy=1;break;
			case '인': numeasy=2;break;
			case '묘': numeasy=3;break;
			case '진': numeasy=4;break;
			case '사': numeasy=5;break;
			case '오': numeasy=6;break;
			case '미': numeasy=7;break;
			case '신': numeasy=8;break;
			case '유': numeasy=9;break;
			case '술': numeasy=10;break;
			case '해': numeasy=11;break;
			default: numeasy=-1;break;
			}//뒷글자에 따른 십이지 상태 지정. (연도 -1444)%12 값
			
			if(numgan==-1||numeasy==-1) {System.out.print("잘못된 입력\n"); continue;}//입력 잘못됐을 경우 출력 후 루프 처음으로 돌아감
			
			for (int year=1800;year<=2100;year++) {
				if((year%10==numgan)&&((year-1444)%12==numeasy)) {
					System.out.print(year);
					if(year>2040) System.out.println();//마지막 연도면 개행문자 출력
					else System.out.print(" ");//마지막 연도가 아니면 공백 출력
				}
			}
		}
		sc.close();
	}
}
