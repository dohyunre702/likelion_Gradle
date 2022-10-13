package com.line.parser;
// parser에 다형성 적용해서 인터페이스 만들기
// T를 뚫어서 T 받고 반환 (어떤 파일인지에 따라 object명 달라짐)
// 파일 내용이 String인 것은 변하지 않음

// 제네릭 사용. T를 받아서 PARSE 함수를 만든다
public interface Parser <T>{
    T parse(String str);
}
