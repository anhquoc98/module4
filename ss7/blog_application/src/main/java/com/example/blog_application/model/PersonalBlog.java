package com.example.blog_application.model;

import javax.persistence.*;

@Entity
@Table(name = "presonal_blog")
public class PersonalBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", columnDefinition = "varchar(50)", nullable = false)
    private String name;
    @Column(name = "title", columnDefinition = "varchar(50)")
    private String title;
    @Column(name = "contest", columnDefinition = "varchar(255)")
    private String content;
    @ManyToOne
    @JoinColumn(name = "type_blog")
    private TypeBlog typeBlog;

    public PersonalBlog() {
    }

    public TypeBlog getTypeBlog() {
        return typeBlog;
    }

    public void setTypeBlog(TypeBlog typeBlog) {
        this.typeBlog = typeBlog;
    }

    public PersonalBlog(int id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
