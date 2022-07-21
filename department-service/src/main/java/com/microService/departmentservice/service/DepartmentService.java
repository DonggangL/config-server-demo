package com.microService.departmentservice.service;

import com.microService.departmentservice.entity.Department;
import com.microService.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Department has been successfully save by department api");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Department has been found save by department api");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
