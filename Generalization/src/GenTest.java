class GenT<T extends Number> {
    T[] nums;


    GenT(T[] mass){
        this.nums = mass;
    }


    public int sum(){
        int  sum = 0;

        for(T i : nums){
            sum += Integer.parseInt(String.valueOf(i));
        }
        return sum;
    }

}


public class GenTest {
    public static void main(String[] args) {

        GenT<Integer> first = new GenT<Integer>(new Integer[]{2, 3, 4});
        System.out.println( first.sum());

    }
}
