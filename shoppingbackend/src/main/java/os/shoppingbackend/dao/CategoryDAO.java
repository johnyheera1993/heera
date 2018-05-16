package os.shoppingbackend.dao;

import os.shoppingbackend.dto.Category;


import java.util.List;


public interface CategoryDAO {
		
	List<Category> list();
	
	Category get(int id);
	
	
}
