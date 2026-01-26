package stream_exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		
		List<Employee> employees = Stream.of(
				new Employee(1, "Shweta", "HR", 89000),
				new Employee(2, "Abhishek", "IT", 98000),
				new Employee(3, "Shivam", "IT", 72000),
				new Employee(4, "Rahul", "HR", 92000),
				new Employee(5, "Kunal", "IT", 75000))
				.collect(Collectors.toList());
		
		Map<String, Optional<Employee>> maxSalaryDeptWise = employees.stream()
				                     .collect(Collectors.groupingBy(Employee::getDept, Collectors
				                    		 .reducing(BinaryOperator.maxBy(Comparator
				                    				 .comparing(Employee::getSalary)))));
		//System.out.println(maxSalaryDeptWise);
		
		// other way
		Map<String, Optional<Employee>> maxSalaryDeptWise1 = employees.stream()
				                        .collect(Collectors.groupingBy(Employee::getDept, 
						           Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(maxSalaryDeptWise1);
		
		// stream vs parallel stream
		IntStream.range(1, 10).forEach(t -> System.out.println(Thread.currentThread().getName()+ " " + t));
		System.out.println("=====================================");
		IntStream.range(1, 10).parallel().forEach(t -> System.out.println(Thread.currentThread().getName() + " : " + t));
	}

}
