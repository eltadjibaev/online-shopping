package net.elmu.shoppingbackend.dao;

import java.util.List;

import net.elmu.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
