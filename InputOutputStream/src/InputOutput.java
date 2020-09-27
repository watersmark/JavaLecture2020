import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;

        try {
            int i;
            // Открываем файл
            file = new FileInputStream("TestLecture1.txt");
            do {
                i = file.read();
                System.out.print((char) i);
                //System.out.print(" ");
            } while (i != -1);

        }
        catch (IOException e){
            System.out.println("Io exception");
        }
        finally {
            // Пытаемся закрыть файл
            try {
                file.close();
            }
            catch (NullPointerException w){
                System.out.println("Error close file");
            }
        }

    }
}
