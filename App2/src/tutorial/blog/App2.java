package tutorial.blog;

import java.util.Scanner;

import tutorial.blog.service.BlogService;
import tutorial.blog.service.BlogMemoryDAO;
/**
 * 
 * @author wings math VU;
 * @email kieuvu994@gmail.com
 */
public class App2 {
	

	public static void main(String[] args) {
		App2.run(new BlogService(new BlogMemoryDAO() ));
		// TODO Auto-generated method stub

	}

	private static void run(BlogService service) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cmd;
		Boolean exit=true;
		do {
			System.out.println("cmd>");
			cmd=sc.nextLine();

			
		}while(!"exit".equalsIgnoreCase(cmd));
	}

}
