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

-- 조건에 부합하는 중고거래 댓글 조회하기
-- 条件に合致する中古取引コメント照会する
-- https://school.programmers.co.kr/learn/courses/30/lessons/164673

-- 문제
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