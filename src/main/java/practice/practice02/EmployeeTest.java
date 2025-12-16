package practice.practice02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("山田");
		employee.setAge(20);

		System.out.println("名前：" + employee.getName());
		System.out.println("年齢：" + employee.getAge());

	}

}
