package com.ajeet.MyBookPriceMicroservices.service;

import com.ajeet.MyBookPriceMicroservices.Repository.BookpriceRepo;
import com.ajeet.MyBookPriceMicroservices.model.Book;
import com.ajeet.MyBookPriceMicroservices.model.BookPrice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BookPriceService {
    @Autowired
    BookpriceRepo bookpriceRepo;
    final static Logger logger = LoggerFactory.getLogger(BookPriceService.class);

    public Book getPriceByBookID(Integer bookId){
        logger.info("bookid "+bookId);
        Book b = new Book();
        BookPrice bookPriceopt = bookpriceRepo.getById(bookId);
        if(bookPriceopt!=null){
            b.setBookId(bookPriceopt.getBookId());
            b.setPrice(bookPriceopt.getPrice());
            b.setOffer(bookPriceopt.getOffer());

        }
        logger.info("book by id"+b.toString());
       return b;
    }
}
