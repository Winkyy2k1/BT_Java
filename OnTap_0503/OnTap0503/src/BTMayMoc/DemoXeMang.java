package BTMayMoc;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Scanner;

public class DemoXeMang {

    static ArrayList<Xe> ds = new ArrayList<Xe>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Quan ly xe \n");
        int chon;
        do {
            System.out.println("========= MEMU ======== ");
            System.out.println("1 Nhap danh sach xe. ");
            System.out.println("2 Hien thi danh sach xe. ");
            System.out.println("3 Tim kiem xe theo ten nhap");
            System.out.println("4. Xoa xe theo ten ");
            System.out.println("5. Sap xep xe theo ten ");
            System.out.println("6. Thoat. \n ");
            System.out.print("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapXe();
                    break;
                case 2:
                    HienThi();
                    break;
                case 3:
                    System.out.println("Nhap tên xe muon tim: ");
                    Scanner s = new Scanner(System.in);
                    String ten = s.nextLine();
                    timXe(ten);
                    break;
                case 4:
                    System.out.println("Nhap tên xe muon xoa: ");
                    Scanner s2 = new Scanner(System.in);
                    String ten2 = s2.nextLine();
                    XoaXe(ten2);
                    break;
                case 5:
                    //sapXep();
                    System.out.println("DANH SACH SAU SAP XEP LA: ");
                    sort(ds, new Xe());
                    System.out.println("Chon hien thi ds de xem ds sau sap xep");
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh va thoat.");
                    return;
            }
        } while (chon != 6);
    }

    private static void nhapXe() {

        Xe x = new Xe();
        x.Nhap();
        ds.add(x);
    }

    private static void HienThi() {
        Xe.inTieuDe();
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).InDL();
        }
    }

    private static boolean timXe(String ten) {
        for (Xe item : ds) {
            if (item.tenXe == null ? ten == null : item.tenXe.equals(ten)) {
                System.out.println("Tim thay xe: ");
                Xe.inTieuDe();
                item.InDL();
                return true;
            }
        }
        System.out.println("Khong timf thay xe co ten do. ");
        return false;

    }

    private static boolean XoaXe(String ten2) {

        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).tenXe.equals(ten2)) {
                ds.remove(i);
                System.out.println("Chon hien thi ds de xem ds sau xoa");
            }
        }
        System.out.println("Khong timf thay xe can . ");
        return false;
    }

}
