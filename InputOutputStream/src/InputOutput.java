import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String elem = reader.readLine();

            if(elem.equals("a")){
                break;
            }

            System.out.println(elem);
        }


    }
}
