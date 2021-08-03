import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloVyacheslav {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputName = reader.readLine();

        String texttrue = "Привет, Вячеслав";
        String textfalse = "Нет такого имени";

        if(inputName.equals("Вячеслав")) {
            System.out.println(texttrue); }
            else {
            System.out.println(textfalse);
        }
    }
}
