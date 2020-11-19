package com.example.java;

public class JavaStudy02 {

    static int scopeAge = 100;

    public static void main(String[] args) {

        /**
         백기선 선생님의 자바 스터디 2주차

         1) 프리미티브 타입 종류와 값의 범위 그리고 기본 값
         2) 프리미티브 타입과 레퍼런스 타입
         3) 리터럴
         4) 변수 선언 및 초기화하는 방법
         5) 변수의 스코프와 라이프타임
         6) 타입 변환, 캐스팅 그리고 타입 프로모션
         7) 1차 및 2차 배열 선언하기
         8) 타입 추론, var
         */


        RefTest ref = new RefTest();
        RefTest ref2 = ref;

        System.out.println(ref);
        System.out.println(ref2);

        System.out.println("====================");
        System.out.println(ref.getStr1());
        System.out.println(ref2.getStr1());
        System.out.println("====================");

        ref2.setStr1("chagne_str1");
        System.out.println(ref.getStr1());
        System.out.println(ref2.getStr1());


        int age;        // int 타입의 age 변수 선언
        double money;   // double 타입의 money 변수 선언

        int a, b, c;    // 같은 타입의 여러개 동시 선언

        // 초기화 방법도 간단하다 대입 연산자 = 를 사용해서 값을 명시하면 끝. 변수에 초기값을 주는 걸 변수의 초기화라고 뜻한다.
        age = 10;

        int test = 0;

        /**
            자바 변수 명명 규칙이 존재
            1. 첫번째 글자는 문자이거나 '$', '_' 만 가능하고 숫자로 시작할 순 없다.
            2. 영어 대소문자가 구분된다. 대소문자가 다르면 다른 변수이다 (strName 과 strname 은 다른 변수이다)
            3. 카멜케이스라는 번역하면 낙타법으로 첫문자는 영어소문자이면서 다른 단어가 붙을 경우 대문자로 표기한다 firstName, maxSpeed 등등
            4. 변수의 길이 제한은 없다. (변수의 명이 너무 길어지는 경우도 흔하다. 보통 용어사전으로 약어를 정하고 약어를 이어붙인다. firstName -> firNm 혹은 middleName -> midNm)
            5. 예악어로 사용할 수 없다. (변수명에 boolean, byte, private 같은걸 사용 못한다)
         */

        int scopeAge = 30;
        System.out.println(scopeAge);

        fnScope();

        System.out.println(scopeAge);
    }

    public static void fnScope () {
        int scopeAge = 20;
        System.out.println(scopeAge);
    }
}

class RefTest {
    private String str1 = "";
    private String str2 = "";

    public RefTest() {
        this.str1 = "111";
        this.str2 = "222";
    }

    public void setStr1 (String str) {
        this.str1 = str;
    }

    public void setStr2 (String str) {
        this.str2 = str;
    }

    public String getStr1 () {
        return this.str1;
    }

    public String getStr2 () {
        return this.str2;
    }
}

class week02 {
    static int globalAge = 30;

    public static void main(String[] args) {
        int globalAge = 20;
        System.out.println(globalAge);          // 20 출력

        // 지역변수가 아닌 전역변수를 언급하려면?
        System.out.println(week02.globalAge);   // 30 출력
    }

    public static void fnScope () {
        int scopeAge = 20;                  // 지역 변수, fnScope 내에서만 사용가능하다.

        System.out.println(scopeAge);
        System.out.println(globalAge);      // 전역 변수, week02 내에서는 어디든지 접근이 가능
    }
}