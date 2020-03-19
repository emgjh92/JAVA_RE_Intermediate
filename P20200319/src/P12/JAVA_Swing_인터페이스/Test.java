package P12.JAVA_Swing_인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test {
	public static void main(String[] args) {
		
		new TestFrame(); 
	}
}

class TestFrame extends JFrame{
	
	public TestFrame() {
		
		this.setLayout(null);
		this.setBounds(100, 100, 300, 300);
		
		JButton btn1 = new JButton("안녕하세요");
		btn1.setBounds(10, 10, 150, 40);
		
		ActionListener t = new TTTTT();
		btn1.addActionListener(t);
		
		this.add(btn1);
		
		this.setVisible(true);
	}
	
}

class TTTTT implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 눌렀을 때 실행될 코드");
	}
	
}