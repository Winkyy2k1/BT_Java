
package BTMayMoc;

import java.util.Scanner;

public class DoanhNghiep {
    
    private String TenDN;
    private String SoDT;
    private String DiaChi;
    
    public void Nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten Doanh nghiep: ");
        TenDN = sc.nextLine();
        System.out.println("Nhap SDT: ");
        SoDT = sc.nextLine();
        System.out.println("Nhap Dia chi : ");
        DiaChi = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return  TenDN +" - "+  SoDT + " - " + DiaChi ; 
    }
    
}
