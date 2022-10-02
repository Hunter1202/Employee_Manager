public class Fresher extends Employee{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(int id, String fullName, String birthDay, String phone, String email,
                   String Graduation_date, String Graduation_rank, String Education) {
        super(id, fullName, birthDay, phone, email);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }
    protected void showInfo() {
        System.out.println("Thông tin của nhân viên: \n");
        System.out.println(id+"\n"+fullName+"\n"+birthDay+"\n"+phone+"\n"+email+"\n"+Graduation_date+"\n"+
                Graduation_rank+"\n"+Education+"\n");
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
}