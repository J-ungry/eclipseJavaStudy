package ch03.ex01.case07;

public abstract class Baby implements Person{

//	@Override
//	public void breathe() {
//		// TODO Auto-generated method stub
//		
//	}
	//구혛나기 싫으면 abstract 붙여놓으면 된다 

	@Override
	public void eat() {
		System.out.println("응애 이유식 먹기 ~ ");
	}

}
