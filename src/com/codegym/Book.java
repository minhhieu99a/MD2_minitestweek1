package com.codegym;

public class Book {
    private String name;
    private String author;
    private int price;
    private int quantity;
    private double weight;
    public Book(){};
    public Book(String name,String author,int price,int quantity,double weight){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
        this.weight=weight;
    }
    public double getTotalPrice(){
        double result = this.price*this.quantity;
        return result;
    }
    public double getTotalWeight(){
        double result =this.quantity*this.weight;
        return  result;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return  this.price;
    }
    public int getQuantity(){
        return  this.quantity;
    }
    public double getWeight(){
        return  this.weight;
    }
}
