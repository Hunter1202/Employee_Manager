public class Experienced extends Employee{
    private double ExpInYear;
    private String ProSkill;


    public Experienced(int id, String fullName, String birthDay, String phone, String email, double ExpInYear,
                       String ProSkill) {
        super(id, fullName, birthDay, phone, email);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }
    protected void showInfo(){
        System.out.println("Thông tin của nhân viên: \n");
        System.out.println(id+"\n"+fullName+"\n"+birthDay+"\n"+phone+"\n"+email+"\n"+ExpInYear+"\n"+ProSkill+"\n");
    }
    public double getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(double expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
}