package two_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bak2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ���� ���ϱ�
		// ���� 4�� ����̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		System.out.print((year%4==0)?((year % 400 == 0)?"1":(year%100==0)?"0":"1"):"0");

	}

}
