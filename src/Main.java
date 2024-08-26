import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main
{
	public static List<Student> students = new ArrayList<>();
	
	static
	{
		students.add(new Student(1, "Dương", 23));
		students.add(new Student(2, "Huỳnh", 26));
		students.add(new Student(3, "Linh", 31));
		students.add(new Student(4, "Yến", 18));
	}
	
	public static void main(String[] args)
	{
		// map - biến đổi các phần tử theo thứ mình muốn
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		System.out.println("Before = " + numbers);
//		numbers.stream().map(item -> item * item).forEach(System.out::println);
		// filter - dùng để lọc các mảng theo 1 điều kiện
//		Predicate<Integer> checkEven = number -> number % 2 == 0;
//		numbers.stream().filter(number -> number % 2 == 0).forEach(item ->
//		{
//			System.out.print(item + " ");
//		});
		
		
		// 1 mảng student -> muốn lấy ra sinh viên có id = 10
//		Optional<Student> optionalStudent = students.stream().filter(item -> item.getId() == 2).findFirst();
//		if (optionalStudent.isPresent())
//		{
//			Student findStudent = optionalStudent.get();
//			System.out.println("Tên sinh viên = " + findStudent.getName());
//		}
//		else
//		{
//			System.out.println("Không tồn tại");
//		}
		// reduce
//		LocalDate day1 = LocalDate.now();
//		LocalDate day2 = LocalDate.now();
//		day1.minusDays(1);
//		int sum = numbers.stream().reduce(0, Integer::sum);
//		System.out.println(sum);

//		int sumTotal = students.stream().map(item -> item.getAge()).reduce(0, Integer::sum);
//		System.out.println((double) sumTotal / students.size());
		
		// max min
//		Optional<Integer> max = numbers.stream().max(Comparator.comparingInt(Integer::intValue));
//		// trường hợp mảng rỗng không thể có max min
//		if (max.isPresent())
//		{
//			System.out.println("Max = " + max.get());
//		}
//		else
//		{
//			System.err.println("Không tồn tại max");
//		}
		// collect
//		Function<Student, Student> check = student ->
//		{
//			student.setAge(student.getAge() + 10);
//			return student;
//		};
//		List<Student> newStudent = students.stream().map(student ->
//		{
//			student.setAge(student.getAge() + 10);
//			return student;
//		}).toList();
//		System.out.println("students = " + students);
		// toArray

//		numbers.toArray();
//
//
//		boolean isExist = students.stream().anyMatch(item -> item.getName().equals("Dương"));
//		if (isExist)
//		{
//			System.err.println("Đã tồn tại");
//		}
//		else
//		{
//			System.out.println("Chưa tồn tại");
//		}
		
		students.stream()
				  .sorted(Comparator.comparing(Student::getName).reversed())
				  .limit(2)
				  .forEach(System.out::println);
		
	}
}