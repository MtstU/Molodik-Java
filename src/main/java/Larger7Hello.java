import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Larger7Hello {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = reader.readLine();
        int a1 = Integer.parseInt(inputNumber);
        String text = "Привет";
        if(a1 > 7) {
            System.out.println(text);
        }
    }
}
