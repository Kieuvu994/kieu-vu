package tutorial.blog.service;

public class BlogService {
	private BlogMemoryDAO dao;
	public BlogService() {
		
	}

	public BlogService(BlogMemoryDAO blogDAO) {
		super();
		// TODO Auto-generated constructor stub
		this.dao = blogDAO;
	}

}
