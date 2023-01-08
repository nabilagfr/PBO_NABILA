/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila.dao;
import nabila.model.Anggota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AnggotaDaoImpl implements AnggotaDao {
        List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl() {
        data.add(new Anggota("2101092011", "Nabila","Padang"));
        data.add(new Anggota("2101092024", "Putri","Solok"));
        data.add(new Anggota("2101092015", "Tisa","Agam"));
    }
    
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public Anggota update(int index, Anggota anggota){
        data.set(index, anggota);
        return anggota;
    }
    
    public Anggota delete(int index){
        return data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List <Anggota> getAllAnggota(){
        return data;
    }
}
