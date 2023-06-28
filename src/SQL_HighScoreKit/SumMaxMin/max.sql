-- 가격이 제일 비싼 식품의 정보 출력하기
-- 値段が最も高い食品の情報を出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/131115

-- 問題
-- FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL 문을 작성해주세요.

SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
FROM FOOD_PRODUCT
WHERE PRICE LIKE (SELECT MAX(PRICE) FROM FOOD_PRODUCT);