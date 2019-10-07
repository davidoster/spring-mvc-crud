package org.websparrow.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.websparrow.dao.StudentDao;
import org.websparrow.model.Student;

@Controller
public class ReadController {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping(value = "/read")
	public ModelAndView readStudent(ModelAndView model) throws IOException {

		List<Student> listStudent = studentDao.read();
		model.addObject("listStudent", listStudent);
		model.setViewName("read");

		return model;
	}
}
