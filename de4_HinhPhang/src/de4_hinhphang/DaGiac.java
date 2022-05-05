/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4_hinhphang;

import java.util.Objects;

public abstract class DaGiac {

    protected String maHinh;
    protected int dsCanh[];

    public abstract int tinhCV();

    public abstract float tinhDT();

    public abstract void nhapDL();


    @Override
    public boolean equals(Object obj) {
        
        final DaGiac other = (DaGiac) obj;
        if (!Objects.equals(this.maHinh, other.maHinh)) {
            return false;
        }
        return true;
    }
    
    
}
