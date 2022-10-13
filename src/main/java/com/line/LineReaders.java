package com.line;

import com.line.domain.Patient;

import java.util.ArrayList;
import java.util.List;

public class LineReaders {
    //parsing할 데이터 읽어오기
    public List<Patient> readAndParse(String filename) {
        List<Patient> result = new ArrayList<>();

        return result;
    }

    public static void main(String[] args) {
        LineReaders lr = new LineReaders();
        String filename = "C:\\Users\\dohyu\\git\\seout_hospital_infos.csv";
        List<Patient> patients = lr.readAndParse("");
    }
}

