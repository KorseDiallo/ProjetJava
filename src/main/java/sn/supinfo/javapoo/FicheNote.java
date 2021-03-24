
package sn.supinfo.javapoo;


public class FicheNote {
    private int numero_ficheNote;
    private String date;
    
    public FicheNote(int numero_ficheNote,String date){
        this.numero_ficheNote=numero_ficheNote;
        this.date=date;
    }

    public int getNumero_ficheNote() {
        return numero_ficheNote;
    }

    public String getDate() {
        return date;
    }

    public void setNumero_ficheNote(int numero_ficheNote) {
        this.numero_ficheNote = numero_ficheNote;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FicheNote{" + "numero_ficheNote:" + numero_ficheNote + ", date:" + date + '}';
    }
    
    
}
