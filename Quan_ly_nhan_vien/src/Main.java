
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose;
        boolean exit = false;
        EmployeeManager employeeManager = new EmployeeManager();
        int employeeID;

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1" -> employeeManager.add();
                case "2" -> {
                    employeeID = employeeManager.inputId();
                    employeeManager.edit(employeeID);
                }
                case "3" -> {
                    employeeID = employeeManager.inputId();
                    employeeManager.delete(employeeID);
                }
                case "4" -> employeeManager.showInfo();
                case "0" -> {
                    System.out.println("Kết thúc!");
                    exit = true;
                }
                default -> System.out.println("Không hợp lệ, mời chọn lại:");
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("*---------* Menu *-----------*");
        System.out.println("1. Thêm nhân viên.");
        System.out.println("2. Chỉnh sửa nhân viên qua ID.");
        System.out.println("3. Xóa nhân viên qua ID.");
        System.out.println("4. Hiện nhân viên.");
        System.out.println("0. Đóng.");
        System.out.println("==============================");
        System.out.print("Please choose: ");
    }

    Package Quan_ly_nhan_vien;
}