package StreamEx;

import java.io.IOException;

public class InputStreamDemo {
	
	public static void main(String[] args) {
		int i=0;
		int cnt=0;
		
		try {
			while(true) {
				i = System.in.read(); //1바이트만 !! 키보드로 부터 입력을 받겠다. 반환 값이 int(아스키 값)형이다. 엔터 : 13, 줄바꿈 :10
				//read() 는 추상메소드 입니다. read(byte arr(배열) , int offset(시작위치) , int leng(길이)) 3개의 매개변수가 되어있다.
				
				System.out.println((char)i);
				cnt++;
				if(i =='z' || i=='Z') {
					break;
				}
			}
			System.out.println(cnt+"바이트 read함.");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}
