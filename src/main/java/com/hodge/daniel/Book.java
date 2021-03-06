package com.hodge.daniel;

public class Book {

    private Long id;
    private String title;
    private String description;
    private Float unitCost;
    private String isbn;
    private Integer nbOfPage;

    public Book() {

    }

    public Book(Long id) {
        this.id = id;
    }

    public Book(Long id, String title, String description, Float unitCost, String isbn, Integer nbOfPage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.unitCost = unitCost;
        this.isbn = isbn;
        this.nbOfPage = nbOfPage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
