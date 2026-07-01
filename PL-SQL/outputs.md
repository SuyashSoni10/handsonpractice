## Excercise 1:

## Original Data from Customers Table
```
CUSTOMERID NAME                     DOB         BALANCE LASTMODI
---------- ------------------------ -------- ---------- --------
         1 Ramesh Gupta            10-03-55      15000 01-07-26
         2 Anita Sharma            22-07-85       8000 01-07-26
         3 Suresh Mehta            05-11-48      25000 01-07-26
         4 Priya Singh             30-01-95      12000 01-07-26
         5 Vikram Nair             15-06-50       5000 01-07-26

```

## Original Data from Loans Table
```
    LOANID CUSTOMERID LOANAMOUNT INTERESTRATE STARTDAT ENDDATE 
---------- ---------- ---------- ------------ -------- --------
       101          1     500000          8.5 01-01-24 16-07-26
       102          2     300000            9 01-03-24 30-08-26
       103          3     750000          7.5 01-06-23 11-07-26
       104          4     200000           10 01-05-24 06-07-26
       105          5     150000            8 01-12-23 26-07-26
```
## After PLSQL operations

```
    LOANID CUSTOMERID LOANAMOUNT INTERESTRATE STARTDAT ENDDATE 
---------- ---------- ---------- ------------ -------- --------
       101          1     500000          8.5 01-01-24 16-07-26
       102          2     300000            9 01-03-24 30-08-26
       103          3     750000          7.5 01-06-23 11-07-26
       104          4     200000           10 01-05-24 06-07-26
       105          5     150000            8 01-12-23 26-07-26
```

## Excercise 