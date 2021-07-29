package composicao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Executar {
	public static void exe() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		Comment comment = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome!");
		
		post.addComment(comment);
		post.addComment(comment2);
		System.out.println(post);
		
	}
}
