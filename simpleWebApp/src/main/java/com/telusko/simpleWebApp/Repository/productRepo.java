package com.telusko.simpleWebApp.Repository;

import com.telusko.simpleWebApp.Model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<product,Integer> {

}
