package koreait.day16;

import java.text.DecimalFormat;

public class KakaoVIP extends CreditCard{
	
	public static final int MAX_LIMIT = 20000000;   
	
	private int point;
	
	public KakaoVIP(String owner,int limit) {
		super(owner);
		this.limit=limit;
		System.out.println("고객님이 원하시는 한도 " + limit +"원으로 설정되었습니다.");
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public int upLimit(int plus) {
		limit +=plus;
		System.out.println("고객님은 제한없이 한도 조정 가능합니다.[" + limit + " 입니다.]");
		return plus;
	}
	
	@Override
	public int pay(int money) {		//money를 포함한 총사용금액이  limit를 초과하면
		if(payTotal+money > limit) {//자동으로 한도 5000000 증가
			upLimit(5000000);	
		}
		payTotal+=money;				
		this.point+=money*0.01;		//
		return money;				//VIP카드는 포인트가 있고 포인트 사용금액 0.1%
	}
		@Override
		public String toString() {
			DecimalFormat df = new DecimalFormat("###,###,### 원"); 
			return owner +" 님. 이번달 결제 예정금액" + df.format(payTotal)
				+" 입니다. \n[이용한도 " + df.format(limit)+ "]";
			
	}
	
}
