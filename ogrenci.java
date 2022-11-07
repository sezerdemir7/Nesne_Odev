
package odev1;


public class ogrenci {
    private String ad;
    private String no;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public ogrenci(String ad, String no) {
        this.ad = ad;
        this.no = no;
    }

    public ogrenci() {
        
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
