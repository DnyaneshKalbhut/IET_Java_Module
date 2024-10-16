package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface DaoServices {

	boolean save(Course c);

	Map<String,Course> DisplayAll();

	boolean DeleteByName(String name);

	boolean updateByName(String cname, int cduration, int capacity);

	List<Course> findByDuration(int cduration);

    Course searchByName(String name);

}
