package koreait.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard{
	// 시나리오 : 카카오미니는 학생용 카드. 한도 최대금액  있습니다. 이용한도
	public static final int MAX_LIMIT = 100000; // 한도 최대금액
	
	public KakaoMini(String owner) {
		super(owner);
		
	}
	
	@Override
	public int upLimit(int plus) {
		if(limit+plus > MAX_LIMIT)return 0;
		else limit += plus;
		return plus;
	}
		
	@Override
	public int pay(int money) {
		if(payTotal+money > limit)return 0;
		else { payTotal += money;
		return money;
		}
	}
	@Override
		public String toString() {
			DecimalFormat df = new DecimalFormat("###,###,### 원"); 
			return owner +" 님. 이번달 결제 예정금액" + df.format(payTotal)
				+" 입니다. \n[이용한도 " + df.format(limit)+"]";
		}
		
	
	
}







