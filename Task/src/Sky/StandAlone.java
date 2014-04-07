package Sky;

public class StandAlone {
	int stdid;
	String sname;
	private long stdacc;
	private int stdkey;
	int a;
	int b;
	int c;
	
	// To pass the values through constructor i.e parameter constructor
	StandAlone(int stdid, String sname) {
		this.stdid = stdid;
		this.sname = sname;
	}
	//process of method overloading
	void setSum(int x,int y)
	{
		a=x;
		b=y;
	}
	int  getSum()
	{
		 return c=a+b;
		
	}
	void setSum(long x,long y)
	{
		a=(int) x;
		b=(int) y;
	}
	

	// To pass and obtain the values by get() and Set() methods
	void setStdBank(long a, int b) {
		stdacc = a;
		stdkey = b;
	}

	void getStdDetails() {
		System.out.println("The acc number:" + stdacc);
		System.out.println("The key value:" + stdkey);
	}

	public StandAlone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Welcome to java");

		StandAlone obj = new StandAlone();
		obj.stdid = 7;
		obj.sname = "James";
		// Passing the values to Parameter constructor
		StandAlone in = new StandAlone(9, "bond");
		System.out.println(in.sname);
		System.out.println(in.stdid);
		// Tp print the values of object expliicitly
		System.out.println(obj.stdid);
		System.out.println(obj.sname);
		// passing the values to the method
		StandAlone m = new StandAlone();
		m.setStdBank(777, 101);
		m.getStdDetails();
        StandAlone s=new StandAlone();
        s.setSum(12,15);
        System.out.println("The sum results is:"+s.getSum());
        s.setSum(230,999);
        System.out.println("The large sum results is:"+s.getSum());
	}

}
