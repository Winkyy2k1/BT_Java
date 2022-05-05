
package BTMayMoc;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Xe implements MayMoc, Comparator<Xe> {

    String tenXe;
        private DoanhNghiep dn = new DoanhNghiep(); 
    private float trongTai;
    private float tienDatCoc;
    private String tenKH;
    private String NL;
    private int namSX;
    
    @Override
    public void setNhieuLieu(String NL) {
        this.NL = NL;
    }

    @Override
    public void setNamSX(int namSX) {
        if(namSX >0 )
            this.namSX = namSX;
        else 
            this.namSX = 2022;
    }
    
    public void Nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten xe: ");
        tenXe= sc.nextLine();
        System.out.println("Nhap ten KH: ");
        tenKH= sc.nextLine();
        System.out.println("Nhap cac thuoc tinh cua Doanh nghiep: ");
            dn.Nhap();
        System.out.println("Nhap nhien lieu cua xe: ");
        setNhieuLieu (sc.nextLine());
        
        System.out.println("Nhap trong tai: ");
        trongTai= sc.nextFloat();
        System.out.println("Nhap tiem dat coc : ");
        tienDatCoc= sc.nextFloat();
        System.out.println("Nhap nam SX cua xe: ");
        setNamSX (sc.nextInt());
    }
    
    public static void inTieuDe()
    {
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %n", " Ten xe", "DoanhNgghiep","Trong Tai", "TienDatCoc","tenKH", "NhieuLieu","Nam SX");
    }
   public void InDL()
   {
       System.out.printf("%10s %10s %10.2f %10.2f %10s %10s %10d %n",tenXe,dn,trongTai, tienDatCoc,tenKH,NL,namSX);
   }

    public float getTrongTai() {
        return trongTai;
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
        return Objects.equals(this.tenXe, other.tenXe);
    }

    @Override
    public int compare(Xe o1, Xe o2) {
        return (int) (o1.getTrongTai() - o2.getTrongTai());
    }
}
