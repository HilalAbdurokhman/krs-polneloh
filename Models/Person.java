
package Model;


public abstract class Person {
    private String nama;
    
    public abstract void showProfil();
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
}
