package com.polestar.study.demo.model;

public class Person {

    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
