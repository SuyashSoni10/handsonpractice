## Tables Created:

## Original Data from Customers Table
```
CUSTOMER_ID NAME                  AGE    BALANCE IS_VIP
----------- -------------- ---------- ---------- -----
          1 Ramesh Gupta          65      15000 TRUE
          2 Anita Sharma          45       8000 FALSE
          3 Suresh Mehta          70      25000 TRUE
          4 Priya Singh           30      12000 TRUE

```

## Original Data from Loans Table
```
 LOAN_ID CUSTOMER_ID INTEREST_RATE DUE_DATE
---------- ----------- ------------- --------
       101           1       8.33085 16-07-26
       102           2             9 30-08-26
       103           3       7.35075 11-07-26
       104           4            10 06-07-26
```
## After PLSQL operations
```
 LOAN_ID CUSTOMER_ID INTEREST_RATE DUE_DATE
---------- ----------- ------------- --------
       101           1         8.415 16-07-26
       102           2             9 30-08-26
       103           3         7.425 11-07-26
       104           4            10 06-07-26
```

