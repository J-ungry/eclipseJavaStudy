package java_study.co.kr.joongbu.case01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class TextEditor extends JFrame{
	JTextArea ta; // textArea 생성 
	JMenuBar mb; // 메뉴바 
	JMenu menu;
	JMenuItem miNew,miOpen,miSave,miExit; //드롭다운 메뉴에 들어갈 애 
	
	public TextEditor() {
		super("텍스트 편집기");//부모의생성자 호출 -> 그러 JFrame 생성자에는 창 이름이 들어가게 돼는거 ?
		ta = new JTextArea();
		mb = new JMenuBar();
		menu = new JMenu("파일");
		miNew = new JMenuItem("새로 만들기");
		miOpen = new JMenuItem("열기");
		miSave = new JMenuItem("저장");
		miExit = new JMenuItem("끝내기");
		
		menu.add(miNew);
		menu.add(miOpen);
		menu.add(miSave);
		menu.add(miExit);
		mb.add(menu);
//		this.add(mb);
		this.setJMenuBar(mb);
		this.add(ta);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		miOpen.addActionListener((e)->{
			JFileChooser fileChooser = new JFileChooser();
			int option = fileChooser.showOpenDialog(this); // 매개변수로 주가 되는 창을 띄워줘야하는데 지금은 나 자신이므로 this를 넣어준다 
			if(option == JFileChooser.APPROVE_OPTION) { //파일이 선택되면 
				File file = fileChooser.getSelectedFile(); //파일을 반환받는다 (선택한 파일)
				try {
					Scanner scanner = new Scanner(file);
					while(scanner.hasNext()) {
						String line = scanner.next();
						System.out.println(line);
						ta.append(line+"\n");
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
	
	
	
}

public class L24TextEditor {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.setBounds(10,10,400,400);
		editor.setVisible(true);
	}

}
