package com.line.parser;

import com.line.domain.Hospital;

//인터페이스 Parser의 구현체
public class HospitalParser implements Parser<Hospital>{

    //string을 받아서 hospital 리턴
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0]);
    }
}