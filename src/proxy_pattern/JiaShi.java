package proxy_pattern;

/**
 * @ClassName JiaShi
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-15 09:16
 * @Version 1.0
 */
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏正在Happy中......");
    }
}
