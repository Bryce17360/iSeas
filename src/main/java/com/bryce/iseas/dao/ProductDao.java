package com.bryce.iseas.dao;

import com.bryce.iseas.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
