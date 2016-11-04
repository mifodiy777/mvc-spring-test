package ru.innopolis.mvc.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Кирилл on 01.11.2016.
 */
public class Lesson {

    private Integer id;

    // Тема занятия
    private String topic;

    // Описание занятия
    private String description;

    //Длительно занятия в минутах
    private Integer duration;

    //Дата занятия
    private Date dateLesson;

    //Список студентов посетивших занятие
    private Set<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getDateLesson() {
        return dateLesson;
    }

    public void setDateLesson(Date dateLesson) {
        this.dateLesson = dateLesson;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (id != null ? !id.equals(lesson.id) : lesson.id != null) return false;
        if (topic != null ? !topic.equals(lesson.topic) : lesson.topic != null) return false;
        if (description != null ? !description.equals(lesson.description) : lesson.description != null) return false;
        if (duration != null ? !duration.equals(lesson.duration) : lesson.duration != null) return false;
        if (dateLesson != null ? !dateLesson.equals(lesson.dateLesson) : lesson.dateLesson != null) return false;
        return students != null ? students.equals(lesson.students) : lesson.students == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (dateLesson != null ? dateLesson.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }
}
