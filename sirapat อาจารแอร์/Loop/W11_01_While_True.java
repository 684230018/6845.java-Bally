package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        while(true){ 
            // No.1 เขียนโปรแกรมรับตัวเลขจากคีย์บอดไปเรื่อยๆ จนกระทั้งเบอร์ 9 ถึงจะหยุด
            System.out.print("Enter Number");
            string num = kb.nextInt();
            
            //if(num == 9) { // คำสั่งที่ใช้ตรวจสอบการออกจากลูป
            //    break; // คำสั่งที่ใช้ในการออกจากลูป
              // No.2 เขียนโปรแกรมรับตัวเลขจากคีย์บอดไปเรื่อยๆ จนกระทั้งเบอร์ "e" ถึงจะหยุด  
            
            System.out.print("Enter Alphabet: ");
            String alphabet = kb.nextLine();
            if(alphabet.equals("e")) {

            }
            
        }
    }
}
