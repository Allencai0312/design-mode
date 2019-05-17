package strategy_pattern;

/**
 * @ClassName BackDoor
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-14 09:26
 * @Version 1.0
 * 找乔国老帮忙，使孙权不能杀刘备
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
