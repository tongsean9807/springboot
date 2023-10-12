package com.tongsean.springboot.springbootbasicapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//course details


@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				 new Course(1,"Learn", "tongsean"),
				 new Course(1,"Learn", "tongsean")
				);
	}
}
