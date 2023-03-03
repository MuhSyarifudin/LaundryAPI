package com.juaracoding.DBLaundry.model;
/*Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 01/03/2023 22:27
@Last Modified 01/03/2023 22:27
Version 1.1
*/

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "MstPengeluaran")
public class Pengeluaran {

    @Id
    @Column(name = "IDPengeluaran",unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPengeluaran;

    @Column(name = "NamaPengeluaran")
    private String namaPengeluaran;

    @Column(name = "Biaya")
    private String biaya;

    @Column(name = "CreatedAt")
    private Date createdAt = new Date();

    @Column(name = "UpdatedAt")
    private LocalDate updatedAt;

    public Long getIdPengeluaran() {
        return idPengeluaran;
    }

    public void setIdPengeluaran(Long idPengeluaran) {
        this.idPengeluaran = idPengeluaran;
    }

    public String getNamaPengeluaran() {
        return namaPengeluaran;
    }

    public void setNamaPengeluaran(String namaPengeluaran) {
        this.namaPengeluaran = namaPengeluaran;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}