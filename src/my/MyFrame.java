package my;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {

    JLabel timeLabel = new JLabel("时间");
    JTextField textField  = new JTextField(20);
    public MyFrame(String title) {

        super(title);

        JPanel root = new JPanel();
        JButton printTextButton = new JButton("输出文本");
        JButton printTimeButton = new JButton("输出时间");


        textField.setText("这是默认文本");

        root.add(printTextButton);
        root.add(printTimeButton);
        root.add(timeLabel);
        root.add(textField);

        this.setContentPane(root);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //使用匿名内部类
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                showTime();
//            }
//        });

        printTextButton.addActionListener((a) -> {
            showText();
        });

        printTimeButton.addActionListener(a -> showTime());
    }



     public void showTime(){

         //取得时间
         SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

         textField.setText(sdf.format(new Date()));
    }

    public void showText(){
        System.out.println(this.textField.getText());
    }
}
