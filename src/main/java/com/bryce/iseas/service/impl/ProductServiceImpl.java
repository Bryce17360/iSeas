package com.bryce.iseas.service.impl;

import com.bryce.iseas.dao.ProductDao;
import com.bryce.iseas.model.Product;
import com.bryce.iseas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
