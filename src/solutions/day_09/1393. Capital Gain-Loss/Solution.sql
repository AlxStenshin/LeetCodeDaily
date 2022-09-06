/*
 1393. Capital Gain/Loss

 Table: Stocks
 +---------------+---------+
 | Column Name   | Type    |
 +---------------+---------+
 | stock_name    | varchar |
 | operation     | enum    |
 | operation_day | int     |
 | price         | int     |
 +---------------+---------+
 (stock_name, operation_day) is the primary key for this table.
 The operation column is an ENUM of type ('Sell', 'Buy')

 Each row of this table indicates that the stock which has stock_name had an operation on the day operation_day with the price.
 It is guaranteed that each 'Sell' operation for a stock has a corresponding 'Buy' operation in a previous day.
 It is also guaranteed that each 'Buy' operation for a stock has a corresponding 'Sell' operation in an upcoming day.

 Write an SQL query to report the Capital gain/loss for each stock.

 The Capital gain/loss of a stock is the total gain or loss after buying and selling the stock one or many times.

 Return the result table in any order.

 */

select stock_name,
       sum(case operation when 'BUY' then -price when 'SELL' then price end) as capital_gain_loss
from Stocks
group by stock_name


select buy.stock_name, (sell.sell_sum - buy.buy_sum) as capital_gain_loss
from
    (select stock_name, sum(price) as buy_sum
     from stocks
     where operation = 'Buy'
     group by stock_name) as buy,

    (select stock_name, sum(price) as sell_sum
     from stocks
     where operation = 'Sell'
     group by stock_name) as sell
where buy.stock_name = sell.stock_name