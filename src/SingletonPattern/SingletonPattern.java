package SingletonPattern;

/**
 * @ClassName SingletonPattern
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-20 11:22
 * @Version 1.0
 */
public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;
    //限制住不能直接产生一个实例
    private SingletonPattern() {

    }

    public SingletonPattern getInstance() {
        if (singletonPattern == null) { //如果还没有实例，则创建一个
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
