package koreait.day17;

public class Day17App1 {

	public static void main(String[] args) {
		// 다형성 예시입니다. - 객체의 실체는 1가지 그러나 여러가지 타입으로 참조 할 수 있습니다.
		// 어떤 메소드의 인자 타입이 RemoteControl이라면 mac1, mac2, mac3, mac4 모두 인자로 전달 할 수 있습니다.
		
		MacBook mac1 = new MacBook(); // 사나의 맥북
		SmartMachine mac2 = new MacBook(); // 부모타입으로 선언한 경우입니다. // 모모의 맥북
		
//		mac1 = mac2; 	// 다운캐스팅 (자식 타입으로 참조) - 강제형변환 필요
		mac2 = mac1;  	// 업캐스팅 (부모 타입으로 참조)
		
		RemoteControl rc = mac1;	// 업캐스팅
//		MacBook mb = rc;			// 다운 캐스팅 - 강제형변환 필요 
		
		mac1.turnOnOff();
		mac1.turnOnOff();
		
		//인터페이스 타입으로 선언한 경우입니다.
		RemoteControl mac3 = new MacBook(); 	// 나연의 맥북
		WebSearch mac4 = new MacBook();			// 다현의 맥북
		 
		mac1.setVolume(13);
		mac1.search("유튜브");
		
		mac3.setVolume(19);
//		mac3.search("YouTube"); // 오류의 원인 : mac3의 참조타입 RemoteControl은  search메소드 없습니다.
		
//		mac4.setVolume(13); // 오류의 원인 : mac4의 참조타입 WebSearch는  setVolume메소드 없습니다.
		mac4.search("유튜브");
		
//		필요하다면 casting 으로 메소드를 실행 합니다.
		MacBook temp = (MacBook)mac4; // temp와 mac4 참조변수가 저장하는 주소는 같다.
		temp.setVolume(11);
		
		
		WebSearch web = temp; // 자동 캐스팅 됩니다. temp 변수가 MacBook 타입이므로 자동 캐스팅.
		web = (WebSearch)mac3;  
		// 다현의 맥북을 가리키는 변수는 mac4, temp, Web이고 모두 같은 값입니다.
		
		// mac3이 RemoteControl타입.
		// 인터페이스의 static메소드는 Interface로만 사용할 수 있습니다.
		RemoteControl.changeBattery();
		
		//인터페이스의 인스턴스 메소드 : RemoteControl을 구현한 객체이면서 참조타입이 RemoteControl 그룹 중 하나 일 떄 모두 사용가능합니다.
//		mac4.setMute(false); // mac4변수는  참조타입이 RemoteControl과 관계 없어서 오류.
		
		mac3.setMute(true);
		
		
		
	}

}
