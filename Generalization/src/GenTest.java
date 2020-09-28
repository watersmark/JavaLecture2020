class TestGen<T extends Integer, V extends Integer>{
    private T temp1;
    private V temp2;


    public void init(T first, V second){
        this.temp1 = first;
        this.temp2 = second;
    }

    public int sum(){

        return (int)temp1 + (int) temp2;
    }

}


public class GenTest {
    public static void main(String[] args) {




    }
}
