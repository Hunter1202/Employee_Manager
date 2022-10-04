
public class Experienced extends Employee {
    //  Nhân viên Experience có thêm thuộc tính: Số năm kinh nghiệm (ExpInYear), Kỹ năng chuyên môn (ProSkill)
    double ExpInYear;
    String ProSkill;

    //Constructor
    public Experienced(int id, String fullName, String birthDay, String phone, String email, double ExpInYear,
                       String ProSkill) {
        //super(): tham chiếu trực tiếp đến các biến trong class Employee
        super(id, fullName, birthDay, phone, email);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    //showInfo()
    public void showInfo() {
        System.out.println("Thông tin của Expert: \n");
        System.out.println("Số năm kinh nghiệm: " + ExpInYear + ", Kĩ năng chuyên môn: " + ProSkill);
    }
}