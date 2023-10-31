package com.teamtreehouse.courses.model;

import java.util.Objects;

public class CourseIdea {
    private String title;
    private String creator;

    public CourseIdea(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseIdea that = (CourseIdea) o;

        if (!Objects.equals(title, that.title)) return false;
        return Objects.equals(creator, that.creator);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        return result;
    }
}
