package 스윙;

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
		this.setTitle("학생 관리 프로그램");
		this.setLayout(null);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //종료 명령
		
		this.setBounds(100,100,400,300); // 크기 지정
		
		ja = new JTextArea();
		ja.setBounds(10,10,380,200);
		this.add(ja);
		
		JButton btnAdd = new JButton("학생입력"); //학생입력 버튼
		btnAdd.setBounds(10,220,100,30);
		this.add(btnAdd);
		btnAdd.addActionListener(e->{
			FrameMonager.subFrame = new SubFrame();
		});
		
		
		JButton btnClose = new JButton("종료"); //종료 버튼
		btnClose.setBounds(160,220,100,30);
		this.add(btnClose);
		btnClose.addActionListener((e)->{
			FrameMonager.mainFrame.dispose();
			}); //람다식 사용 //프로그램 종료
		

		this.setVisible(true); //true로 설정해 줘야 보임
	}
	
}


class SubFrame extends JFrame{
	
	JTextField tfName;
	JTextField tfAge;
	
	SubFrame(){
		this.setTitle("학생 정보 입력");
		this.setBounds(200,200,300,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		JLabel lName = new JLabel("이름");
		lName.setBounds(10,10,40,30);
		this.add(lName); //이름 라벨
		
		tfName = new JTextField();
		tfName.setBounds(50,10,200,60);
		this.add(tfName); //이름입력칸
		
		
		JLabel lAge = new JLabel("나이");
		lAge.setBounds(10,110,40,30);
		this.add(lAge); //나이 라벨
		
		tfAge = new JTextField();
		tfAge.setBounds(50,110,200,60);
		this.add(tfAge); //나이 입력칸
		
		JButton btnConfirm = new JButton("확인");
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
		
		JOptionPane.showConfirmDialog(null, "정보가 입력되었습니다");
		
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





