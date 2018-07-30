package StreamEx;

import java.io.IOException;

public class InputStreamTest1 {

	public static void main(String[] args) {
		byte[] input = new byte[256]; // input 이라는 배열에 담는다.
		
		try {
//			System.in.read(input, 0, 5); // Apple Banna 즉 Apple : 5개.
			System.in.read(input, 3, 5); // arr , offset, length 위치를 공백으로 만들고 길이민큼 출력을 한다.
			System.out.println(new String(input));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
