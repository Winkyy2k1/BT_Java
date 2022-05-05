/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de4_hinhphang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demo {

    static ArrayList<HinhVuong> list = new ArrayList<>();
    static int soHV;
    static Scanner sc = new Scanner(System.in);

    public static Boolean checkList(HinhVuong x) {
        for (HinhVuong item : list) {
            if (item.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static void nhapds() {
        System.out.print("Nhap so hinh vuong: ");
        try {
            int temp = sc.nextInt();
            if (temp < 0 || temp > 10) {
                throw new Exception();
            }
            soHV = temp;
        } catch (Exception e) {
        }
        for (int i = 0; i < soHV; i++) {
            HinhVuong x = new HinhVuong();
            while (true) {
                x.nhapDL();
                if (checkList(x) == false) {
                    list.add(x);
                    System.out.println("thanh cong");
                    break;
                }
                System.out.println("Ma hinh da ton tai. Yeu cau nhap lai");
            }
        }
    }

    public static void xuatds() {
        HinhVuong.inTieuDe();
        for (HinhVuong item : list) {
            item.xuatDL();
//System.out.println(item.toString());
        }
    }

//    public static HinhVuong check(String maHinh){
//       
//    }
    public static void suaHinh(String maHinh) {
        HinhVuong x = null;
        for (HinhVuong item : list) {
            if (item.equals(maHinh) == true) {
                System.out.println("1");
                x = item;
                list.remove(item);
            }
        }
        if (x != null) {
            while (true) {
                System.out.print("Sua ma hinh: ");
                x.maHinh = sc.nextLine();
                if (checkList(x) == false) {
                    list.add(x);
                    break;
                }
                System.out.println("Ma hinh da ton tai! ban can nhap mot cai name khac hoan toan");
            }
        } else {
            System.out.println("Ma hinh chua ton tai trong danh sach");
        }
    }

    public static void findMaxP(){
        HinhVuong x = Collections.max(list, new Comparator<HinhVuong>(){
            @Override
            public int compare(HinhVuong o1, HinhVuong o2) {
                return o1.tinhCV()-o2.tinhCV();
            }
            
        });
        System.out.println(x.toString());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nhapds();
        xuatds();
        System.out.print("Nhap hinh can sua:");
        sc.nextLine();
        String maHinh = sc.nextLine();
        suaHinh(maHinh);
        xuatds();
        System.out.println("\nHinh co chu vi lon nhat la");
        findMaxP();
    }

}
