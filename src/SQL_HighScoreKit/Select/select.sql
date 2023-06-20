-- 3월에 태어난 여성 회원 목록 출력하기
-- 三月に生まれた女性会員リスト出力
-- https://school.programmers.co.kr/learn/courses/30/lessons/131120

-- MEMBER_PROFILE 테이블에서 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL 문을 작성해주세요.
-- 이때 전화번호가 NULL 인 경우는 출력대상에서 제외시켜 주시고, 결과는 회원 ID를 기준으로 오름차순 정렬해주세요.

SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE EXTRACT(MONTH FROM DATE_OF_BIRTH) = 3
  AND TLNO IS NOT NULL
  AND GENDER LIKE 'W'
ORDER BY MEMBER_ID ASC;