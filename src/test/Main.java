package test;

/**
 * @ClassName Main
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-16 19:05
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.change(a);

        System.out.println(a.age);
    }
}
