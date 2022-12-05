import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    private static final String EMPLOYEE_FILE_NAME = "Employee.txt";
    /**
     * Lưu danh sách nhân viên vào file Employee.txt
     * employeeList: tạo danh sách nhân viên để lưu
     */
    public void write(List<Employee> employeeList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(EMPLOYEE_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    /**
     * Đọc danh sách nhân viên từ file và trả về danh sách nhân viên
     */
    public List<Employee> read() {
        List<Employee> employeeList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(EMPLOYEE_FILE_NAME));
            ois = new ObjectInputStream(fis);
            employeeList = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return employeeList;
    }
    /**
     * close input stream
     */
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * close output stream
     */
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
