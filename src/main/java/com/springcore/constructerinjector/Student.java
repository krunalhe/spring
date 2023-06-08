package com.springcore.constructerinjector;

import java.security.cert.Certificate;
import java.util.List;

public class Student {
    private String stdname;
    private int rollno;
    private String college;

    private Certi cer;

    private List<String> list;

    public Student(String stdname, int rollno, String college , Certi cer ,List<String > list){

        this.stdname=stdname;
        this.rollno=rollno;
        this.college=college;
        this.cer=cer;
        this.list=list;

    }

    @Override
    public String toString() {
        return this.stdname+": "+this.rollno+": "+this.college+"{"+this.cer.name+"}"+this.list;
    }
}
