public class Intern extends Employee {
    //Nhân viên Intern có thêm thuộc tính: Chuyên ngành đang học (Majors), Học kì đang học (Semester),
    //Tên trường đang học (University_name)
    String Majors;
    String Semester;
    String University_name;

    public Intern(int id, String fullName, String birthDay, String phone, String email, String Majors,
                  String Semester, String University_name) {
        //super(): tham chiếu trực tiếp đến các biến trong class Employee
        super(id, fullName, birthDay, phone, email);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    public void showInfo() {
        System.out.println("Thông tin của Intern:\n");
        System.out.println("Chuyên ngành: " + Majors + ", Học kì: " + Semester
                + ", Trường: " + University_name);
    }
}