package com.demo.services;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface CourseServices {

	boolean addNewCourse();

	Map<String,Course> DisplayAll();

	boolean DeleteByName(String name);

	boolean updateByName(String cname, int cduration, int capacity);

	List<Course> findByDuration(int cduration);

	Course serachByName(String name);



}
