package com.example.demo;

import java.util.Objects;

public class Greeting {
    private final long id;



    private final String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting greeting = (Greeting) o;
        return id == greeting.id && content.equals(greeting.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }



    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {

        return "{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

}
