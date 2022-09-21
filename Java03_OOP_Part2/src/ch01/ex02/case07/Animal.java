package ch01.ex02.case07;

public class Animal {

   private String animalName;
   
   public Animal(String animalName) { // 오버로딩
      this.animalName = animalName;
   }

   public String getAnimalName() {
      return animalName;
   }
}
