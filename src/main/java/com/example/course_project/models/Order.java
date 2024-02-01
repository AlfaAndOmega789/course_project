package com.example.course_project.models;

public class Order {

    private String title;
    private Integer price;

    public Order(){

    }
    public Order(String title, Integer price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
