package com.anuj.SpringBootDataJPA;

import com.anuj.SpringBootDataJPA.entity.Book;
import com.anuj.SpringBootDataJPA.entity.Employee;
import com.anuj.SpringBootDataJPA.repo.BookRepository;
import com.anuj.SpringBootDataJPA.repo.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.SortedSet;


@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootDataJpaApplication.class, args);

		BookRepository bookRepo=ctxt.getBean(BookRepository.class);
		EmployeeRepository empRepo=ctxt.getBean(EmployeeRepository.class);
/*
		System.out.println("Anuj->"+repo.getClass().getName());

		Book b=new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(1000.00);

	## Please Read Connection Pool

 */

//		Book b1=new Book();
//		b1.setBookId(102);
//		b1.setBookName("Microservices");
//		b1.setBookPrice(3000.0);
//
//		Book b2=new Book();
//
//		b2.setBookId(103);
//		b2.setBookName("React Js");
//		b2.setBookPrice(2800.00);

//		repo.saveAll(Arrays.asList(b1,b2));

//		List<Book> data=repo.findByBookPriceGreaterThan(2500.00);
//
//		for(Book b:data)
//			System.out.println("Anuj->  "+b.toString());


//		Optional<Book> data=repo.findById(101);
//		System.out.println("Anuj-> "+data.get());
		Sort ascending=Sort.by("empName").ascending();

		/*
		* we can pass multiple query in sort.by() like empName,Roll-NO so many;
		* */
//		List<Employee> emps=empRepo.findAll(ascending);
//
//		System.out.println("===========================================================");
//		emps.forEach(System.out::println);
//		System.out.println("===========================================================");

//		int pageNo = 21;
//		PageRequest page = PageRequest.of(pageNo-1, 3);
//
//		Page<Employee> findAll=empRepo.findAll(page);
//
//		List<Employee> emp=findAll.getContent();
//
//		emp.forEach(System.out::println);

		Employee emp=new Employee();

		emp.setEmpGender("Male");

		Example<Employee> exmp = Example.of(emp);

		List<Employee> emps=empRepo.findAll(exmp);

		emps.forEach(System.out::println);


	}

}
