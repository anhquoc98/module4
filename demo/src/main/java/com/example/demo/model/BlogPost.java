package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_blog")
    private String nameBlog;

    @Column(name = "title")
    private String title;
    @ManyToOne
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BlogPost() {
    }

    public BlogPost(Integer id, String nameBlog, String title) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.title = title;
    }
}
