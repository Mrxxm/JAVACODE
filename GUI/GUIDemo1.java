import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo1 {
	public static void main(String[] args) {
		Frame f = new Frame("GUI界面");
		// 创建一个文本框
		TextField text = new TextField(30);
		// 将文本框放在窗口f的北部
		f.add(text, BorderLayout.NORTH);
		// 创建一个btn
		Button btn = new Button("click");
		f.add(btn);
		// 给按钮添加一个事件
		btn.addActionListener(new ActionListener(){ // 这里就是匿名内部类
			public void actionPerformed(ActionEvent e){
				String info = text.getText();       // 匿名内部类访问局部变量，局部变量要用final修饰
				System.out.println("hahhahah" + info);
			}
		}
		);
		f.pack();  // 自己调节窗口大小
		f.setVisible(true); // 显示组件
	}
}

/*
// 按钮点击事件
class MyButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("hahaha");
	}
}
*/