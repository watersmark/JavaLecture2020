import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("TestLecture.txt");

        int digit;

        do{
            digit = file.read();

            System.out.print((char) digit);
            System.out.print("");

            if((char) digit == '\n'){
                System.out.print("$");
            }
            if((char) digit == ' '){
                System.out.print("#");
            }

        }while (digit != -1);

        file.close();

    }
}
