package koreait.day17;

import java.util.Comparator;

public class MemberNameAcseding implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
	
		return o1.getName().compareTo(o2.getName());
	}

}
