package SingletonPattern;

/**
 * @ClassName Minister
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-16 17:16
 * @Version 1.0
 * 大臣是天天你要见皇帝，今天见的皇帝和昨天的，前天的不一样那就出问题了！
 */
public class Minister {

    public static void main() {
        //第一天
        Emperor emperor = Emperor.getInstance();
        emperor.emperorInfo();//第一天见得皇帝叫什么名字？
    }
}
