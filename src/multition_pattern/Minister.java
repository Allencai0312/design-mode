package multition_pattern;

/**
 * @ClassName Minister
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-20 11:42
 * @Version 1.0
 */
public class Minister {

    public static void main(String[] args) {
        int ministerNum = 10;//10个大臣

        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("第" + (i+1) + "个大臣惨败的是：");
            emperor.emperorInfo();
        }
    }
}
