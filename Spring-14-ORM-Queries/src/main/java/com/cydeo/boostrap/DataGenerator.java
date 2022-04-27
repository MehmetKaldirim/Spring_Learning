package com.cydeo.boostrap;


import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------Regions Start-----------------------");

        System.out.println("find by country "+regionRepository.findByCountry("Canada"));
        System.out.println("find all distinct region by country "+regionRepository.findDistinctByCountry("Canada"));
        System.out.println("find all country containing united  "+regionRepository.findByCountryContaining("United"));
        System.out.println("find all country containing asia by order "+regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("find top three by name canada "+regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------------Regions End-------------------------");

        System.out.println("------------------Department Start-------------------------");

        System.out.println("find by which name department " + departmentRepository.findByDepartment("Toys"));
        System.out.println("find by which division name Outdoors " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("find by which divison contain hae " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("------------------Department End-------------------------");

        System.out.println("------------------Employee begins-------------------------");
        System.out.println("get employee detail by emails" + employeeRepository.getEmployeeDetail());

        System.out.println("------------------Employee End-------------------------");
    }
}
