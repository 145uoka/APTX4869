/*
 [df:title]
  指定した期間の収支の項目ごとの金額の合計を抽出するSQL

 [df:description]
  指定した期間の収支の項目ごとの金額の合計を抽出するSQL

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

SELECT
  genre.genre_name
  , sum(money.amount)
FROM
  aptx4869.money_reception money
  INNER JOIN aptx4869.genre genre
    ON money.genre_id = genre.genre_id
WHERE
  money.user_id = /*pmb.userId*/1
  AND money.money_reception_flag = /*pmb.moneyReceptionFlag*/false
  AND money.money_reception_date >= /*pmb.moneyReceptionFromDate*/'2018-05-1'
  AND money.money_reception_date <= /*pmb.moneyReceptionToDate*/'2018-05-31'
GROUP BY
  genre.genre_id
 ORDER BY sum(money.amount)DESC

