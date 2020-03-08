package cn.itphil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itphil.bean.Employee;
import cn.itphil.service.EmployService;

/**
 * Ա��CRUD����
 * @author Phil
 *
 */
@Controller
public class EmployeeController {
	
	@Autowired
	EmployService employService;
	/**
	 * ��ѯԱ������
	 */
	@RequestMapping("/emps")
	@ResponseBody
	public List<Employee> getEmpsWithJson(){
		List<Employee> emps = employService.getAll();
		return emps;
	}
	
	
}
