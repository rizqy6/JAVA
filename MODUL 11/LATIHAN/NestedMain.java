package LATIHAN;

public class NestedMain {
    public static void main(String[] args){
        NestedClass.StaticNestedClass a = new NestedClass.StaticNestedClass();
        a.aksesNama();

        NestedClass nested = new NestedClass();
        NestedClass.InnerClass inner = nested.new InnerClass();
        inner.aksesJurusan();
    }
}
