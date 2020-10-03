interface temporable{

    int age(int a);

}

public class mains {
    public int temp1(temporable ar, int b){
        return ar.age(b) + 1;

    }

    public static void main(String[] args) {
        final int a = 2;

        mains first = new mains();
        int age_man = first.temp1(((int aged) -> aged), 21);
        System.out.println(age_man);
    }
}
