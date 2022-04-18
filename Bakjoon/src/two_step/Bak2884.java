package two_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bak2884 {
    public static void main(String[] args) throws IOException {
        /* 알람 시계
        24시간이라는 표현 사용
        입력은 공백 한 칸을 기준으로 구분되어 입력
        출력시 불필요한 0은 사용하지 않음

        45 기준으로 45보다 작으면 시(hour) -1 / 아닐경우 minute -45
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " "); // 문자열 쪼개어주는 클래스
        int H = Integer.parseInt(st.nextToken());   // 시
        int M = Integer.parseInt(st.nextToken());   // 분

        if(M < 45) {
            H--;
            M = 60 - (45 - M);
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
