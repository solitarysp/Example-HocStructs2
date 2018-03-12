package com.fpt.controller;/*
  By Chi Can Em  12-03-2018
 */

import com.fpt.model.Product;
import com.fpt.persistent.ProductModel;
import com.opensymphony.xwork2.ActionSupport;

public class AddProduct extends ActionSupport {
    public String action;
    public Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String doAddProduct() {
        if (action == null) {
            return "ShowEdit";
        }
        if (action.equals("add")) {
            ProductModel.addProduct(product);
        }
        return "ShowEdit";
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
