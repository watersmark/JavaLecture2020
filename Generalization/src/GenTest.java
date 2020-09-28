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

    public boolean eq(GenT<? extends Number> obj){
        return  this.sum_av == obj.sum_av;
    }
}

interface Runcer<T extends Comparable<T>>{

}

class Wrapper<T extends Number>{

    public <V extends Comparable<T>> T age(T age,V name){
        System.out.println(name);
        return  age;
    }


    public Wrapper<?> ages(Wrapper<? extends  Number> ff){
        return ff;
    }
}


public class GenTest {
    public static void main(String[] args) {

        int a = 32;
        double b = (double) a;
        System.out.println(b);

    }
}
