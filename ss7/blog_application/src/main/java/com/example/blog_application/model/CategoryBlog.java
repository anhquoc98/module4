package com.example.blog_application.model;

import javax.persistence.*;

@Entity
@Table(name = "category_blog")
public class CategoryBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_category")
    private int idCategory;
    @Column(name = "name_category", columnDefinition = "varchar(50)", nullable = false)
    private String nameCategory;

    public CategoryBlog() {
    }

    public CategoryBlog(int idCategory, String nameCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
