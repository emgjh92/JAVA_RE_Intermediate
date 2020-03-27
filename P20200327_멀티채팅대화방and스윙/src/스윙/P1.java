package ����;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class P1 {
	public static void main(String[] args) {
		
		FrameMonager.mainFrame = new MainFrame();
		
		
	}
}

class FrameMonager{
	static MainFrame mainFrame;
	static SubFrame subFrame;
	static ArrayList<STData> list = new ArrayList<STData>(); 
}


class MainFrame extends JFrame{
	
	JTextArea ja;
	
	MainFrame(){
		this.setTitle("�л� ���� ���α׷�");
		this.setLayout(null);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //���� ���
		
		this.setBounds(100,100,400,300); // ũ�� ����
		
		ja = new JTextArea();
		ja.setBounds(10,10,380,200);
		this.add(ja);
		
		JButton btnAdd = new JButton("�л��Է�"); //�л��Է� ��ư
		btnAdd.setBounds(10,220,100,30);
		this.add(btnAdd);
		btnAdd.addActionListener(e->{
			FrameMonager.subFrame = new SubFrame();
		});
		
		
		JButton btnClose = new JButton("����"); //���� ��ư
		btnClose.setBounds(160,220,100,30);
		this.add(btnClose);
		btnClose.addActionListener((e)->{
			FrameMonager.mainFrame.dispose();
			}); //���ٽ� ��� //���α׷� ����
		

		this.setVisible(true); //true�� ������ ��� ����
	}
	
}


class SubFrame extends JFrame{
	
	JTextField tfName;
	JTextField tfAge;
	
	SubFrame(){
		this.setTitle("�л� ���� �Է�");
		this.setBounds(200,200,300,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		JLabel lName = new JLabel("�̸�");
		lName.setBounds(10,10,40,30);
		this.add(lName); //�̸� ��
		
		tfName = new JTextField();
		tfName.setBounds(50,10,200,60);
		this.add(tfName); //�̸��Է�ĭ
		
		
		JLabel lAge = new JLabel("����");
		lAge.setBounds(10,110,40,30);
		this.add(lAge); //���� ��
		
		tfAge = new JTextField();
		tfAge.setBounds(50,110,200,60);
		this.add(tfAge); //���� �Է�ĭ
		
		JButton btnConfirm = new JButton("Ȯ��");
		btnConfirm.setBounds(10,210,180,30);
		this.add(btnConfirm);
		btnConfirm.addActionListener(new AddStudentInfoAction());
		
		
		
		this.setVisible(true);
	}
}

class AddStudentInfoAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = FrameMonager.subFrame.tfName.getText();
		String age = FrameMonager.subFrame.tfAge.getText();
		
		FrameMonager.list.add(new STData(name,age));
		
		JOptionPane.showConfirmDialog(null, "������ �ԷµǾ����ϴ�");
		
		FrameMonager.mainFrame.ja.setText("");
		
		String str = "";
		for(STData data:FrameMonager.list) {
			str +=data.name + " : " + data.age;
			str += "\n";
			
		}
		FrameMonager.mainFrame.ja.setText(str);
		
		FrameMonager.subFrame.dispose();
	}
	
}


class STData{
	String name;
	String age;
	
	STData(String name, String age){
		this.name = name;
		this.age = age;
	}
	
}





