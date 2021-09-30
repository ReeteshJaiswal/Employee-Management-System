package com.iacsd.employeeManagement.dao;

import java.util.List;

import javax.validation.Valid;

import com.iacsd.employeeManagement.model.Employee;
import com.iacsd.employeeManagement.model.Login;
import com.iacsd.employeeManagement.model.User;

public interface commonDao {

	long saveUSer(@Valid User user);

	User getUserByEmailId(@Valid Login login);

	long saveEmployee(@Valid Employee employee);

	int updateEmployee(@Valid Employee employee, Long employeeId);

	int deleteEmployee(Long employeeId);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long employeeId);

//	List<AcquirerBankInfo> getAllAcquirerBankInfos();
//
//	AcquirerBankInfo getAcquirerBankInfoById(Long bankId);
//
//	long saveAcquirerBankInfo(AcquirerBankInfo acquirerBankInfo);
//
//	int[] saveAcquirerBankInfoList(List<AcquirerBankInfo> acquirerBankInfos);
//
//	int updateAcquirerBankInfo(AcquirerBankInfo acquirerBankInfo, Long bankId);
//
//	int deleteAcquirerBankInfo(Long bankId);

}