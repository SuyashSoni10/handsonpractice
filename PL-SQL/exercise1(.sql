CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,
    name          VARCHAR2(30),
    age           NUMBER,
    balance       NUMBER,
    is_vip        VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE loans (
    loan_id          NUMBER PRIMARY KEY,
    customer_id      NUMBER REFERENCES customers(customer_id),
    interest_rate    NUMBER,
    due_date         DATE
);

INSERT INTO customers VALUES (1, 'Ramesh Gupta', 65, 15000, 'FALSE');
INSERT INTO customers VALUES (2, 'Anita Sharma', 45, 8000, 'FALSE');
INSERT INTO customers VALUES (3, 'Suresh Mehta', 70, 25000, 'FALSE');
INSERT INTO customers VALUES (4, 'Priya Singh', 30, 12000, 'FALSE');

INSERT INTO loans VALUES (101, 1, 8.5, SYSDATE + 15);
INSERT INTO loans VALUES (102, 2, 9.0, SYSDATE + 60);
INSERT INTO loans VALUES (103, 3, 7.5, SYSDATE + 10);
INSERT INTO loans VALUES (104, 4, 10.0, SYSDATE + 5);

COMMIT;