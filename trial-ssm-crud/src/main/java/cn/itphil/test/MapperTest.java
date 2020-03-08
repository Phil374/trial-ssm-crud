package cn.itphil.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itphil.bean.Employee;
import cn.itphil.dao.EmployeeMapper;

/**
 * ����dao�����
 * @author Phil
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
    EmployeeMapper employeeMapper;
	
	/**
	 * ����Employee
	 */
	@Test
	public void insertTest(){
		
		System.out.println(employeeMapper);
		
		//����Employee
		/*Employee employee = new Employee(1, 22, "Phil", "��", "�㶫");*/
		Employee employee = new Employee(2, 99, "777", "Ů", "�㶫");
		employeeMapper.insert(employee);
	}
	
	@Test
	public void findTest(){
		Employee employee = employeeMapper.selectByPrimaryKey(1);
		System.out.println(employee);
	}
	
	@Test
	public void deleteTest(){
		employeeMapper.deleteByPrimaryKey(2);
	}
	
	@Test
	public void updateTest(){
		Employee employee = new Employee(2, 66, "777", "Ů", "�㶫");
		employeeMapper.updateByPrimaryKey(employee);
		Employee employee2 = employeeMapper.selectByPrimaryKey(2);
		System.out.println(employee2);
	}
}
