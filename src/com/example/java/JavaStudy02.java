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

        // 기본형(원시형)의 종류는 정수, 실수, 논리, 문자로 나눠진다
        // 정수
        byte b = 1;     // 초기값 0
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128

        short s = 1;    // 초기값 0
        int i = 1;      // 초기값 0
        long l = 0L;    // 초기값 0L

        // 실수
        float f = 0f;   // 초기값 0f
        double d = 0d;  // 초기값 0d

        // 논리
        boolean is = false; // 초기값 false

        // 문자
        char c = 'A'; // 초기값 '\u0000'


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

        int x, y, z;    // 같은 타입의 여러개 동시 선언

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

        // 클래스 변수 접근
        String url = CmmnConstant.API_CALL_URL;
        String callNum = CmmnConstant.SEOUL_LOCAL_NUMBER;

        System.out.println(url);
        System.out.println(callNum);

        // 타입 변환
        fnCast();

        // 강제 변환
        fnExpCast();
    }

    public static void fnScope () {
        int scopeAge = 20;
        System.out.println(scopeAge);
    }

    // 자동 변환 예
    public static void fnCast() {
        byte byteVal = 10;
        int intVal = byteVal;   // byte -> int
        System.out.println(intVal);

        char charVal = '가';
        intVal = charVal;       // char -> int
        System.out.println(intVal);

        intVal = 100;
        long longVal = intVal;  // int -> long
        System.out.println(intVal);

        intVal = 200;
        double douVal = intVal; // int -> double
        System.out.println(intVal);
    }

    public static void fnExpCast() {
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 100;
        long longVal = 1000000L;

        byteVal = (byte) shortVal;
        shortVal = (short) intVal;
        intVal = (int) longVal;

        System.out.println("byte : " + byteVal);    // 20
        System.out.println("short : " + shortVal);  // 100
        System.out.println("int : " + intVal);      // 1000000

        // 넘치는 값으로 강제 변환하면?
        shortVal = 32767;
        intVal = 2100000000;
        longVal = 2200000000L;

        byteVal = (byte) shortVal;
        shortVal = (short) intVal;
        intVal = (int) longVal;

        System.out.println("byte : " + byteVal);    // -1
        System.out.println("short : " + shortVal);  // 29952
        System.out.println("int : " + intVal);      // -2094967296

        fnArray();
    }

    public static void fnArray() {
        // 수학 평균 점수를 구해보자
        int sum = 0;

        int score01 = 80;   // 1번 학생
        int score02 = 80;   // 2번 학생
        int score03 = 80;   // 3번 학생
        int score04 = 80;
        int score05 = 80;
        // ....
        int score26 = 80;
        int score27 = 80;
        int score28 = 80;
        int score29 = 80;   // 29번 학생
        int score30 = 80;   // 30번 학생

        sum += score01;
        sum += score02;
        sum += score03;
        // ...
        sum += score29;
        sum += score30;

        int avg = sum / 30;

        // int[] scoreArr = {80, 80, 70, 75, 90, ... , 60, 100};
        int[] arr;
        int arr02[];
        arr = new int[]{100, 90, 80, 70, 60};
        System.out.println();

        // 2차 배열
        int[][] doubleArr = new int[3][30];

        // 3차 배열
        int[][][] triArr = new int[3][5][10];

        int[][][] scoreArr = {
                {
                        {100, 90, 80, 70, 80}
                        , {90, 80, 70, 60, 10}
                        , {90, 80, 70, 60, 10}
                }, {
                {100, 90, 80, 70, 80}
                , {90, 80, 70, 60, 10}
                , {90, 80, 70, 60, 10}
                }, {
                        {100, 90, 80, 70, 80}
                        , {90, 80, 70, 60, 10}
                        , {90, 80, 70, 60, 10}
                }
        };

        System.out.println(scoreArr[0][0][0]);
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