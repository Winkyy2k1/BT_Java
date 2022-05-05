/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4_hinhphang;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhVuong extends DaGiac {

    private int a, b, c, d;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) throws Exception {
        if (b != this.a) {
            throw new Exception();
        }
        this.b = b;
    }

    public void setC(int c) throws Exception {
        if (c != this.a) {
            throw new Exception();
        }
        this.c = c;
    }

    public void setD(int d) throws Exception {
        if (d != this.a) {
            throw new Exception();
        }
        this.d = d;
    }

    public String getmaHinh() {
        return maHinh;
    }

    public void setmaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public int[] getDsCanh() {
        return dsCanh;
    }

    public void setDsCanh() {
        int[] dsCanh = null;
        dsCanh[0] = a;
        dsCanh[1] = b;
        dsCanh[2] = c;
        dsCanh[3] = d;

        this.dsCanh = dsCanh;
    }

    @Override
    public int tinhCV() {
        return a + b + c + d;
    }

    @Override
    public float tinhDT() {
        return a * b;
    }

    @Override
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Nhap ma hinh");
        maHinh = sc.nextLine();
        setA(rand.nextInt(100) + 1);
        while (true) {
            try {
                setB(rand.nextInt(100) + 1);
                setC(rand.nextInt(100) + 1);
                setD(rand.nextInt(100) + 1);
                break;
            } catch (Exception e) {
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-5s %10s %10s %10s %10s %10s %10s%n ", "ma hinh", "canh1", "canh2", "canh3", "canh4", "Chu vi", "Dien tich");

    }

    public void xuatDL() {
        System.out.printf(" %-5s %10s %10s %10s %10d %10d %10.2f%n ", maHinh, a, b, c, d, tinhCV(), tinhDT());
    }

    @Override
    public String toString() {
        return "HinhVuong{" +"ma hinh"+maHinh+ "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "Chu vi = "+tinhCV()+"Dien tich = "+tinhDT()+'}';
    }

    @Override
    public boolean equals(Object obj) {

        final HinhVuong other = (HinhVuong) obj;

        if (!Objects.equals(this.maHinh, other.maHinh)) {
            return false;
        }
        return true;
    }
     public boolean equals(String maHinh) {


        if (!Objects.equals(this.maHinh, maHinh)) {
            return false;
        }
        return true;
    }

}
