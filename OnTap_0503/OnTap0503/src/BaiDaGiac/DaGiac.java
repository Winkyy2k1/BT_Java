
package BaiDaGiac;

public abstract class DaGiac {
    protected String maHinh;
    protected int [] dsCanh;

    public DaGiac()
    {
        
    }
    public DaGiac(String maHinh, int[] dsCanh) {
        this.maHinh = maHinh;
        this.dsCanh = dsCanh;
    }
    


    public abstract int tinhCV();
    public abstract int tinhDT();
    public abstract int nhapDL();
    
    
}
