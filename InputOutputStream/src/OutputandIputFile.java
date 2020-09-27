import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputandIputFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inp = null;
        FileOutputStream out = null;

        try{
            inp = new FileInputStream("TestLecture.txt");
            out = new FileOutputStream("TestLecture1.txt");

            // Считываем и записывам в новый файл
            int digit;
            do{
                digit = inp.read();
                out.write(digit);

            }while (digit != -1);


        }
        catch (IOException e){
            System.out.println("Error read - write");
        }
        finally {
            out.write(123);
            out.write(123);
            out.write('\n');
            out.write(123);
            out.write(123);

            try {
                if(inp != null) inp.close();
                if(out != null) out.close();
            }
            catch (NullPointerException w){
                System.out.println("Null error");
            }

        }


    }
}
