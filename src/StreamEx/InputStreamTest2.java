package StreamEx;

import java.io.IOException;

public class InputStreamTest2 {
	public static void main(String[] args) {
		byte [] input = new byte[5];
		
		int i=0; 
		int cnt=0;
		int tot=0;
		
		try {
			while((i = System.in.read(input)) !=-1) {
				cnt++;
				tot +=i;
				System.out.println("i : "+i);
				System.out.write(input, 0 , i); //input �迭�ȿ� ����ִ� �� 0 ���� i ���� ����ض�.
			}
			System.out.println("cnt : "+cnt);
			System.out.println("���� ����Ʈ �� :"+tot);
			System.in.close();
			System.out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
