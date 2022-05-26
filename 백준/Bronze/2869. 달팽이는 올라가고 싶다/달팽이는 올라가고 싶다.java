import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int day = (height-down)/(up-down);
        if ((height-down)% (up-down) != 0)
            day++;

        System.out.println(day);
    }
}
