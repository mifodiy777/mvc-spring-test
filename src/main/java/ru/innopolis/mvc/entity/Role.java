package ru.innopolis.mvc.entity;

/**
 * Created by Кирилл on 02.11.2016.
 */
public class Role {

    private Integer id;

    //Роль
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}