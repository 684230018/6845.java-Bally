package Loop;

import java.util.Scanner;

public class W11_02_While_Teue_ChooseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // โจทย์: เขียนโปรแกรมให้ผู้เลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
        
//===========================================================================================        
        // แสดงข้อความรับตัวเลข 2 จำนวน
        System.out.print("Enter Number1:");
        int num1 = kb.nextInt();
        System.out.print("Enter Number2:");
        int num2 = kb.nextInt();

//===========================================================================================        
        // เเสดงเมนูเพื่อรับ choice
        System.out.print("===========================");
        System.out.print("Meru");
        System.out.print("1.Addition");
        System.out.print("2.Subtraction");
        System.out.print("3.Exit");
        System.out.print("===========================");
        while(true){ 
            System.out.print("Enter you choice");
            int choice = kb.nextInt();
            System.out.print("------------------------");
            
            switch (choice) {
                case 1:
                int result = num1 + num2;
                System.out.println("Additon Result:"+ result);
                break; // ออกจากลูป 
                case 2:
                System.out.println("Additon Result:"+ ( num1 - num2));
                break; // ออกจากลูป
                case 3:
                System.out.println("Enter the program. Goodbye!");
                break; // ออกจากลูป
                    }
                    if(choice == 1){
                        break; // ออกจากลุป while(true)
                    }else if(choice == 2){
                        break; // ออกจากลุป while(true)
                    }else if(choice == 3){
                        break; // ออกจากลุป while(true)
                    }else{
                    System.out.println("There is su");   
                    }    
                    }
                }
            }
        
