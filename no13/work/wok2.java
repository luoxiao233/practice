package work;

public class wok2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		o.method();
	}

}

class O {
	private int num = 20;

	private class I {
		public void print() {
			System.out.println(num);
		}
	}

	public void method() {
		I a = new I();
		a.print();
	}
}
