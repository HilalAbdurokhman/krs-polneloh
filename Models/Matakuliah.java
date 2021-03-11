
package Model;


public class Matakuliah {
    private String namaMatakuliah;
    private int sks;
    private int semester;
    private Dosen pengampu;
    
    //create
    
    public void setNamaMatakuliah(String namaMatakuliah){
        this.namaMatakuliah = namaMatakuliah;
    }
    
    public String getNamaMatakuliah(){
        return namaMatakuliah;
    }
    
    public void setSks(int sks){
        this.sks = sks;
    }
    
    public int getSks(){
        return sks;
    }
    
    public void setSemester(int semester){
        this.semester = semester;
    }
    
    public int getSemester(){
        return semester;
    }
    
    public void setPengampu(Dosen pengampu){
        this.pengampu = pengampu;
    }
    
    public Dosen getPengampu(){
        return pengampu;
    }
    
    public void showMatakuliah(){
        //
    }
}

