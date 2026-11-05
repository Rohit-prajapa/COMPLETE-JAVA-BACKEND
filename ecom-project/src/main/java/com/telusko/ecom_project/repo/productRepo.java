package com.telusko.ecom_project.repo;

import com.telusko.ecom_project.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface productRepo extends JpaRepository<product,Integer> {

}
