
package Model;

import java.util.ArrayList;


public class Dosen extends Person {
    private String nidn;
    private ArrayList<Matakuliah> listMatakuliahPengampu;
    private Matakuliah mataKuliahPengampu;
    
    //create
    
    public void lihatListMatakuliahPengampu(){
        //
    }
    
    public void tambahMatakuliahPengampu(Matakuliah matakuliah){
        //
    }
    
    public void setNidn(String nidn){
        this.nidn = nidn;
    }
    
    public String getNidn(){
       return nidn;
    }

    @Override
    public void showProfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
