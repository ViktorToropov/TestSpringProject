package com.example.TestSpringProject;

public class SalesJdbc {
    private int idsales;
    private int sum;
    private String datain;
    private String datasell;
    private String identif;

    public SalesJdbc() {
    }

    public SalesJdbc(int idsales, int sum, String datain, String datasell, String identif) {
        this.idsales = idsales;
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

    public int getIdsales() {
        return idsales;
    }

    public void setIdsales(int idsales) {
        this.idsales = idsales;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getDatain() {
        return datain;
    }

    public void setDatain(String datain) {
        this.datain = datain;
    }

    public String getDatasell() {
        return datasell;
    }

    public void setDatasell(String datasell) {
        this.datasell = datasell;
    }

    public String getIdentif() {
        return identif;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
    }
}
