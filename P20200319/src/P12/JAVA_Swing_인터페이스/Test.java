package P12.JAVA_Swing_�������̽�;

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
		
		JButton btn1 = new JButton("�ȳ��ϼ���");
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
		System.out.println("��ư ������ �� ����� �ڵ�");
	}
	
}