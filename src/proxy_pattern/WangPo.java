package proxy_pattern;

/**
 * @ClassName WangPo
 * @Description TODO
 * @Author allen
 * @Date: 2019-05-15 09:03
 * @Version 1.0
 * 王婆这个人老聪明了，她太老了，是个男人都看不上
 * 但是她有智慧和经验，作为一类女人的代理！
 */
public class WangPo implements KindWomen {
   private KindWomen kindWomen;

    public WangPo() {//默认的话，是潘金莲的代理
        this.kindWomen = new PanJinLian();
    }

    //她可以是KindWomen的任何一个女人的代理，只要你是这一类型
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();//自己老了，干不了，可以让年轻的代替
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();//王婆这么大年龄，谁看她抛媚眼？！
    }
}
