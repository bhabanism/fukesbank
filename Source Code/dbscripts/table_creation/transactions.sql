CREATE TABLE TRANSACTIONS (TRANSACTION_ID INTEGER DEFAULT 0  NOT NULL, SESSION_ID INTEGER DEFAULT 0  NOT NULL, FROM_ACCOUNT_ID INTEGER DEFAULT 0  NOT NULL, TO_ACCOUNT_ID INTEGER DEFAULT 0  NOT NULL, AMOUNT DECIMAL(10, 2) DEFAULT 0  NOT NULL, STATUS VARCHAR(1), PRIMARY KEY (TRANSACTION_ID));
