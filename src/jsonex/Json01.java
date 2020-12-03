package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Comment {
	private int id;
	private String content;
}

public class Json01 {
	public static void main(String[] args) {
		Comment cm1 = new Comment(1, "´ñ±Û");
		
		Gson gson = new Gson();
		
		String cm1Json = gson.toJson(cm1);
		System.out.println(cm1Json);
		
		Comment cm2 = gson.fromJson(cm1Json, Comment.class);
		System.out.println(cm2);
	}
}
