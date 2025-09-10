package Loop.Arrays;

public class W13_02_basicArray {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ Array แบบที่ 1 ระบุสมาชิกในวงเล็บปีกกา
        //String animals[];
        String animals [] = {"Dog", "cat", "Lion"};
        int dice[] = {1, 2, 3, 4, 5, 6};
        float avgScore[] = {3.50f, 4.00f, 2.75f};
        
        // หาขนาดของ Array
        System.out.println("Size of animals array : " + animals.length);

        // การเข้าถึงสมาชิก Array
        System.out.println("Animal at index 0 : " + animals[0]);
        System.out.println("Animal at index 2 : " + animals[2]);

        // วนลุปแสดงสมาชิก Array avgScore
        System.out.println("Show all average scores : ");
        for(int i=0;i < avgScore.length ;i++){
            System.out.println("avgScore[i]");
        }
//==================================================================================
        // การประกาศตัวแปร Array แบบที่ 2 ระบุขนาดของ Array
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";

        System.out.println("Size of animals array : " + colors.length);
        System.out.println("Animal at index 0 : " + animals[0]);
        System.out.println("Animal at index 1 : " + animals[1]);

        for(int e=0;e< colors.length ;i++)
        System.out.println(k+ e++ +" : " +colors[e]);
//==================================================================================
        
int scores[] = new int[5];
        Score[0] = 50;

        System.out.println("Animal at index 4 : " + animals[4]);
    }
}
