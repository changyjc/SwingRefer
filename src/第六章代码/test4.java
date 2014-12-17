//这段程序代码主要为读者展示自动水平和垂直方向都会出现滚动条
import javax.swing.*;
public class test4
{
    static final int WIDTH=300;
    static final int HEIGHT=150;
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("测试程序");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JTextArea ta=new JTextArea("我们是某某软件公司的骨干开发人员，我们会竭诚为您服务！！！");//创建一个文本域组件和一个滚动条面板，并且将滚动条面板添加到顶层容器内
        JScrollPane sp=new JScrollPane(ta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS ,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS  );
        jf.setContentPane(sp);
  }
 }
