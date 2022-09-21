package java_study.co.kr.joongbu.case01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class L11Swing {
	static boolean start = true;
	public static void main(String[] args) {
		//JFrame Swing GUI를 제공하는 객체 
		JFrame frame = new JFrame();
		JButton btn1 = new JButton("시간 출력 ");
		JButton btn2 = new JButton("시간 멈춤 ");
		JLabel label = new JLabel("현재 시간 출력 ");
		label.setFont(new Font("Serif",Font.BOLD,20));
		
//		boolean start = true; //익명클래스에서 지역변수 참조할 떄 그것을 상수로 취급한다. 따라서 전역으로 ㅁ나듬 
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start = true;
				new Thread(()-> {while(start) { //누를때마다 쓰레드가 생성되기 때문에 실행 속도가 빨라진것 처럼 보인다 
					System.out.println("button work");
					String now = LocalTime.now().toString();
					label.setText(now);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				} //component의 thread를 독점하기 때문에 아무런 동작도 하지 않는다 
				
			}).start();
		}});
		
		btn2.addActionListener((e)->{
			start = false;
		});
		
		
		
		frame.setLayout(null);//레이아웃을 없애면 위치나크기로 컴포ㅌ넌트의 위치를 지정하 수 있다
		btn1.setBounds(0, 0, 100, 80); //frame 에 존재할위치와 크기 지정 
		btn2.setBounds(150, 0, 100, 80);
		label.setBounds(0, 100, 300, 100);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(label);
		frame.setBounds(100,100,300,200);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}