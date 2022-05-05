/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_18_tranlamhoai;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PV
 */
public class TamGiaccan extends HinhPhang {

    private String mahinh;
    private int canh1, canh2, canh3;

    public TamGiaccan() {
    }

    public void setMahinh(String mahinh) {
        this.mahinh = mahinh;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public String getMahinh() {
        return mahinh;
    }

    public void setCanh2(int canh2) throws Exception {
        if (canh2 != this.canh1) {
            throw new Exception("canh 2 khong bang canh 1");
        }

        this.canh2 = canh2;
    }

    public void setCanh3(int canh3) throws Exception {
        if (canh3 <= this.canh1 + this.canh2) {
            throw new Exception("canh 3 be hon tong 2 canh con lai");
        }
        this.canh3 = canh3;
    }

    @Override
    public String toString() {
        return "TamGiaccan{" + "mahinh=" + mahinh + ", canh1=" + canh1 + ", canh2=" + canh2 + ", canh3="
                + canh3 + " chu vi= " + tinhCV() + " dien tich= " + tinhDT() + '}';
    }

    @Override
    int tinhCV() {
        return (canh1 + canh2 + canh3);
    }

    @Override
    float tinhDT() {
        float p = (float)tinhCV() / 2;
        return (float) Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s %10s%n ", "ma hinh", "canh 1", "canh 2", "canh 3",
                "chu vi", "dien tich");
    }

    public void nhap() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                Random rand = new Random();
                System.out.print("\nNhap ma hinh: ");
//                String mahinh1 = sc.nextLine();
//                if (mahinh1 == this.mahinh) {
//                    throw new Exception("co loi");
//                }
//                mahinh = mahinh1;

                mahinh = sc.nextLine();
//                canh1 = rand.nextInt(100) + 1;
                setCanh1(rand.nextInt(100) + 1);
//                System.out.println(canh1);
                while (true) {
                    try {
                        int a = rand.nextInt(100) + 1;
                        if (a != canh1) {
                            throw new Exception();
                        } 
                            canh2 = a;
                        
//                        setCanh2(rand.nextInt(100) + 1);
//                        System.out.println(canh2);
                        int b = rand.nextInt(100) + a;
                        if (b >= (canh1 + canh2)) {
                            throw new Exception();
                        } 
                            canh3 = b;
                        
//                        setCanh3(rand.nextInt(100) + 1);
//                        System.out.println("thanh cong");
                        break;
                    } catch (Exception e) {
//                        System.out.println(e);
                    }
                }
            } catch (Exception e) {
//                System.out.println(e);
            }
            break;
        }

    }

    public void xuat() {
        System.out.printf("%-10s %10d %10d %10d %10d %10.2f", mahinh, canh1, canh2, canh3, tinhCV(), tinhDT());
        System.out.println();
    }

  
    @Override
    public boolean equals(Object obj) {
      
        final TamGiaccan other = (TamGiaccan) obj;
    
        return Objects.equals(this.mahinh, other.mahinh);
    }
    
   

}
