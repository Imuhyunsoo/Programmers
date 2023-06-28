-- 가격이 제일 비싼 식품의 정보 출력하기
-- 値段が最も高い食品の情報を出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/131115

-- 問題
-- FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL 문을 작성해주세요.

SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
FROM FOOD_PRODUCT
WHERE PRICE LIKE (SELECT MAX(PRICE) FROM FOOD_PRODUCT);



-- 가장 비싼 상품 구하기
-- 一番高い商品を求める
-- https://school.programmers.co.kr/learn/courses/30/lessons/131697?language=oracle

-- 問題
-- PRODUCT 테이블에서 판매 중인 상품 중 가장 높은 판매가를 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 MAX_PRICE로 지정해주세요.

SELECT MAX(PRICE) AS MAX_PRICE
FROM PRODUCT;



-- 최댓값 구하기
-- 最大値求める
-- https://school.programmers.co.kr/learn/courses/30/lessons/59415

-- 問題
-- 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.

SELECT MAX(DATETIME) AS DATETIME
FROM ANIMAL_INS;