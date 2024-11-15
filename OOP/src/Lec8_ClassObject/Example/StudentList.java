package Lec8_ClassObject.Example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();

    public void enterStudentList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sach sinh vien trong.");
            return;
        }
        for (Student student : studentList) {
            student.displayStudentInfo();
            System.out.println("-----------");
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.studentId.equals(idToFind)) {
                return student;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ID: " + idToFind);
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Da xoa sinh vien voi ID: " + idToDelete);
            return true;
        } else {
            System.out.println("Khong tim thay sinh vien voi ID: " + idToDelete);
            return false;
        }
    }

    public boolean editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("Nhap thong tin moi cho sinh vien voi ID: " + idToEdit);
            student.enterStudentInfo();
            return true;
        } else {
            System.out.println("Khong tim thay sinh vien voi ID: " + idToEdit);
            return false;
        }
    }
}
