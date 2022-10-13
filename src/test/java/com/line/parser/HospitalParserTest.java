package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class HospitalParserTest {
    //line 수정필요
    private String line1 = "\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",\"11\",\"126.88412249700781\",\"37.4803938036867\",\"2022-04-07 14:55:00.0\"";
    Private String line2 = "\"B1100027\",\"서울특별시 강남구 봉은사로 612 (삼성동)\",\"E\",\"한방병원\",\"G099\",\"응급의료기관 이외\",\"2\",\"진료과목마다 진료시간 다릅니다. 전화 확인 후 방문해주세요.\","\"","\"봉은사역 5번 출구 삼성1동주민센터 옆"\"","\"(의)가산의료재단광동한방병원"\"","\"02-2222-4888"\"","\"","\"1800"\"","\"1800"\"","\"1800"\"","\"1800"\"","\"1800"\"","\"1500"\"","\"","\"","\"0900"\"","\"0900"\"","\"0900"\"","\"0900"\"";

    //test 코드 추상화
    private void assertHospital(Hospital hospital, String eId, String eAddress, String eDistrict, String eCategory, String eEmergencyRoom, String eName, String eSubdivision) {
        String address = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        Assertions.assertEquals(eId, hospital.getId());

        //주소가 잘 파싱되는지 테스트 추가
        Assertions.assertEquals(eAddress, hospital.getAddress());

        //District
        Assertions.assertEquals(eDistrict, hospital.getDistrict());

        //Category
        Assertions.assertEquals(eCategory, hospital.getCategory());

        //Emergency Room
        Assertions.assertEquals(eEmergencyRoom, hospital.getEmergencyRoom());

        //Name
        Assertions.assertEquals(eName, hospital.getName());

        // Subdivision
        Assertions.assertEquals(eSubdivision, hospital.getSubdivision());
    }

    //annotation. line for test
    // alt + insert > create test method
    @Test
    @DisplayName("parsing doing well")
    void parse() {
        HospitalParser hospitalParser = new HospitalParser();
        // ctrl + tab
        Hospital hospital =  hospitalParser.parse(this.line1);
        String address = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        assertHospital(hospitalParser.parse(this.line2),
                "A1117873", "서울특별시 강남구 봉은사로 612 (삼성동)", "E", "한방병원", 2, "(의)가산의료재단광동한방병원","");
     }
}

