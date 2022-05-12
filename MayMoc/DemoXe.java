
package MayMoc;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Scanner;

public class DemoXe {
    static ArrayList<Xe> dsXe = new ArrayList<Xe>();
    
    static Boolean checkId(String sbd)
        {
            for (var item : dsXe)
            {
                if (sbd.compareTo(item.maXe) == 0)
                {
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) 
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("==== Quan ly xe ==== ");
       
       int chon;
       
       do{
           System.out.println("1. Nhap danh sach xe. ");
           System.out.println("2. Hien thi danh sach xe");
           System.out.println("3. Them 1 xe vao vi tri x");
           System.out.println("4. Tim xe co ma vua nhap");
           System.out.println("5. Sua xe co ma vua nhap");
           System.out.println("6. Xoa xe co ma vua nhap ");
           System.out.println("7. Sap xep xe theo trong tai tang dan. ");
           System.out.println("8. Tìm max trong tai. ");
           System.out.println("9. Ket thuc. ");
           System.out.println("=== HAY NHAP LUA CHON CUA BAN: ===");
           chon = Integer.parseInt(sc.nextLine());
           
           switch(chon)
           {
               case 1:
               {   
                   NhapXe();
                   break;
               }
               case 2:
               {   
                   HienDL();
                   break;
               }
               case 3:
               {    
                  
                   System.out.print("Nhap vi tri can chen them.( tinh tu 0) ");
                   int vitri = Integer.parseInt(sc.nextLine());
                   if( vitri >= 0 && vitri <= dsXe.size() ) 
                   {
                        Xe x = new Xe();
                        x.Nhap();
                        if(!checkId(x.maXe))
                            dsXe.add(vitri,x);
                   }else System.out.println(" Khong the them.");
                   break;
               }
               case 4:
               {    
                   System.out.print("Nhap ma xe muon tim: ");
                   String ma = sc.nextLine();
                   TimXe(ma);
                   break;
               }
               case 5:
               {
                   System.out.print("Nhap ma xe muon sua: ");
                   String ma = sc.nextLine(); 
                   if(TimXe(ma)== true)
                   {
                       System.out.println("Hay nhap lai xe muon sua: ");
                       //NhapXe();
                       // doan nay sai nhá.
                   }
                   else System.out.println("Khong tim thay xe muon sua.");
                   break;
               }
               case 6:
               {   System.out.print("Nhap ma xe muon xoá: ");
                   String ma = sc.nextLine(); 
                   XoaXe(ma);
                   break;
               }
               case 7:
               {    System.out.println("DANH SACH LUC CHUA SAP XEP LA: ");
                    HienDL();
                    sort(dsXe, new Xe());
                    System.out.println("DANH SACH SAU SAP XEP TANG DAN LA: "); 
                    HienDL();
                   break;
               }
               case 8:
               {
                   System.out.println("Tìm  cac xe có trong tai max. ");
                   sort(dsXe, new Xe()); // sau so sánh xe co trong tai max nam cuoi day.
                   Xe Xe_max = dsXe.get(dsXe.size()-1);
                   int max_TT =Xe_max.TrongTai;  // lây ra tr?ng tai max.
                   
                   // System.out.println(" Trong tai max là: " +  max_TT);
                   Xe.InTieuDe();
                   for( int i=0; i<dsXe.size(); i++)
                   {
                      if(dsXe.get(i).TrongTai== max_TT)
                         dsXe.get(i).InDL();
                   }
                   return;
               }
               case 9:
               {
                   System.out.println("Chuong trinh da chay xong. Ket thuc!");
                   return;
               }
           }
       } while(chon!=9);
    }
    
    public static void NhapXe()
    {
        System.out.println("Ban chon nhap du lieu cho xe: Moi nhap.");
            Xe x = new Xe();
            x.Nhap();
            if(!checkId(x.maXe))
            {
                dsXe.add(x);
            }
            else System.out.println("Mã xe vua nhap bi trung. Hay nhap lai.");
    }
    
    public static void HienDL()
    {
        Xe.InTieuDe();
        for (int i = 0; i < dsXe.size(); i++) {
           dsXe.get(i).InDL();
        }
    }
    public static boolean TimXe(String maXe)
    {
        for( var item : dsXe)
        {
           if(maXe.equals(item.maXe))
           {
               System.out.println("Tim thay xe: "); 
               Xe.InTieuDe();
               item.InDL();
               return true;
           }
        }
        System.out.println("Khong tim thay xe co ma vua nhap. ");
            return false;
    }

    private static boolean XoaXe(String ma) {
        for (int i = 0; i < dsXe.size(); i++) {
            if(dsXe.get(i).maXe.equals(ma))
            {
                dsXe.remove(i);
                System.out.println("Danh sach sau khi xoa là: ");
                HienDL();
                return true;
            }    
        }
        System.out.println("Khong tim thay xe vua nhap. ");
        return false;
    }
    
    
}
