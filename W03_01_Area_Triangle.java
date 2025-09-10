import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in); //สร้างอ็ออบเจกด์ เพื่อป้องกันผู้ใช้
       // Input base and height of triangle
       System.out.print("Enter height ="); // แสดงข้อความให้ผุ้ใช้ป้อนฐานของรูปสามเหลี่ยม
       int height = kb.nextInt(); // รับค่าฐานจากผุ้ใช้ที่กรอกผ่านคีย์บอร์ดเป็นตัวเลขจำนวนเjava ต็ม

       System.out.print("Enter base = ");
       int base = kb.nextInt();
       
       // Calculate area of triangle
       double area = 0.5* base* height; //หรือใส่ชนิดข้อมูลเป็น float ก็ได้
       
       System.out.print("Area of Triangle =" + area);

       kb.close(); // ปิดอ็อบเจ็กต์ Scanner เพื่อป้องกันการรั่วใหลของทรัพยากร
       
    }
}
