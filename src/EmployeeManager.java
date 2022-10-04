import java.util.Scanner;
import java.util.List;

public class EmployeeManager {
    public static Scanner scanner = new Scanner(System.in);
    private final List<Employee> employeeList;
    private final EmployeeDao employeeDao;

    //khởi tạo đối tượng EmployeeDao và đọc danh sách nhân viên khi khởi tạo đối tượng EmployeeManager
    public EmployeeManager() {
        employeeDao = new EmployeeDao();
        employeeList = employeeDao.read();
    }

    //Getter & Setter
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    //Thêm và showInfo() các thuộc tính đặc trưng nhân viên kinh nghiệm lâu năm (ExpInYear, ProSkill)
    public void addExpert() {
        int id = (employeeList.size() > 0) ? (employeeList.size() + 1) : 1;
        System.out.println("ID nhân viên: " + id);
        String fullName = inputFullName();
        String birthDay = inputBirthDay();
        String phone = inputPhone();
        String email = inputEmail();
        String ProSkill = inputProskill();
        Double ExpInYear = inputExpInYear();
        Employee employee = new Experienced(id, fullName, birthDay, phone, email, ExpInYear, ProSkill);
        //add employee to employeeList
        employeeList.add(employee);
        employeeDao.write(employeeList);
        //showInfo()
        ((Experienced) employee).showInfo(); //upcasting
}
    //Thêm và showInfo() các thuộc tính đặc trưng nhân viên mới ra trường (Graduation_date,
    //                Graduation_rank, Education)
    public void addFresher() {
        int id = (employeeList.size() > 0) ? (employeeList.size() + 1) : 1;
        System.out.println("ID nhân viên: " + id);
        String fullName = inputFullName();
        String birthDay = inputBirthDay();
        String phone = inputPhone();
        String email = inputEmail();
        String Graduation_date = inputGraduation_date();
        String Graduation_rank = inputGraduation_rank();
        String Education = inputEducation();
        Employee employee = new Fresher(id, fullName, birthDay, phone, email, Graduation_date,
                Graduation_rank, Education);
        //add employee to employeeList
        employeeList.add(employee);
        employeeDao.write(employeeList);
        //showInfo()
        ((Fresher) employee).showInfo(); //upcasting
    }
    //Thêm và showInfo() các thuộc tính đặc trưng nhân viên thực tập (Semester, University_name)
    public void addIntern() {
        int id = (employeeList.size() > 0) ? (employeeList.size() + 1) : 1;
        System.out.println("ID nhân viên: " + id);
        String fullName = inputFullName();
        String birthDay = inputBirthDay();
        String phone = inputPhone();
        String email = inputEmail();
        String Majors = inputMajors();
        String Semester = inputSemester();
        String University_name = inputUniversity_name();
        Employee employee = new Intern(id, fullName, birthDay, phone, email, Majors, Semester, University_name);
        //add employee to employeeList
        employeeList.add(employee);
        employeeDao.write(employeeList);
        //showInfo()
        ((Intern) employee).showInfo(); //upcasting
    }
    //Hàm chỉnh sửa nhân viên qua ID
    public void edit(int id) {
        boolean isExisted = false;
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
    //Hàm xóa nhân viên qua ID
    public void delete(int id) {
        Employee a = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                a = employee;
                break;
            }
        }
        if (a != null) {
            employeeList.remove(a);
            employeeDao.write(employeeList);
            System.out.println("Đã xóa!");
        } else {
            System.out.printf("id: %d Không tồn tại.\n", id);
        }
    }
    //Hàm thêm chứng chỉ qua ID, add Cert to employeeList
    public void addCert(int id) {
        boolean isExisted = false;
        for (Employee certificate : employeeList) {
            if (certificate.getId() == id) {
                isExisted = true;
                certificate.setCertificatedID(inputCertificatedID());
                certificate.setCertificateName(inputCertificateName());
                certificate.setCertificateRank(inputCertificateRank());
                certificate.setCertificatedDate(inputCertificatedDate());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id: %d không tồn tại.\n", id);
        } else {
            employeeDao.write(employeeList);
        }
    }
    //Hiện chứng chỉ của nhân viên, showCert through employeeList
    public void showCert() {
        for (Employee a : employeeList) {
            System.out.print("\n");
            System.out.format("\t%10d | ", a.getId());
            System.out.format("\t%20s | ", a.getCertificatedID());
            System.out.format("\t%20s | ", a.getCertificateName());
            System.out.format("\t%20s | ", a.getCertificateRank());
            System.out.format("\t%20s | ", a.getCertificatedDate());
            System.out.print("\n\n");
        }
    }
    //Hàm showInfo để hiển thị thông tin chung của nhân viên ra màn hình console
    public void showInfo() {
        for (Employee a : employeeList) {
            System.out.print("\n");
            System.out.format("\t\t%10d | ", a.getId());
            System.out.format("\t\t%20s | ", a.getFullName());
            System.out.format("\t\t%20s | ", a.getBirthDay());
            System.out.format("\t\t%20s | ", a.getPhone());
            System.out.format("\t\t%20s | ", a.getEmail());
            System.out.print("\n\n");
        }
    }
    //Các hàm input từ console
    public int inputID() {
        System.out.print("Nhập ID nhân viên: ");
        while (true) {
            try {
                return Integer.parseInt((scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
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

    public String inputGraduation_date(){
        System.out.println("Thời gian tốt nghiệp: ");
        return scanner.nextLine();
    }
    public String inputGraduation_rank(){
        System.out.println("Xếp loại tốt nghiệp: ");
        return scanner.nextLine();
    }
    public String inputEducation(){
        System.out.println("Trường: ");
        return scanner.nextLine();
    }
    public String inputProskill(){
        System.out.println("Kĩ năng chuyên môn: ");
        return scanner.nextLine();
    }
    public Double inputExpInYear(){
        System.out.println("Số năm kinh nghiệm: ");
        return scanner.nextDouble();
    }

    public String inputMajors(){
        System.out.println("Chuyên ngành: ");
        return scanner.nextLine();
    }
    public String inputSemester(){
        System.out.println("Học kì: ");
        return scanner.nextLine();
    }
    public String inputUniversity_name(){
        System.out.println("Đại học: ");
        return scanner.nextLine();
    }


    private String inputCertificatedID(){
        System.out.println("Nhập ID bằng cấp: ");
        return scanner.nextLine();
    }

    private String inputCertificateName(){
        System.out.println("Nhập tên bằng cấp: ");
        return scanner.nextLine();
    }

    private String inputCertificateRank(){
        System.out.println("Hạng bằng cấp: ");
        return scanner.nextLine();
    }
    private String inputCertificatedDate() {
        System.out.println("Hạn bằng cấp: ");
        return scanner.nextLine();
    }
}
