package ch04;

class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song(String t, String a, int y, String c) {
		this.title = t;
		this.artist = a;
		this.year = y;
		this.country = c;
	}
	
	public Song() {}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
}

public class P4_3 {

	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s1.show();

	}

}
