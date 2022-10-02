public class Intern extends Employee{
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern(int id, String fullName, String birthDay, String phone, String email, String Majors,
                  String Semester, String University_name) {
        super(id, fullName, birthDay, phone, email);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }
    protected void showInfo() {
        System.out.println("Thông tin của nhân viên: \n");
        System.out.println(id + "\n" + fullName + "\n" + birthDay + "\n" + phone + "\n" + email + "\n" + Majors + "\n" +
                Semester + "\n" + University_name + "\n");
    }
    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }
}