package com.example.blog_application.model;

import javax.persistence.*;

@Entity
@Table(name = "type_blog")
public class TypeBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_type")
    private int idType;
    @Column(name = "type", columnDefinition = "varchar(50)", nullable = false)
    private String type;

    public TypeBlog(int idType, String type) {
        this.idType = idType;
        this.type = type;
    }

    public TypeBlog() {
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int id) {
        this.idType = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
