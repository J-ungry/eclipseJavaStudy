package java_study.co.kr.joongbu.case01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class L19StreamAPIEx5 {
	class Student{
		//public (어디서든) protec ted(상속) default(같은패키지안에서 ) private(클래스내부에서)
		private String name;
		private boolean isMale;
		private int hak;
		private int ban;
		private int score;
		public Student(String name,boolean isMale,int hak,int ban,int score) {
			this.name=name;
			this.isMale=isMale;
			this.hak=hak;
			this.ban=ban;
			this.score=score;
		}
		
		//캡슐화에 대해 아는 마ㄴ큼 설명하라, vo dto 가 무엇인가요 ? 디자인 패턴 => 이거 3개는 같이 연결해서생각하면 된다 
		public String getName() {return name;}
		public boolean isMale() {return isMale;}
		public int getHak() {return hak;}
		public int getBan() {return ban;}
		public int getScore() {return score;}
		
		
		@Override
		public String toString() {
			return "{"+name +","+isMale+","+hak+","+ban+","+ score+"}";
		}
	}

	public static void main(String[] args) {


		L19StreamAPIEx5 out=new L19StreamAPIEx5();
		List<Student> studentList=new ArrayList<Student>();
		
		studentList.add(out.new Student("나자바", true, 1, 1, 300));
		studentList.add(out.new Student("김지미", false, 1, 1, 250));
		studentList.add(out.new Student("김자바", true, 1, 1, 200));
		studentList.add(out.new Student("이지미", false, 1, 2, 150));
		studentList.add(out.new Student("남자바", true, 1, 2, 100));
		studentList.add(out.new Student("안지미", false, 1, 2, 50));
		studentList.add(out.new Student("황지미", false, 1, 3, 100));
		studentList.add(out.new Student("강지미", false, 1, 3, 150));
		
		studentList.add(out.new Student("나자바", true, 2, 1, 300));
		studentList.add(out.new Student("김지미", false, 2, 1, 250));
		studentList.add(out.new Student("김자바", true, 2, 1, 200));
		studentList.add(out.new Student("이지미", false, 2, 2, 150));
		studentList.add(out.new Student("남자바", true, 2, 2, 100));
		studentList.add(out.new Student("안지미", false, 2, 2, 50));
		studentList.add(out.new Student("황지미", false, 2, 3, 100));
		studentList.add(out.new Student("강지미", false, 2, 3, 150));

		studentList.add(out.new Student("나자바", true, 3, 1, 300));
		studentList.add(out.new Student("김지미", false, 3, 1, 250));
		studentList.add(out.new Student("김자바", true, 3, 1, 200));
		studentList.add(out.new Student("이지미", false, 3, 2, 150));
		studentList.add(out.new Student("남자바", true, 3, 2, 100));
		studentList.add(out.new Student("안지미", false, 3, 2, 50));
		studentList.add(out.new Student("황지미", false, 3, 3, 100));
		studentList.add(out.new Student("강지미", false, 3, 3, 150));
		//자료를 상상하고 구조화 하는 연습 => 자료를 처리 => 필요한 자료 
		//lazy 연산(연산 지연)
		

		//////////1학년 남자들의 점수/////////////
		System.out.println("1학년 남자들의 점수");
		Optional<Integer> boySum = studentList.stream()
			.filter(x->x.isMale)
			.filter(x->x.getHak()==1)
			.map(x->x.getScore())
			.reduce((x1,x2)->x1+x2);  //=> 만들고 보니 점수의 총합 ;; 
		
		System.out.println(boySum.get());
		
		Optional <String> boySum2 = studentList.stream()
				.filter(Student::isMale)
				.filter(x->x.getHak()==1)
				.map(x->x.getScore()+"") //11-> "11"
				.reduce((s1,s2)->s1+","+s2);
		System.out.println(boySum2.get());
//			.forEach(System.out::println);; //foreach 는 반환하는게 없어서 안된다 !!
		
		studentList.stream()
		.forEach((s)->{
			if(s.getHak()==1&&s.isMale()) {
				System.out.printf(s.getScore()+",");
			}
		});
		System.out.println();
		
		for(Student s : studentList) {
			if(s.getHak()==1 && s.isMale) {
				System.out.printf(s.getScore()+",");
			}
		}
		System.out.println();

		/////////2학년 여자들의 점수///////////
		System.out.println("2학년 여자들의 점수");
		studentList.stream()
		.filter(x->!x.isMale)
		.filter(x->x.getHak()==2)
		.map(x->x.getScore())
		.forEach(x->System.out.printf(x+" "));
		System.out.println();
			
		/////////////1한년의 남자 여자의 수를 collect로 구현하세요!/////////////
		Map<Object, List<Student>> grouping =  studentList.stream()
		.filter(x->x.getHak()==1)
		.collect(Collectors.groupingBy(x->x.isMale));
		
		System.out.println("1학년 여자의 수 " +grouping.get(false).size());
		System.out.println("1학년 남자의 수 "+grouping.get(true).size());


		//1한년을 남자 여자의 그룹으로 나누고 다시 통과(score>=150)와 낙제 그룹으로 나누세요. //partitioningBy 사용하기
//		Map<Boolean, List<Student>> groupingGenderScore =  studentList.stream()
//				.filter(x->x.getHak()==1)
//				.collect(Collectors.partitioningBy(x->x.isMale));
//		

		
		
//		System.out.println(groupingGenderScore);
		//1학년 남자,여자 그룹의 평균 점수를 구하세요
		Map<Boolean, Double> groupingAvg = studentList.stream()
				.filter(x->x.getScore()==1)
				.collect(Collectors.partitioningBy(Student::isMale,Collectors.averagingInt(x->x.getScore())));
		
		System.out.println(groupingAvg);
		//각학년별 남자 여자 그룹의  접수가 가장 높은 사람을 구하세요 //집계함수 사용하기 
		Map<Boolean, Optional<Student>> groupingMaxScore = studentList.stream()
				.filter(x->x.getHak()==2)
				.collect(Collectors.partitioningBy(Student::isMale,Collectors.maxBy(Comparator.comparing(Student::getScore))));
		
		System.out.println("최고 점수 >> "+groupingMaxScore);
 		//2학년을 남자 여자의 그룹으로 나누고 다시 통과한 사람과 낙제한 사람의 수를 구하세요 
		//모든 학년을 그룹으로 나누고 학년마다 남자 와 여자 그룹의 수를 구하세요

		
	
		//모든 학년을 그룹으로 나누고 학년마다 반 그룹으로 나누세요 
	}

	private static Collector groupingBy(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
