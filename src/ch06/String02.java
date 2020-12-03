package ch06;

//System.out.println("======concat======");
//System.out.println("==================");
public class String02 {
	public static void main(String[] args) {
		System.out.println("======concat======");
		String s = new String("Hello");
		s = s.concat(" Java");
		System.out.println(s);
		System.out.println("==================");
		System.out.println();
		
		System.out.println("======charAt======");
		String a = "Hello";
		System.out.println(a.charAt(1));
		System.out.println("==================");
		System.out.println();

		System.out.println("====codePointAt===");
		String b = "JAVA";
		System.out.println(b.codePointAt(1));
		System.out.println("==================");
		System.out.println();
		
		System.out.println("=====compareTo====");
		String c = "c";
		String e = "e";
		System.out.println(c.compareTo(e));
		System.out.println("==================");
		System.out.println();
		
		System.out.println("=====contains=====");
		String d = "Java";
		String f = "Jv";
		System.out.println(d.contains(f));
		System.out.println("==================");
		System.out.println();
		
		System.out.println("======length======");
		String g = "four";
		System.out.println(g.length());
		System.out.println("==================");
		System.out.println();
		
		System.out.println("======replace=====");
		String h = "Complete";
		System.out.println(h.replace("lete", "uter"));
		System.out.println("==================");
		System.out.println();
		
		System.out.println("======split======");
		String i = "id:1,pw:2";
		String[] j = i.split(",");
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println("=================");
		System.out.println();
		
		System.out.println("=====subString====");
		String k = "abcdefghijk";
		String l = k.substring(4);
		System.out.println(k.charAt(4));
		System.out.println(l);
		System.out.println("==================");
		System.out.println();
		
		System.out.println("====toLowerCase===");
		String m = "ABcDE";
		System.out.println(m.toLowerCase());
		System.out.println("==================");
		System.out.println();
		
		System.out.println("====toLowerCase===");
		String n = "abCde";
		System.out.println(n.toUpperCase());
		System.out.println("==================");
		System.out.println();
		
		System.out.println("=======trim=======");
		String o = "        b l a n k         ";
		System.out.println(o.trim());
		System.out.println("==================");
		System.out.println();
	}
}
