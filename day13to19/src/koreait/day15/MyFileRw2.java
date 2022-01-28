package koreait.day15;

public class MyFileRw2 {
	
	public static void main(String[] args) {
		
		MyFileRw.fileRead("C:\\Temp\\Dev\\자바테스트.txt");	
		MyFileRw.fileRead("C:\\Temp\\Dev\\DirectX.log");
		
		String []menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		Member[]members = {new Member("모모",17), new Member("사나",21),null,null,null};
//		System.out.println(members.length);
		members[2] = new Member("쯔위",22);
		members[3] = new Member("나연",19);
		members[4] = new Member("다현",18);
		
		//위 2개 배열을 C:\\Temp\\Dev\\members.txt 파일에 쓰기 해보세요
		String filename = "C:\\Temp\\Dev\\members.txt"; 
		MyFileRw.fileWrite(filename, menu);
//		MyFileRw.fileWrite(filename, members); // 같은 파일때는 덮어쓰기
			
	}
}
