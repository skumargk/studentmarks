package com.tuition.student.marks;

public class MarksAll {
    private long SlNo;
    private String name;
    private int totmarks;

    //Constructor
    public MarksAll(long slNo, String name, int totmarks) {
        super();
        SlNo = slNo;
        this.name = name;
        this.totmarks = totmarks;
    }

    //Getter
    public long getSlNo() {
        return SlNo;
    }

    public String getName() {
        return name;
    }

    public int getTotmarks() {
        return totmarks;
    }

    //ToString

    @Override
    public String toString() {
        return "MarksAll{" +
                "SlNo=" + SlNo +
                ", name='" + name + '\'' +
                ", totmarks=" + totmarks +
                '}';
    }
}
