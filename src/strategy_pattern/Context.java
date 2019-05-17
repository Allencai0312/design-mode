package strategy_pattern;

/**
 * @ClassName Context
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-14 09:31
 * @Version 1.0
 * 计谋有了，那还要有锦囊
 */
public class Context {

    //构造函数你要使用哪个妙计
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    //使用计谋，看我出招
    public void operate(){
        this.iStrategy.operate();
    }
}
