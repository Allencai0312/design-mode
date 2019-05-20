package multition_pattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Emperor
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-20 11:34
 * @Version 1.0
 */
public class Emperor {
    private static int maxNumOfEmperor = 2; //最多只能有两个皇帝
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor); //皇帝叫什么名字
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor); //装皇帝的列表
    private static int countNumOfEmperor = 0; //正在被人尊称的是哪个皇帝

    static {
        //把所有的皇帝都产生出来
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    //就这么多皇帝了，不允许再推举一个皇帝（new 一个皇帝）
    private Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    public Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);//随机拉出一个皇帝,只要是个精神领袖就成
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    //皇帝叫什么名字呀
    public void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
