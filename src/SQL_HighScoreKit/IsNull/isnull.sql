-- 경기도에 위치한 식품창고 목록 출력하기
-- 京畿道に位置した食品倉庫のリスト出力する
-- https://school.programmers.co.kr/learn/courses/30/lessons/131114

-- 問題
-- FOOD_WAREHOUSE 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요.
-- 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.

SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, NVL(FREEZER_YN, 'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '%경기%'
ORDER BY WAREHOUSE_ID ASC;



-- 이름이 없는 동물의 아이디
-- 名前がない動物のID
-- https://school.programmers.co.kr/learn/courses/30/lessons/59039

-- 問題
-- 동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID ASC;



-- 이름이 있는 동물의 아이디
-- 名前がある動物のID
-- https://school.programmers.co.kr/learn/courses/30/lessons/59407?language=oracle

-- 問題
-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID ASC;