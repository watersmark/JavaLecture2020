import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputandIputFile {
    public static void main(String[] args) throws IOException {

      final FileInputStream inp = new FileInputStream("TestLecture.txt");

        try(  inp;
             FileOutputStream out =  new FileOutputStream("TestLecture1.txt")){

            // Считываем и записывам в новый файл
            //inp = new FileInputStream("dsds");
            int digit;
            do{
                digit = inp.read();
                out.write(digit);

            }while (digit != -1);


        }
        catch (IOException e){
            System.out.println("Error read - write");
        }



    }
}
