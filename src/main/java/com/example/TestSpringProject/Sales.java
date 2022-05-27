package com.example.TestSpringProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sales {//jpa
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idsales;
    private int sum;
    private String datain;
    private String datasell;
    private int identif;

    public Sales() {
    }

    public Sales(int sum, String datain, String datasell, int identif) {
        this.sum = sum;
        this.datain = datain;
        this.datasell = datasell;
        this.identif = identif;
    }

    @Override
    public String toString() {
        return String.format(
                "Sales[id=%d, sum=%d, datain='%s', datasell='%s', identif='%s']",
                idsales, sum, datain, datasell, identif);
    }

    public int getId() {
        return idsales;
    }

    public int getSum() {
        return sum;
    }

    public String getDatain() {
        return datain;
    }

    public String getDatasell() {
        return datasell;
    }

    public int getIdentif() {
        return identif;
    }
}
