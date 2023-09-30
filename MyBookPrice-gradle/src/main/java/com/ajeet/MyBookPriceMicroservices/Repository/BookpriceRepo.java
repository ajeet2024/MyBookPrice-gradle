package com.ajeet.MyBookPriceMicroservices.Repository;

import com.ajeet.MyBookPriceMicroservices.model.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookpriceRepo extends JpaRepository<BookPrice,Integer>{

}
