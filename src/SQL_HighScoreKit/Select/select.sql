-- 3월에 태어난 여성 회원 목록 출력하기
-- 三月に生まれた女性会員リスト出力
-- https://school.programmers.co.kr/learn/courses/30/lessons/131120

-- 問題
-- MEMBER_PROFILE 테이블에서 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL 문을 작성해주세요.
-- 이때 전화번호가 NULL 인 경우는 출력대상에서 제외시켜 주시고, 결과는 회원 ID를 기준으로 오름차순 정렬해주세요.

SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE EXTRACT(MONTH FROM DATE_OF_BIRTH) = 3
  AND TLNO IS NOT NULL
  AND GENDER LIKE 'W'
ORDER BY MEMBER_ID ASC;



-- 조건에 부합하는 중고거래 댓글 조회하기
-- 条件に合致する中古取引コメント照会する
-- https://school.programmers.co.kr/learn/courses/30/lessons/164673

-- 問題
-- USED_GOODS_BOARD 와 USED_GOODS_REPLY 테이블에서 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용,
-- 댓글 작성일을 조회하는 SQL 문을 작성해주세요. 결과는 댓글 작성일을 기준으로 오름차순 정렬해주시고,
-- 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬해주세요.

SELECT BO.TITLE, BO.BOARD_ID, RE.REPLY_ID, RE.WRITER_ID, RE.CONTENTS,
       TO_CHAR(RE.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
FROM USED_GOODS_BOARD BO, USED_GOODS_REPLY RE
WHERE BO.BOARD_ID = RE.BOARD_ID
  AND EXTRACT(YEAR FROM BO.CREATED_DATE) = 2022
  AND EXTRACT(MONTH FROM BO.CREATED_DATE) = 10
ORDER BY RE.CREATED_DATE ASC, BO.TITLE ASC;



-- 강원도에 위치한 생산공장 목록 출력하기
-- 韓湾道に位置にある生産工場の目録を出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/131112

-- 問題
-- FOOD_FACTORY 테이블에서 강원도에 위치한 식품공장의 공장 ID, 공장 이름, 주소를 조회하는 SQL 문을 작성해주세요.
-- 이때 결과는 공장 ID를 기준으로 오름차순 정렬해주세요.

SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE SUBSTR(ADDRESS, 1, 3) LIKE '강원도'
ORDER BY FACTORY_ID ASC;



-- 서울에 위치한 식당 목록 출력하기
-- ソウルにある食堂リストを出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/131118

-- 問題
-- REST_INFO 와 REST_REVIEW 테이블에서 서울에 위치한 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를
-- 조회하는 SQL 문을 작성해주세요. 이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 결과는 평균점수를 기준으로
-- 내림차순 정렬해주시고, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.

SELECT INFO.REST_ID, INFO.REST_NAME, INFO.FOOD_TYPE, INFO.FAVORITES, INFO.ADDRESS,
       ROUND(AVG(REVIEW.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO INFO, REST_REVIEW REVIEW
WHERE INFO.REST_ID = REVIEW.REST_ID
  AND INFO.ADDRESS LIKE '서울%'
GROUP BY INFO.REST_ID, INFO.REST_NAME, INFO.FOOD_TYPE, INFO.FAVORITES, INFO.ADDRESS
HAVING AVG(REVIEW.REVIEW_SCORE) > 0
ORDER BY SCORE DESC, FAVORITES DESC;



-- 흉부외과 또는 일반외과 의사 목록 출력하기
-- 胸部外科または一般外科医者リスト出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/132203?language=oracle

-- 問題
-- DOCTOR 테이블에서 진료과가 흉부외과(CS)이거나 일반외과(GS)인 의사의 이름, 의사 ID, 진료과, 고용일자를 조회하는 SQL 문을 작성해주세요.
-- 이때 결과는 고용일자를 기준으로 내림차순 정렬하고, 고용일자가 같다면 이름을 기준으로 오름차순 정렬해주세요.

SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD, 'YYYY-MM-DD') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;



-- 조건에 맞는 도서 리스트 출력하기
-- 条件に合わせる図書のリストを出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/144853?language=oracle

-- 問題
-- BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 도서 ID(BOOK_ID), 출판일 (PUBLISHED_DATE)을
-- 출력하는 SQL 문을 작성해주세요. 결과는 출판일을 기준으로 오름차순 정렬해주세요.

SELECT BOOK_ID, TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD')
FROM BOOK
WHERE EXTRACT(YEAR FROM PUBLISHED_DATE) LIKE '2021'
  AND CATEGORY LIKE '인문'
ORDER BY PUBLISHED_DATE ASC;



-- 평균 일일 대여 요금 구하기
-- 平均の一日の代用預金を求める
-- https://school.programmers.co.kr/learn/courses/30/lessons/151136?language=oracle

-- 問題
-- CAR_RENTAL_COMPANY_CAR 테이블에서 자동차 종류가 'SUV' 인 자동차들의 평균 일일 대여 요금을 출력하는 SQL 문을 작성해주세요.
-- 이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정해주세요.

SELECT ROUND(AVG(DAILY_FEE),0)
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE LIKE 'SUV';



-- 과일로 만든 아이스크림 고르기
-- 果物で作ったアイスクリームを選ぶ
-- https://school.programmers.co.kr/learn/courses/30/lessons/133025

-- 問題
-- 상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인
-- 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.

SELECT HALF.FLAVOR
FROM  FIRST_HALF HALF, ICECREAM_INFO INFO
WHERE HALF.FLAVOR = INFO.FLAVOR
  AND TOTAL_ORDER > 3000
  AND INGREDIENT_TYPE LIKE 'fruit_based'
ORDER BY TOTAL_ORDER DESC;



-- 12세 이하인 여자 환자 목록 출력하기
-- 十二歳以下の女の患者さんのリスト出力
-- https://school.programmers.co.kr/learn/courses/30/lessons/132201?language=oracle

-- 問題
-- PATIENT 테이블에서 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL 문을 작성해주세요.
-- 이때 전화번호가 없는 경우, 'NONE' 으로 출력시켜 주시고 결과는 나이를 기준으로 내림차순 정렬하고,
-- 나이 같다면 환자이름을 기준으로 오름차순 정렬해주세요.

SELECT PT_NAME, PT_NO, GEND_CD, AGE,  NVL(TLNO, 'NONE')
FROM PATIENT
WHERE AGE <= 12
  AND GEND_CD LIKE 'W'
ORDER BY AGE DESC, PT_NAME ASC;



-- 인기있는 아이스크림
-- 人気あるアイスプリム
-- https://school.programmers.co.kr/learn/courses/30/lessons/133024?language=oracle

-- 問題
-- 상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고
-- 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.

SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC;



-- 모든 레코드 조회하기
-- すべてのレコードを紹介する
-- https://school.programmers.co.kr/learn/courses/30/lessons/59034?language=oracle

-- 問題
-- 동물 보호소에 들어온 모든 동물의 정보를 ANIMAL_ID 순으로 조회하는 SQL 문을 작성해주세요.

SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;



-- 재구매가 일어난 상품과 회원 리스트 구하기
-- 再購入が起きる商品と会員リスト出力
-- https://school.programmers.co.kr/learn/courses/30/lessons/131536?language=oracle

-- 問題
-- ONLINE_SALE 테이블에서 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여,
-- 재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL 문을 작성해주세요.
-- 결과는 회원 ID를 기준으로 오름차순 정렬해주시고 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬해주세요.

SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(*) > 1
ORDER BY USER_ID ASC, PRODUCT_ID DESC;