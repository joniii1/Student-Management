package com.example.studentmanagement.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private long id;
    private String coursename;
    private int duration;


    public Course() {

    }

    public Course(long id, String coursename, int duration) {
        this.id = id;
        this.coursename = coursename;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", duration=" + duration +
                '}';
    }
}
