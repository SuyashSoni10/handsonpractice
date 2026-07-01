BEGIN
    FOR cust_rec IN (SELECT customer_id, age FROM customers) LOOP
        IF cust_rec.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - (interest_rate * 0.01)
            WHERE customer_id = cust_rec.customer_id;
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rates updated for senior customers.');
END;
/