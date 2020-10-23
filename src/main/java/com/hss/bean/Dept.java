package com.hss.bean;

public class Dept {

    private Long id;

    private String deptName;

    public Dept() {
    }

    public Dept(Long id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
