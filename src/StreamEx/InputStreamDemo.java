package StreamEx;

import java.io.IOException;

public class InputStreamDemo {
	
	public static void main(String[] args) {
		int i=0;
		int cnt=0;
		
		try {
			while(true) {
				i = System.in.read(); //1����Ʈ�� !! Ű����� ���� �Է��� �ްڴ�. ��ȯ ���� int(�ƽ�Ű ��)���̴�. ���� : 13, �ٹٲ� :10
				//read() �� �߻�޼ҵ� �Դϴ�. read(byte arr(�迭) , int offset(������ġ) , int leng(����)) 3���� �Ű������� �Ǿ��ִ�.
				
				System.out.println((char)i);
				cnt++;
				if(i =='z' || i=='Z') {
					break;
				}
			}
			System.out.println(cnt+"����Ʈ read��.");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}
