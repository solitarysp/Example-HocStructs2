package com.fpt.controller;/*
  By Chi Can Em  12-03-2018
 */

import com.fpt.model.Product;
import com.fpt.persistent.ProductModel;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class ViewProduct extends ActionSupport {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getListProduct() {
        products= ProductModel.getListProduct();
        return "view";
    }
}
