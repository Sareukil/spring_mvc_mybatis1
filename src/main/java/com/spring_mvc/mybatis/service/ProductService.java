package com.spring_mvc.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_mvc.mybatis.dao.IProductDAO;
import com.spring_mvc.mybatis.model.ProductVO;

@Service
public class ProductService implements IProductService{

    @Autowired
    @Qualifier("IProductDAO")
    IProductDAO dao;


    @Override
    public ProductVO deailViewProduct(String prdNo) {
        
        return dao.deailViewProduct(prdNo);
    }

    @Override
    public void deleteProduct(String prdNo) {
        // TODO Auto-generated method stub
        dao.deleteProduct(prdNo);
    }

    @Override
    public void insertProduct(ProductVO prd) {
        dao.insertProduct(prd);
        
    }

    @Override
    public ArrayList<ProductVO> listAllProduct() {
        // TODO Auto-generated method stub
        return dao.listAllProduct();
    }

    @Override
    public void updateProduct(ProductVO prd) {
        dao.updateProduct(prd);
        
    }

    @Override
    public String ProductCheck(String prdNo) {

        return dao.ProductCheck(prdNo);
        // TODO Auto-generated method stub
        
    }

    @Override
    public ArrayList<ProductVO> productSearch(HashMap<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.productSearch(map);
    }
    
}
