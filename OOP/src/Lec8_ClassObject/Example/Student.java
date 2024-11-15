package Lec8_ClassObject.Example;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Student {

    String studentId;
    String fullName;
    Date dateOfBirth;
    String major;
    float gpa;

    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ID sinh vien: ");
        studentId = scanner.nextLine();

        System.out.print("Nhap ten day du: ");
        fullName = scanner.nextLine();

        System.out.print("Nhap ngay sinh (dd-MM-yyyy): ");
        String dob = scanner.nextLine();
        try {
            dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le");
        }

        System.out.print("Nhap nganh hoc: ");
        major = scanner.nextLine();

        System.out.print("Nhap GPA: ");
        gpa = scanner.nextFloat();
    }

    public void displayStudentInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("ID: " + studentId);
        System.out.println("Ten day du: " + fullName);
        System.out.println("Ngay sinh: " + dateFormat.format(dateOfBirth));
        System.out.println("Nganh hoc: " + major);
        System.out.println("GPA: " + gpa);
    }
}
