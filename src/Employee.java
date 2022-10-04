import java.io.Serializable;
//Sử dụng file để lưu trữ và truy xuất các đối tượng nhân viên.
//Nên lớp Employee phải được implements Serializable.
public abstract class Employee implements Serializable {
    public int id;
    public String fullName;
    public String birthDay;
    public String phone;
    public String email;
    public String certificatedID;
    public String certificateName;
    public String certificateRank;
    public String certificatedDate;

    //Constructor
    public Employee(int id, String fullName, String birthDay, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
    }

    // Getter & Setter
    abstract void showInfo();

    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
}


