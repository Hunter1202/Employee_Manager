public class Fresher extends Employee {
    /**
     Nhân viên Fresher có thêm thuộc tính: Thời gian tốt nghiệp(Graduation_date),
     Xếp loại tốt nghiệp (Graduation_rank) , Học vấn (Education)
     */
    String Graduation_date;
    String Graduation_rank;
    String Education;

    //Constructor
    public Fresher(int id, String fullName, String birthDay, String phone, String email,
                   String Graduation_date, String Graduation_rank, String Education) {
        //super(): tham chiếu trực tiếp đến các biến trong class Employee
        super(id, fullName, birthDay, phone, email);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    //showInfo()
    @Override
    public void showInfo() {
        System.out.println("Thông tin của Fresher:\n");
        System.out.println("Thời gian tốt nghiệp: " + Graduation_date + ", Xếp loại tốt nghiệp: " + Graduation_rank
                + ", Trường: " + Education);
    }
}