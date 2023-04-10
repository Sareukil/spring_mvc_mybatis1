package com.spring_mvc.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_mvc.mybatis.model.ProductVO;

public interface IProductService {
    public ArrayList<ProductVO> listAllProduct();
    public void insertProduct(ProductVO prd);
    public void updateProduct(ProductVO prd);
    public void deleteProduct(String prdNo);
    public ProductVO deailViewProduct(String prdNo);
    public String ProductCheck(String prdNo);
    public ArrayList<ProductVO> productSearch(HashMap<String, Object> map);
}
