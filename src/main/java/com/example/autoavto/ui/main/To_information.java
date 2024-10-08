package com.example.autoavto.ui.main;

import org.jetbrains.annotations.NotNull;

public class To_information {
    private String text;
    private String articule;
    private Integer to,id;
    private boolean replace;

    public String getArticule() {
        return articule;
    }

    public void setArticule(String articule) {
        this.articule = articule;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isReplace() {
        return replace;
    }

    public void setReplace(boolean replace) {
        this.replace = replace;
    }

    @NotNull
    @Override
    public String toString() {
        return "Car{" +
                "text='" + text + '\'' +
                ", to=" + to +
                ", id=" + id +
                ", replace=" + replace +
                '}';
    }
}
