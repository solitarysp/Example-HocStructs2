package com.fpt.persistent;/*
  By Chi Can Em  12-03-2018
 */

import com.fpt.config.ConnectDB;
import com.fpt.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    public static int addProduct(Product product) {

        try {
            PreparedStatement statement = ConnectDB.getConnection().prepareStatement("INSERT INTO product ( name) VALUES (?)");
            statement.setString(1, product.getName());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static List<Product> getListProduct() {
        List<Product> products = new ArrayList<Product>();
        try {
            PreparedStatement statement = ConnectDB.getConnection().prepareStatement("SELECT * FROM product");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product1 = new Product();
                product1.setId(resultSet.getInt(1));
                product1.setName(resultSet.getString(2));
                products.add(product1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
