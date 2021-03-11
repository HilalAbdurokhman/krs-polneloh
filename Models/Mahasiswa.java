
package Model;


public class Mahasiswa extends Person{
    private String nim;
    private KRS krs;
    
    //Create
    
    public void cetakKRS(){
       //
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void pilihPaketKRS(KRS krs){
        //
    }
    
    public KRS getKRS(){
        return null;
    }

    @Override
    public void showProfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
