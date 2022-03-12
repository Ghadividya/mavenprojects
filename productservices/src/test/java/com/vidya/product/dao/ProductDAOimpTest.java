package com.vidya.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vidya.product.pto.Product;

public class ProductDAOimpTest {

	private static final ProductDAO dao = null;

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao=new ProductDAOimp();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Its Awesome");
		product.setPrice(80000);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Iphone",result.getName()); //correct test case
		//assertEquals("Ipad",result.getName());//here im making test fail bcz i want to execute the test skipping
		
	}

}
