package com.totalcross.sample.showData.model;

public class Memory {

    private int virt;
    private int res;
    private int shr;

    public int getVirt() {
        return virt;
    }

    public void setVirt(int virt) {
        this.virt = virt;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getShr() {
        return shr;
    }

    public void setShr(int shr) {
        this.shr = shr;
    }

    @Override
    public String toString() {

        return "Virt: " + virt + " Res: " + res + " Shr: " + shr;
    }

}