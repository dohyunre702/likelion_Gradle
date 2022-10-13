package com.line.parser;

import com.line.domain.Hospital;

//인터페이스 Parser의 구현체
public class HospitalParser implements Parser<Hospital>{

    private String getSubdivision(String name){
        String[] subdivisions = {"소아과", "피부과", "성형외과", "정형외과", "산부인과", "안과", "가정의학과", "비뇨기과", "치과", "내과", "외과"};

        for (String subdivision : subdivisions){
            if (name.contains(subdivision)) {
                return subdivision;
            }
        }
        return "";

    }


    //string을 받아서 hospital 리턴
    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        // address;
        // district;
        // category;
        // emergencyRoom;
        // name;
        // subdivision;

        //subdivision 파싱해서 넣기
        String name = splitted[10];
        String subdivision = getSubdivision(name);

        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), name,subdivision);
    }



}