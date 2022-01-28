package koreait.day17;

import java.util.Comparator;

public class MemberNameDecseding implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
	
		return o2.getName().compareTo(o1.getName());
	}

}
