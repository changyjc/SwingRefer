//这段程序代码主要是为读者展示一个不需要主运行函数的JApplet是如何被创建的
import java.JApplet.*;



public class test2 extends JApplet
{
public void init()//在init方法中输出一段话，就是在初始化页面时会输出它
{
System.out.println("欢迎大家进入JApplet程序学习页面!");
}
public void start()//在start方法中输出一段话，就是在运行时会输出它
{
System.out.println("现在程序正在运行。");
}
public void stop()
{
System.out.println("程序停止运行了。");//在stop方法中输出一段话，就是在暂停时会输出它
}
}
