package com.example.immunization.com.example.immunization.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="immunization")
public class Model
{
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String series;
    @Column
    private String immunization;
    @Column
    private Date date;
    @Column
    private String status;

    public Model() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getImmunization() {
        return immunization;
    }

    public void setImmunization(String immunization) {
        this.immunization = immunization;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", immunization='" + immunization + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
