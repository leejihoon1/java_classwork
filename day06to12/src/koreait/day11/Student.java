/*
 * Access Modifier
 

[접근한정자] public, default, protected, private  - 필드와 메소드(생성자 포함)
Q1.  동일한 패키지의 클래스 상속에서 제외되는 필드 또는 메소드의  접근한정자는?     private

Q2.  다른 패키지의 클래스를 부모클래스로 하여 자식클래스를 정의할 것이다. 
     이 때 필드 또는 메소드를 상속하기 위해 사용할 수 있는 접근한정자는?                  public protected

Q3. com.koreait.abc 패키지의 클래스 ClassA를 com.koreait.abc2 패키지의 클래스 ClassB가 상속받을 것이다. 
이 때 클래스 ClassB에 필요한 import 문을 쓰시오.             Import com.koreait.abc.ClassA;s

Q4. 다음과 같이 클래스가 정의되어 있다. Student 클래스에서 오류가 발생한다. 
    오류를 수정할 수 있는 2가지 방법은?
  public class People {
            int id;

	1)People( ){ }	// 1)번 
   
            People(int id) {
                this.id = id;
            }
  }
   public class Student extends People {  
  	2) Student (int id){  // 2)번
	        super(id);
		
	}	
		// 오류원인 : 아무것도 작성되지 않았을때 , default생성자입니다. 부모 클래스에 default생성자가 없습니다.
		//1) 부모클래스가 default 생성자를 갖거나,  2) 자식클래스가 부모 클래스와 같은 형식의 커스텀 생성자를 갖도록 합니다.
   }

Q5.  public class Student extends People {  } 로 정의된 클래스를 
      아래와 같이 사용하는 경우 오류가 발생하는 구문은?  

       ① Student   kim = new Student();  
       ② People  lee = new Student();	 
       ③ People choi = new People();	 
       ④ Student kang = new People();  // 에러 부모객체를 자식타입으로 참조하면 오류입니다.

Q6. 아래와 같이 정의된 클래스를 사용하는 구문 중 오류가 발생하는 구문은?  

   public class People {
           int id;
   }

   public class Student extends People {
	  
          String hno;   	
   }

       ① Student   kim = new Student();    kim.hno = "20201101";  
       ② People  lee = new Student();     lee.hno = "20201101";   // 오류
       ③ People choi = new People();     choi.id= 20201101;
       ④ Student   kang = new Student();    kang.id = 20201101;
       
      */








