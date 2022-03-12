package com.vidya.product.bo;

import com.vidya.product.dao.ProductDAO;
import com.vidya.product.dao.ProductDAOimp;
import com.vidya.product.pto.Product;

public class ProductBOImpl implements ProductBO {
    
	
	private static ProductDAO dao=new ProductDAOimp();
	@Override
	public void create(Product product) {
      dao.create( product);
      
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
