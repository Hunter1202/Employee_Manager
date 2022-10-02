import java.util.Scanner;
import java.util.List;

public class EmployeeManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Employee> employeeList;
    private final EmployeeDao employeeDao;

    public EmployeeManager() {
        employeeDao = new EmployeeDao();
        employeeList = employeeDao.read();
    }

    public void add() {
        int id = (employeeList.size() > 0) ? (employeeList.size() + 1) : 1;
        System.out.println("ID nhân viên: " + id);
        String fullName = inputFullName();
        String birthDay = inputBirthDay();
        String phone = inputPhone();
        String email = inputEmail();
        Employee a = new Employee(id, fullName, birthDay, phone, email);
        employeeList.add(a);
        employeeDao.write(employeeList);
    }

    public void edit(int id) {
        boolean isExisted = false;
        int size = employeeList.size();
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                isExisted = true;
                employee.setFullName(inputFullName());
                employee.setBirthDay(inputBirthDay());
                employee.setPhone(inputPhone());
                employee.setEmail(inputEmail());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id: %d không tồn tại.\n", id);
        } else {
            employeeDao.write(employeeList);
        }
    }

    public void delete(int id) {
        Employee a = null;
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getId() == id) {
                a = employeeList.get(i);
                break;
            }
        }
        if (a != null) {
            employeeList.remove(a);
            employeeDao.write(employeeList);
        } else {
            System.out.printf("id: %d Không tồn tại.\n", id);
        }
    }
    public void showInfo() {
        for (Employee a : employeeList) {
            System.out.format("%10d | ", a.getId());
            System.out.format("%20s | ", a.getFullName());
            System.out.format("%20s | ", a.getBirthDay());
            System.out.format("%20s | ", a.getPhone());
            System.out.format("%20s | ", a.getEmail());
            System.out.print("\n");
        }
    }

    public int inputId() {
        System.out.print("Nhập ID nhân viên: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("ID không hợp lệ! ");
            }
        }
    }

    private String inputFullName() {
        System.out.print("Nhập tên nhân viên: ");
        return scanner.nextLine();
    }

    private String inputBirthDay() {
        System.out.print("Ngày tháng năm sinh: ");
        return scanner.nextLine();
    }

    private String inputPhone() {
        System.out.print("Nhập SĐT: ");
        return scanner.nextLine();
    }

    private String inputEmail() {
        System.out.print("Nhập Email: ");
        return scanner.nextLine();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
