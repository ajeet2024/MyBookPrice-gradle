package com.ajeet.MyBookPriceMicroservices.controller;

import com.ajeet.MyBookPriceMicroservices.model.Book;
import com.ajeet.MyBookPriceMicroservices.model.BookPrice;
import com.ajeet.MyBookPriceMicroservices.service.BookPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookPriceController {
    final static Logger logger = LoggerFactory.getLogger(BookPriceController.class);
    @Autowired
    BookPriceService bookPriceService;

    @GetMapping("/allbookprice/{bookId}")
    public Book getAllBook(@PathVariable  String bookId){
        logger.info("book id in get API"+bookId);
        Integer book_id = Integer.valueOf(bookId);
        return bookPriceService.getPriceByBookID(book_id);

    }
}
