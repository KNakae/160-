import java.awt.*;
import javax.swing.*;

public class AlohaWindow2{
	//変数をつくる
		static JFrame frame;
		static JLabel label;
		static JButton button;
		static Container ctnr;

	//mainメソッド	
	public static void main(String[] args) {
		// ウィンドウをつくる
		frame = new JFrame();
		frame.setSize(400,200);
		frame.setTitle("アオキ！");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		// ラベルをつくる
		label=new JLabel ("HELLO!");

		// ボタンをつくる
		button=new JButton("CLICK ME!");

		// ラベルとボタンをつくる
		ctnr=frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		// ウィンドウを表示する
		frame.setVisible(true);
	}
}