package SingletonPattern;

/**
 * @ClassName SingletonPattern1
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-20 11:27
 * @Version 1.0
 */
public class SingletonPattern1 {
    private static final SingletonPattern1 singletonPattern = new SingletonPattern1();

    private SingletonPattern1(){

    }

    public synchronized static SingletonPattern1 getInstance() {
        return singletonPattern;
    }
}
