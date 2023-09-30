package com.ajeet.MyBookPriceMicroservices.model;

import javax.persistence.*;

@Entity
@Table(name = "mybookprice", schema = "jlcbookpricedb")
public class BookPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator ="bookidseq" )
    @SequenceGenerator(name = "bookId_generator", sequenceName = "bookidseq")
    @Column(name = "book_id")
    private Integer bookId;
    @Column(name = "price")
    private Double price;
    @Column(name = "offer")
    private Double offer;

    public BookPrice() {
    }

    public BookPrice(Integer bookId, Double price, Double offer) {
        this.bookId = bookId;
        this.price = price;
        this.offer = offer;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }
}
