package my;

import javax.swing.*;

public class MyDemo {

    public static void main (String[] args) {

        MyFrame frame = new MyFrame("标题");

        //窗口关闭时，退出整个程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置窗口大小
        frame.setSize(400,300);

        //显示窗口
        frame.setVisible(true);
    }
}
