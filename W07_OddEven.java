import java.util.Scanner;

public class W07_OddEven {
     public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
       
         // input: รับค่าจำนวนเต็มจากผู้ใช้
System.out.println();
int n = kb.nextInt();

 // Process : สูตรคำนวณเลขคู่และเลขคี่
int remain =n%2;

// Output : แสดงผลลัพธ์
if (remain == 0){
System.out.println("Number" + n + " is Even");

     }else {
System.out.println("Number" + n + " is odd");
     }
   }  
}
