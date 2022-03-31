package com.generation.library.model.entities;

public class Book 
{
    String title, author;
    int nPages;
    double price;

    public Book(String title, String author, int nPages, double price) 
    {
        this.title = title;
        this.author = author;
        this.nPages = nPages;
        this.price = price;
    } 

    public String toString()
    {
        return "Title: "+ title + "\nAuthor: "+ author;
    }

    

}
