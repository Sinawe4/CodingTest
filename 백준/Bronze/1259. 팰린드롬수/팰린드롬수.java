import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String line = sc.next();
            if (line.equals("0"))
                System.exit(0);

            String[] line1 = new String[line.length()];
            String[] line2 = new String[line.length()];

            for (int i = 0; i < line.length(); i++)
                line1[i] = line.substring(i,i+1);


            for (int i = 0; i < line.length(); i++)
                line2[i] = line1[line.length()-1-i];
            int count = 0;

            for (int i = 0; i < line.length(); i++){
                if (line1[i].equals(line2[i]))
                    count++;
            }
            if (count == line.length())
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }
}

