package com.webMVC.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.webMVC.entity.Product;

public interface product_Repo extends JpaRepository <Product, Integer> {

}
