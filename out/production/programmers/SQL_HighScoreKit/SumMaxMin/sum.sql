-- 동물 수 구하기
-- 動物の数を求める
-- https://school.programmers.co.kr/learn/courses/30/lessons/59406?language=oracle

-- 問題
-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문을 작성해주세요.

SELECT COUNT(*) AS COUNT
FROM ANIMAL_INS;



-- 중복 제거하기
-- 重複を削除する
-- https://school.programmers.co.kr/learn/courses/30/lessons/59408?language=oracle

-- 問題
-- 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문을 작성해주세요.
-- 이때 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.

SELECT COUNT(NAME) AS NAME
FROM (SELECT DISTINCT NAME
      FROM ANIMAL_INS
      WHERE NAME IS NOT NULL);

-- いい答え

SELECT COUNT(DISTINCT NAME)
FROM ANIMAL_INS;