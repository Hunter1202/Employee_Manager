import java.util.regex.Pattern;
public class checkException {

    static String validName(String name) throws Exception{
        String NAME_PATTERN =
                "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặ" +
                        "laẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        if(!Pattern.matches(NAME_PATTERN, name))
            throw new Exception("tên không hợp lệ, mới nhập lại: ");
        return name;
    }

    static String validDate(String date) throws Exception{
        String DATE_PATTERN =
                "(([1-2][0-9])|([1-9])|(3[0-1]))/((1[0-2])|([1-9]))/[0-9]{4}";
        if(!Pattern.matches(DATE_PATTERN, date))
            throw new Exception("sai định dạng ngày tháng, mời nhập lại");
        return date;
    }

    static String validPhone(String phone) throws Exception{
        String PHONE_PATTERN =
                "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        if(!Pattern.matches(PHONE_PATTERN, phone))
            throw new Exception("sai định dạng số điện thoại, mời nhập lại");
        return phone;
    }

    static String validEmail(String email) throws Exception {
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        if (!Pattern.matches(EMAIL_PATTERN, email))
            throw new Exception("sai định dạng email, mời nhập lại");
        return email;
    }
}

