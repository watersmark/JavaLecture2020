class GenT<T extends  Number> {
    T[] nums;

    public double sum_av = 0;


    GenT(T[] mass){
        this.nums = mass;
    }


    public void sum(){

        for(T i : nums){
            this.sum_av += i.doubleValue();
        }
    }

    public boolean eq(GenT<?> obj){
        return  this.sum_av == obj.sum_av;
    }
}


public class GenTest {
    public static void main(String[] args) {

        GenT<Integer> first = new GenT<Integer>(new Integer[]{2, 3, 4});
        GenT<Double> second = new GenT<Double>(new Double[] {1.2, 1.3, 1.22});
        GenT<Double> third = new GenT<Double>(new Double[] {2.0, 3.0, 4.0});

        first.sum();
        second.sum();
        third.sum();

        System.out.println(first.eq(second));
        System.out.println(first.eq(third));
        System.out.println();

    }
}
