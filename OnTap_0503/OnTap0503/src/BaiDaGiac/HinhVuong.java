
package BaiDaGiac;

import java.util.Random;
import java.util.Scanner;

public class HinhVuong extends DaGiac{

    private int a , b, c, d;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) throws Exception {
        if(b != this.a) 
        {
            throw new Exception();
        }
        this.b = b;
    }

    public void setC(int c) throws Exception {
        if(c != this.a) 
        {
            throw new Exception();
        }
        this.c = c;
    }

    public void setD(int d) throws Exception {
         if(d != this.a) 
        {
            throw new Exception();
        }
        this.d = d;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public void setDsCanh() {
        int [] dsCanh = null;
        dsCanh[0] = a;
        dsCanh[1] = b;
        dsCanh[2] = c;
        dsCanh[3] = d;
        
        this.dsCanh= dsCanh;  
    }

    @Override
    public int tinhCV() {
       return a+b+c+d;
    }

    @Override
    public int tinhDT() {
        return a*b;
    }

    @Override
    public int nhapDL() {
       Scanner sc= new Scanner(System.in);
       System.out.println("Nhap ma hinh: ");
       maHinh = sc.nextLine();
       Random rand= new Random();
       setA(rand.nextInt(1000)+100);
       while(true)
       {
           try{
            setB(rand.nextInt(1000)+100);   
            setC(rand.nextInt(1000)+100);
            setD(rand.nextInt(1000)+100);
           }catch ( Exception e)
           {
               System.out.println("Co loi: " + e);
           }
       }
    }
    public void inTieuDe()
    {
        System.out.printf("%5s %10s %10s %10s %10s %10s %10s %n","Ma hinh", "Canh 1", "Canh 2", "Canh 3", "Canh 4", "ChuVi","DienTich");
    }
    public void XuatTT()
    {
        System.out.printf("%5s %10d %10d %10d %10d %10d %10d %n","Ma hinh", "Canh 1", "Canh 2", "Canh 3", "Canh 4", "ChuVi","DienTich");
        
    }
    
}
