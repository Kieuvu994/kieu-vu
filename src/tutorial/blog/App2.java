package tutorial.blog;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		String cmd = "";
		//Boolean exit=true;
		do {
			System.out.print("cmd  >  ");
			cmd=sc.nextLine();
			Map<String, String> map =service.process(cmd);
			Set<String> keys = map.keySet();
			for(String key : keys) {
				System.out.println(  key +" = " +map.get(key));
			}
			
		}while(!"exit".equalsIgnoreCase(cmd));
	}

}
