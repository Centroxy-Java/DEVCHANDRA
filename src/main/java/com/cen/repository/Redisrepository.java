package com.cen.repository;

import java.util.List;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.cen.entity.Student;

@Repository
public interface Redisrepository {

	public Student save(Student student);

	public List<Object> findAll();

	public Student findbyStudentId(int studentId);

	public String deleteStudentdata(int studentId);

}
