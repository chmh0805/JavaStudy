package ch04;

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public Rectangle() {}
	
	public int square() {
		return (this.width * this.height);
	}
	
	public void show() {
		System.out.println("("+this.x+","+this.y+")에서 크기가 "+this.width+"x"+this.height+"인 사각형");
	}

	public boolean contains(Rectangle r) {
		return (this.y <= r.y & this.x <= r.x & (this.x + this.width) > (r.x + r.width) & (this.y + this.height) > (r.y + r.height));
	}
	
}

public class P4_4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

}
