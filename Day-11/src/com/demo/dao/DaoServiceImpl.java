package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.demo.beans.Course;

public class DaoServiceImpl implements DaoServices {

	static Map<String,Course> hm;
	
	static {
		hm = new HashMap<>();
		hm.put("DAC", new Course("DAC",12000.00,220,120));
		hm.put("DBDA", new Course("DBDA",10000.00,170,80));
	}
	
	@Override
	public boolean save(Course c) {
	
		Course c1 = hm.putIfAbsent(c.getcname(), c);
		if(	c1==null) 
			return true;
		return false;

	}

	@Override
	public Map<String , Course> DisplayAll() {	
		return hm;
	}

	@Override
	public boolean DeleteByName(String name) {
		
		Course c1=hm.remove(name);
		if(c1!=null) {
			return true;
		}
		return false;
		
		
	}

	@Override
	public boolean updateByName(String cname, int cduration, int capacity) {
	    
		Course c1= hm.get(cname);
		if(cname!=null) {
			c1.setDuration(cduration);
			c1.setCapacity(capacity);
	        return true;
		}
		
		return false;
	}

	@Override
	public List<Course> findByDuration(int cduration) {
		
		Set<String> s = hm.keySet();
		List<Course> clst = new ArrayList<>();
		for(String s1 :s ) {
			Course c1 = hm.get(s1);
			if(c1.getDuration()>cduration) {
				clst.add(c1);
			}
		}
		if(clst.size()>0) {
			return clst;
		}		
		return null;
	}

	@Override
	public Course searchByName(String name) {
		
		return   hm.get(name);
	
	}
		
}
