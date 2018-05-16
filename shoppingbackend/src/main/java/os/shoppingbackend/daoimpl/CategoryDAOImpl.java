package os.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import os.shoppingbackend.dao.CategoryDAO;
import os.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		 
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Hello This is about television");
		category.setImageURL("cat1.png");
		
		categories.add(category);
		
		//second category
		category = new Category();
		
		//adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Hello This is about Mobile");
		category.setImageURL("cat2.png");
		
		categories.add(category);
		
		
		category = new Category();
		
		//adding third category
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("Hello This is about Laptops");
		category.setImageURL("cat3.png");
		
		categories.add(category);
		
	}	

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category: categories) {
			
			if(category.getId() == id) 
				return category;
			
		}
		return null;
	}

		
}
