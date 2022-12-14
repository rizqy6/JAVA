public class TurunanAbstrakClass extends AbstrakClass {
    int x;

    public TurunanAbstrakClass (int a, int b, int c){
        super(a, b, c);
        x = a+b+c;
    }

    public void printX (){
        System.out.println(x);
    }
}
