package tutorial.blog.service;

import java.util.List;
import java.util.ArrayList;
import tutorial.blog.entity.BlogCategory;
import tutorial.blog.entity.BlogPost;
/**
 * 
 * data store in memory
 * DAO has method
 * Create: new data store										data object
 * Read(Retrieve) : get data,view,search select by key			select by key
 * Update: Change data value									data object has id
 * delete														id
 * version 0.0.1-Training;
 * @author wings math VU;
 * @email kieuvu994@gmail.com
 */
public class BlogMemoryDAO {
	private List<BlogPost> postRepo;
	private List<BlogCategory> cateRepo;
//	public BlogMemoryDAO() {};
	public BlogMemoryDAO() {
		super();
		postRepo= new ArrayList<BlogPost>();
		cateRepo= new ArrayList<BlogCategory>();
	};

}
