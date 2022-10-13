package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;


    //생성자를 통해서만 초기화 가능
    public Hospital(String id) {
        this.id = id.replaceAll("\"", "");
    }
    //id를 뽑아간다(외부에서 접근)
    public String getId() {
        return id;
    }
}
