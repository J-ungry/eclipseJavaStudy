package ch01.ex01.quiz.case01;

public class Info {

	double height;
	double weight;
	String name;
	int age;
	String gender;
	
	void showInfo() {
		System.out.printf("키가 %.1f 이고 , 몸무게가 %.1f인 %s이 있습니다 \n",height,weight,gender);
		System.out.printf("이름은 %s이고 나이는 %d세 입니다  ",name,age);
	}
}
