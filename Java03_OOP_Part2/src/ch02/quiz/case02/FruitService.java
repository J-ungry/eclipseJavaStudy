package ch02.quiz.case02;


public class FruitService extends Template{

	public int menu() {
		
		System.out.println("===== MENU =====");
		System.out.println("1. CREATE FRUIT");
		System.out.println("2. OUTPUT");
		System.out.println("3. MODIFY");
		System.out.println("4. DELETE");
		System.out.println("0. END THE PROGRAM");
		System.out.print(">> ");
		return sc.nextInt();
	}

	@Override
	public void input(Object[] o) {
//		Fruit[] f = (Fruit[]) o; //downcasting => object가 fruit 가 가진 애들만 사용할 수 있게끔 만들어주는거임 !!!!! 
		
//		if(cnt==f.length) {
//			System.out.println("더이상 입력할 수 없어용");
//			return;
//		}
//		f[cnt] = new Fruit();
//		System.out.print("과일 명 입력 >>>");
//		f[cnt].setFruitName(sc.next());
//		
//		System.out.print("가격 입력 >>> ");
//		f[cnt].setPrice(sc.nextInt());
//		
//		cnt ++;
		
		if(cnt == o.length) {
			return;
		}
		Fruit f= new Fruit();
		System.out.print("과일 명 입력 >>>");
		f.setFruitName(sc.next());
		System.out.print("가격 입력 >>> ");
		f.setPrice(sc.nextInt());
		o[cnt] = f;
		cnt ++;   //이렇게 만들 수 도 있음 !!!
		
		
	}

	@Override
	public void output(Object[] o) {
		Fruit[] f = (Fruit[]) o;
		
		if(cnt ==0) {
			System.out.println("출력할게 없어용");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("과일명 >>" + f[i].getFruitName());
			System.out.println("과일 가격  >>" + f[i].getPrice());
			System.out.println();
		}
		
	}

	@Override
	public void modify(Object[] o) {
		Fruit[] f = (Fruit[]) o;
		
		if(cnt ==0) {
			System.out.println("출력할게 없쪄용 ");
			return;
		}
		System.out.print("수정하고싶은 과일 이름 입력 >>> ");
		String name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(f[i].getFruitName().equals(name)) {
				System.out.print("수정하고싶은 가격을 입력하세요 >>>");
				f[i].setPrice(sc.nextInt());
				System.out.println("수정 완료 !!!");
				return;
			}
		}
	}

	@Override
	public void delete(Object[] o) {
		Fruit[] f = (Fruit[]) o;
		if(cnt ==0) {
			System.out.println("삭제할게 없어용 !");
			return;
		}
		System.out.print("삭제하고 싶은 과일 이름 입력 >>>> ");
		String name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(f[i].getFruitName().equals(name)) {
				for(int j=i; j<cnt-1; j++) {
					f[j]= f[j+1];
				}
				cnt --;
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("삭제하고자 하는 아이디가 없습니다");
		
	}
	

}
