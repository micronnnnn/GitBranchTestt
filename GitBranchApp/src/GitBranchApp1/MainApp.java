package GitBranchApp1;

public class MainApp {
	
	public static void main(String[]args) {
		//組長
		System.out.print("1st Version");
		//組長(新增的)
		Math cMath=new Math();
		System.out.println(cMath.add(1, 2));
		
		
	}

}

class Math{
	int add(int a,int b) {
		return a+b;
	}
}
