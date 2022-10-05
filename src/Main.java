import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose;
        boolean exit = false;
        EmployeeManager employeeManager = new EmployeeManager();
        int employeeID;

        //Hiện bảng Menu tùy vào người dùng nhập vào (1,2,3,...)
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1" -> employeeManager.addExpert();
                case "2" -> employeeManager.addFresher();
                case "3" -> employeeManager.addIntern();
                case "4" -> {
                    employeeID = employeeManager.inputID();
                    employeeManager.find(employeeID);
                }
                case "5" -> {
                    employeeID = employeeManager.inputID();
                    employeeManager.edit(employeeID);
                }
                case "6" -> {
                    employeeID = employeeManager.inputID();
                    employeeManager.delete(employeeID);
                }
                case "7" -> {
                    employeeID = employeeManager.inputID();
                    employeeManager.addCert(employeeID);
                }
                case "8" -> employeeManager.showInfo();
                case "9" -> employeeManager.showCert();
                 case "0" -> {
                    System.out.println("Kết thúc!");
                    exit = true;
                }
                default -> System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tKhông hợp lệ, mời chọn lại!!!");
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    //Tạo giao diện phương thức showMenu()
    public static void showMenu() {
        System.out.println("\t\t\t\t\t\t\t ============================ *CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN* =============================");
        System.out.println("\t\t\t\t\t\t\t*-----------------------------------------* Menu *------------------------------------------*");
        System.out.println("\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t 1. Thêm Expert.\t\t\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t 2. Thêm Fresher.\t\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t 3. Thêm Intern.\t\t\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t 4. Tìm nhân viên qua ID.\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t 5. Chỉnh sửa nhân viên qua ID.\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t 6. Xóa nhân viên qua ID.\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t 7. Thêm bằng cấp qua ID.\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t 8. Hiện nhân viên.\t\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t 9. Hiện bằng cấp.\t\t\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t 0. Đóng.\t\t\t\t\t\t\t\t\t\t\t\t*");
        System.out.println("\t\t\t\t\t\t\t============================================================================================");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease choose: ");
    }
}






















