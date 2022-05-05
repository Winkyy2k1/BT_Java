/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2_18_tranlamhoai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PV
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static ArrayList<TamGiaccan> list = new ArrayList<TamGiaccan>();
//    static int soHinh;

    public static Boolean checkList(TamGiaccan x) {
        for (TamGiaccan item : list) {
            if (item.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static void nhapDS() {
        for (int i = 0; i < 7; i++) {
            TamGiaccan x = new TamGiaccan();
            while (true) {
                x.nhap();

                if (checkList(x) == false) {
                    list.add(x);
                    System.out.println("thanh cong");
                    break;
                }
                System.out.println("Ma hinh da ton tai. yau cau nhap lai ma hinh!");
            }
        }
    }

    public static void inDS() {
        TamGiaccan.inTieuDe();
        for (TamGiaccan item : list) {
//            System.out.println(item.toString());
            item.xuat();
        }
    }

    public static TamGiaccan findMaxS() {
        TamGiaccan x = Collections.max(list, new Comparator<TamGiaccan>() {
            @Override
            public int compare(TamGiaccan o1, TamGiaccan o2) {
                return (int) (o1.tinhDT() - o2.tinhDT());
            }

        });
        return x;
    }

    public static void main(String[] args) {

        nhapDS();
        inDS();
        System.out.println("---------hinh co S lon nhat---------");
        System.out.print(findMaxS().toString());
        System.out.println("\n---------sap xep---------");
        Collections.sort(list, new Comparator<TamGiaccan>() {
            @Override
            public int compare(TamGiaccan o1, TamGiaccan o2) {
                return o1.getMahinh().compareTo(o2.getMahinh());
            }
        });
        inDS();
    }

}
