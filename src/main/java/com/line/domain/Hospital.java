package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district; //address에서 추출
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;

    //생성자 (id, address)
    public Hospital(String id, String address) {
        this.id = replaceAllQuot(id);
        this.address = replaceAllQuot(address);
    }

    //테스트용 line1
    String line1 = "\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",\"11\",\"126.88412249700781\",\"37.4803938036867\",\"2022-04-07 14:55:00.0\"";
    String line2 = "B1100027","서울특별시 강남구 봉은사로 612 (삼성동)","E","한방병원","G099","응급의료기관 이외","2","진료과목마다 진료시간 다릅니다. 전화 확인 후 방문해주세요.","","봉은사역 5번 출구 삼성1동주민센터 옆","(의)가산의료재단광동한방병원","02-2222-4888","","1800","1800","1800","1800","1800","1500","","","0900","0900","0900","0900

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s",splitted[0], splitted[1]);
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }


    private String replaceAllQuot(String str) {
        return str.replaceAll("\"","");
    }


    //생성자를 통해서만 초기화 가능
    public Hospital(String id) {
        this.id = id.replaceAll("\"", "");
    }

    // getter
    //id를 뽑아간다(외부에서 접근)
    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        String[] splitted = this.address.split(" ");
        return String.format("%s %s",splitted[0], splitted[1]);
    }

    public String getCategory() {
        return category;
    }

    public Integer getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}