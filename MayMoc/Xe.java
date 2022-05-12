
package MayMoc;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Xe implements MayMoc , Comparator<Xe> {
    public String maXe;
    public String tenXe;
    public String tenDN;
    public String tenKH;
    public String NL;
    public int NamSX;
    public int TrongTai;
    
    

    @Override
    public void setNhienLieu(String NL) {
        this.NL = NL;
    }

    @Override
    public void setNamSX(int NamSX) {
        if ( NamSX >0 )
            this.NamSX = NamSX;
        else
            this.NamSX = 2016;
    }
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma xe: ");
            maXe = sc.nextLine();
        System.out.println("Nhap ten xe: ");
            tenXe = sc.nextLine();
        System.out.println("Nhap ten Doanh nghiep: ");
            tenDN = sc.nextLine();
        System.out.println("Nhap nam SX: ");
            NamSX = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap trong tai: ");
            TrongTai = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten KH: ");
            tenKH = sc.nextLine();
        System.out.println("Nhap nhien lieu: ");
            setNhienLieu(sc.nextLine());
        System.out.println("Nhap nam SX: ");
            setNamSX(Integer.parseInt(sc.nextLine()));
    }
    public static void InTieuDe()
    {
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %n","Ma Xe","Ten xe","Ten DN", "Ten KH","Trong Tai","Nhien Lieu", "Nam SX");
    }
    public void InDL()
    {
        System.out.printf("%10s %10s %10s %10s %10d %10s %10d %n",maXe,tenXe,tenDN,tenKH,TrongTai,NL,NamSX);
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Xe other = (Xe) obj;
        return Objects.equals(this.maXe, other.maXe);
    }

    @Override
    public int compare(Xe o1, Xe o2) {
      //return  (int) (o1.getTrongTai() - o2.getTrongTai());
      
      //return ( o1.tenXe.compareTo(o2.tenXe));
      return ( o1.TrongTai- o2.TrongTai);
    }
    
    
    
}


