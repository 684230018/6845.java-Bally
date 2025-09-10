import java.util.Scanner;
public class W09_01_CalculateGrade {
    public static void main(String[] args) {
       //รับค่าคะแนน
       //เปรียบเทียบคะแนนว่าได้เกรดอะไร
       //เกณฑ์คะแนนและเกรด
       // A = 80;
       // B = 70;
       // C = 60;
       // D = 50;
       // F = 0-49;
       //คะแนนที่กรอกอยุ่ในช่วง 0-100

        Scanner scanner = new Scanner(System.in);

        System.out.println("(ใส่คะแนน");

        double score = scanner.nextByte();
        if(score > 0 && score <= 100) {

        if(score>= 80) {
        System.out.println("A");
        }else if(score>= 70) { 
        System.out.println("B");
        }else if(score>= 60) {
        System.out.println("C");
        }else if(score>= 50) {
        System.out.println("D");
        }else {
        System.out.println("F");
        
        scanner.close();        
    }
    }
    }
}
