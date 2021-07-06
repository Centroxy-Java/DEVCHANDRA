package com.cen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.cen.entity.Student;
import com.cen.repository.Redisrepository;

@Service
public class StudentServiceImpl implements Redisrepository {

	@Autowired
	private RedisTemplate<String, Object> template;

	public static final String HASHKEY = "Student";

	@Override
	public Student save(Student student) {
		template.opsForHash().put(HASHKEY, student.getStudentId(), student);
		return student;

	}

	@Override
	public List<Object> findAll() {
		List<Object> list = template.opsForHash().values(HASHKEY);
		return list;

	}

	@Override
	public Student findbyStudentId(int studentId) {
		// TODO Auto-generated method stub
		return (Student) template.opsForHash().get(HASHKEY, studentId);
	}

	@Override
	public String deleteStudentdata(int studentId) {
		// TODO Auto-generated method stub
		template.opsForHash().delete(HASHKEY, studentId);

		return "This" + studentId + " id student details remove";
	}

}