package koreait.day16;

public abstract class CreditCard {
	//1) * 부모크래스는 자식클래스가 사용하도록 protected로 합니다.
	
	protected String owner;	// 소유자
	protected int limit;	// 이용한도
	protected int payTotal;	// 결제금액
	
	public abstract int upLimit(int plus); 
	public abstract int pay(int money);
	
	public CreditCard(String owner) {
		this.owner = owner;
	}
	

	public String getOwner() {
		return owner;
	}

	public int getLimit() {
		return limit;
	}

	public int getPayTotal() {
		return payTotal;
	}
}
