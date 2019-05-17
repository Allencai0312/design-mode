package strategy_pattern;

/**
 * @ClassName GivenGreenLight
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-14 09:28
 * @Version 1.0
 * 求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，方行！");
    }
}
