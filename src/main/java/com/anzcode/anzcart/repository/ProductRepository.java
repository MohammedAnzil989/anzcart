package com.anzcode.anzcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anzcode.anzcart.models.Product;

@Repository
public interface ProductRepository extends  JpaRepository< Product ,Long >{

}
