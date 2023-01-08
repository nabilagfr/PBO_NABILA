/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila.dao;

import java.util.List;
import nabila.model.Mahasiswa;

/**
 *
 * @author 
 */
public interface MahasiswaDao {
    Mahasiswa save (Mahasiswa mahasiswa);
    Mahasiswa update (int index,Mahasiswa mahasiswa);
    boolean delete (Mahasiswa mahasiswa);
    Mahasiswa getMahasiswa (int index);
    List <Mahasiswa> getAllMahasiswa ();
}
