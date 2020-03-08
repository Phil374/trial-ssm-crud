package cn.itphil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itphil.bean.Employee;
import cn.itphil.dao.EmployeeMapper;

@Service
public class EmployService {

	@Autowired
	EmployeeMapper employeeMapper;
	
	/**
	 * 查询所有员工
	 * @return
	 */
	public List<Employee> getAll() {
		
		return employeeMapper.selectByExample(null);
	}

}
