package com.springinaction.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by головченко on 08.02.2017.
 */
public class CourseFullEvent extends ApplicationEvent {

    private Course course;
    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }
}
