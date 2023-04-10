package com.spring_mvc.mybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatis.model.ProductVO;
import com.spring_mvc.mybatis.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String index() {
        
        return "index";
    }

    @RequestMapping("/product/productListAll")
    public String viewProductListAll(Model model){
        ArrayList<ProductVO> prdList = service.listAllProduct();

        model.addAttribute("prdList", prdList);
        return "product/productAllListView";
    }
    @RequestMapping("/product/productNewForm")
    public String productNewForm(Model model){
        return "product/productNewForm";
    }
    @RequestMapping("/product/insertProduct")
    public String productInsert(ProductVO prd){
        
    	service.insertProduct(prd);
        return "redirect:/product/productListAll";
    }

    @RequestMapping("/product/detailViewProduct/{prdNo}")
    public String detailViewProduct(@PathVariable String prdNo,
                                    Model model){
        
        ProductVO prd = service.deailViewProduct(prdNo);
        model.addAttribute("prd", prd);
        return "product/productDetailView";
    }

    @RequestMapping("/product/updateProductForm/{prdNo}")
    public String updateProductForm(@PathVariable String prdNo,
                                    Model model){
    	ProductVO prd = service.deailViewProduct(prdNo);
		model.addAttribute("prd", prd);
        return "product/productUpdateForm";
    }
    @RequestMapping("/product/updateProduct")
    public String updateProduct(ProductVO prd){
    	service.updateProduct(prd);
    	return "redirect:/product/productListAll";
    }
    @RequestMapping("/product/deleteProduct/{prdNo}")
    public String deleteProduct(@PathVariable String prdNo){
        service.deleteProduct(prdNo);
        return "redirect:/product/productListAll";
    }
    @ResponseBody
	@RequestMapping("/product/prdNoCheck")
	public String prdNoCheck(@RequestParam("prdNo") String prdNo) {
		String result = "";
		String prdNo_result = service.ProductCheck(prdNo);
		System.out.println(prdNo_result);
		if(prdNo_result == null)
			result = "success";
		else
			result = "fail";
		return result;
	} 
    @RequestMapping("/product/productSearchForm1")
    public String productSearchForm1()
    {

        return "product/productSearchForm1";
    }

    @ResponseBody
    @RequestMapping("/product/productSearch1")
    public ArrayList<ProductVO> productSearch1(@RequestParam HashMap<String,Object> param,Model model)
    {
        ArrayList<ProductVO> prdList = service.productSearch(param);
        //model.addAttribute("prdList",prdList);

        return prdList;
    }

    @RequestMapping("/product/productSearchForm2")
	public String productSearchForm2() {
		return "product/productSearchForm2";
	}
		
	// 상품 검색2 처리
	@RequestMapping("/product/productSearch2")
	public String productSearch2(@RequestParam HashMap<String, Object> param,
																					Model model){
		// 서비스로 전송해서 DB 검색 결과 받아옴
		ArrayList<ProductVO> prdList = service.productSearch(param);	
		model.addAttribute("prdList", prdList);
		return "product/productSearchResultView"; // productSearchResultView.jsp
	}
    @RequestMapping("/product/productSearchForm3")
    public String productSearchForm3()
    {

        return "product/productSearchForm1";
    }
}
