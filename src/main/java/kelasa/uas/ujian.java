/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasa.uas;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "ujian")
@NamedQueries({
    @NamedQuery(name = "ujian.findAll", query = "SELECT a FROM ujian a"),
    @NamedQuery(name = "ujian.findById", query = "SELECT a FROM ujian a WHERE a.id = :ID"),
    @NamedQuery(name = "ujian.findByName", query = "SELECT a FROM ujian a WHERE a.no_surat = :NO_SURAT"),
    @NamedQuery(name = "ujian.findByTglLahir", query = "SELECT a FROM ujian a WHERE a.judul = :JUDUL")})
public class ujian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer ID;
    @Column(name = "NO_SURAT")
    private Integer NO_SURAT;
    @Column(name = "JUDUL")
    private String JUDUL;
    @Column(name = "TEMBUSAN")
    private String TEMBUSAN;
    @Lob
    @Column(name = "FILE")
    private byte[] photo;

    public ujian() {
    }

    public ujian(Integer id) {
        this.ID = id;
    }

    public Integer getId() {
        return ID;
    }

    public void setId(Integer id) {
        this.ID = id;
    }

    public Integer getNo_Surat() {
        return NO_SURAT;
    }

    public void setNo_Surat(Integer no_surat) {
        this.NO_SURAT = NO_SURAT;
    }

    public String getJUDUL() {
        return JUDUL;
    }

    public void setJUDUL (String JUDUL){
        this.JUDUL = JUDUL;
    }
    
     public String getTEMBUSAN (){
        return TEMBUSAN;
    }
     
     public void setTEMBUSAN (String TEMBUSAN){
        this.TEMBUSAN = TEMBUSAN;
    }

    public byte[] getFILE() {
        return photo;
    }

    public void setFILE(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ID != null ? ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ujian)) {
            return false;
        }
        ujian other = (ujian) object;
        if ((this.ID == null && other.ID != null) || (this.ID != null && !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.database.ws.a.A2020[ id=" + ID + " ]";
    }
    
}
/**
 *
 * @author ASUS
 */

