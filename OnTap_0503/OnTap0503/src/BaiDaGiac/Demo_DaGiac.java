package BaiDaGiac;

import java.util.LinkedList;
import java.util.Scanner;

public class Demo_DaGiac {
    static LinkedList<HinhVuong> li = new LinkedList<>();
    static int soHV;
    static Scanner sc= new Scanner(System.in);
    
    public static Boolean checkList(HinhVuong x)
    {
        for(HinhVuong item:li)
        {
            if(item.equals(x))
            {
                return true;
            }
        } return false;
    }
}
