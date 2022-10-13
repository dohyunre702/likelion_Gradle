package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReaders = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\dohyu\\git\\seout_hospital_infos.csv";
        List<Hospital> hospitals = hospitalLineReaders.readLines(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }
    }
}