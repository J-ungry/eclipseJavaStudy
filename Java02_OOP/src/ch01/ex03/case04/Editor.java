//정보 은닉 (Information Hiding)
//캡슐화 (Encapsulation)
package ch01.ex03.case04;

public class Editor {
	
	//다 private 로 만들기
	
	//field
	private String title ="이름\t주소\t\t전화번호\t\n";
	private String line = "=============================================\n";
	
	StringBuffer buffer = new StringBuffer();
	
	//method
	private void makeHeader() {
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody() {
		buffer.append("Jungry\t");
		buffer.append("Paju Korea\t");
		buffer.append("010-8921-8977\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
		buffer.append("\t\t\t작성일 : 8.18(목)");
	}
	
	public String getReport() {
		makeHeader();
		makeBody();
		makeFooter();
		
		return buffer.toString();
	}
}
