
package com.cokelek;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class Ege {
    
    private int a = 48;
    private double b =54.98;
    private float c = 54.631F;
    private long d = 867486;
    
    private Date tarih1;
    
    private String email;
    
    private int e;
    private int f;
    private int k;
    private int l ;

    String yazi1 = "";
    String yazi2 = "";
    String yazi3 = "";
    
    
    public void degisenVeri(ValueChangeEvent e){
     
        System.out.println("aa : "+e.getNewValue());
            
    }
    
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public Date getTarih1() {
        return tarih1;
    }

    public void setTarih1(Date tarih1) {
        this.tarih1 = tarih1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public String getYazi1() {
        return yazi1;
    }

    public void setYazi1(String yazi1) {
        this.yazi1 = yazi1;
    }

    public String getYazi2() {
        return yazi2;
    }

    public void setYazi2(String yazi2) {
        this.yazi2 = yazi2;
    }

    public String getYazi3() {
        return yazi3;
    }

    public void setYazi3(String yazi3) {
        this.yazi3 = yazi3;
    }
    
    
    
    
}
