package Lec8_ClassObject.Example;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Tim sinh vien theo ID");
            System.out.println("4. Xoa sinh vien theo ID");
            System.out.println("5. Chinh sua sinh vien theo ID");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    studentList.enterStudentList();
                    break;

                case 2:

                    studentList.displayAllStudents();
                    break;

                case 3:

                    System.out.print("Nhap ID sinh vien can tim: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    }
                    break;

                case 4:

                    System.out.print("Nhap ID sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                    break;

                case 5:

                    System.out.print("Nhap ID sinh vien can chinh sua: ");
                    String idToEdit = scanner.nextLine();
                    studentList.editStudentById(idToEdit);
                    break;

                case 0:

                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
