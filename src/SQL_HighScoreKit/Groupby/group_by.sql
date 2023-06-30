-- 저자 별 카테고리 별 매출액 집계하기
-- 著者別、カテゴリー別、売上を集合する
-- https://school.programmers.co.kr/learn/courses/30/lessons/144856

--　問題
-- 2022년 1월의 도서 판매 데이터를 기준으로 저자 별, 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여,
-- 저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 매출액(SALES) 리스트를 출력하는 SQL 문을 작성해주세요.
-- 결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.

SELECT B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(S.SALES * B.PRICE) AS TOTAL_SALES
FROM BOOK B, AUTHOR A, BOOK_SALES S
WHERE B.BOOK_ID = S.BOOK_ID
  AND B.AUTHOR_ID = A.AUTHOR_ID
  AND EXTRACT(YEAR FROM S.SALES_DATE) = 2022
  AND EXTRACT(MONTH FROM S.SALES_DATE) = 01
GROUP BY B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY
ORDER BY B.AUTHOR_ID ASC, B.CATEGORY DESC;



-- 성분으로 구분한 아이스크림 총 주문량
-- 成分で区別したアイスの総注文量
-- https://school.programmers.co.kr/learn/courses/30/lessons/133026?language=oracle

-- 問題
-- 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요.
-- 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.

SELECT INFO.INGREDIENT_TYPE, SUM(HALF.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF HALF, ICECREAM_INFO INFO
WHERE HALF.FLAVOR = INFO.FLAVOR
GROUP BY INFO.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;



-- 식품분류별 가장 비싼 식품의 정보 조회하기
-- 食品分類別一番高い食品の情報を照会
-- https://school.programmers.co.kr/learn/courses/30/lessons/131116?language=oracle

-- 問題
-- FOOD_PRODUCT 테이블에서 식품분류별로 가격이 제일 비싼 식품의 분류, 가격, 이름을 조회하는 SQL문을 작성해주세요.
-- 이때 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력시켜 주시고 결과는 식품 가격을 기준으로 내림차순 정렬해주세요.

SELECT MAX.CATEGORY, MAX.MAX_PRICE, FOOD.PRODUCT_NAME
FROM (SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE
      FROM FOOD_PRODUCT
      WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
      GROUP BY CATEGORY) MAX, FOOD_PRODUCT FOOD
WHERE MAX.CATEGORY = FOOD.CATEGORY
  AND MAX.MAX_PRICE = FOOD.PRICE
ORDER BY MAX.MAX_PRICE DESC;



-- 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
-- 自動車の種類別、特定オプションが含まれた自動車の数求める
-- https://school.programmers.co.kr/learn/courses/30/lessons/151137?language=oracle

-- 問題
-- CAR_RENTAL_COMPANY_CAR 테이블에서 '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가
-- 자동차 종류 별로 몇 대인지 출력하는 SQL문을 작성해주세요.
-- 이때 자동차 수에 대한 컬럼명은 CARS로 지정하고, 결과는 자동차 종류를 기준으로 오름차순 정렬해주세요.

SELECT CAR_TYPE, COUNT(*) CARS
FROM CAR_RENTAL_COMPANY_CAR
-- WHERE OPTIONS REGEXP ('통풍시트|열선시트|가죽시트') BEST ANSWER
WHERE OPTIONS LIKE '%통풍시트%'
   OR OPTIONS LIKE '%열선시트%'
   OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE ASC;
