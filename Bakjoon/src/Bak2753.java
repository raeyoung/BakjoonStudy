import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bak2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 윤년 구하기
		// 윤년 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		System.out.print((year%4==0)?((year % 400 == 0)?"1":(year%100==0)?"0":"1"):"0");

	}

}
