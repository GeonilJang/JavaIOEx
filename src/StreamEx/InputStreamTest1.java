package StreamEx;

import java.io.IOException;

public class InputStreamTest1 {

	public static void main(String[] args) {
		byte[] input = new byte[256]; // input �̶�� �迭�� ��´�.
		
		try {
//			System.in.read(input, 0, 5); // Apple Banna �� Apple : 5��.
			System.in.read(input, 3, 5); // arr , offset, length ��ġ�� �������� ����� ���̹�ŭ ����� �Ѵ�.
			System.out.println(new String(input));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
