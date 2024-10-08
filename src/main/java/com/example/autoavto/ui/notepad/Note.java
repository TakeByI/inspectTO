package com.example.autoavto.ui.notepad;

import java.util.Date;

public class Note {

    private String firstText;
    private Date date;

    public Note(String firstText, Date date) {
        this.firstText = firstText;
        this.date = date;
    }

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return firstText.equals(note.firstText) &&
                date.equals(note.date);
         }




}
