CREATE TABLE public.account_data
(
    account_id serial NOT NULL,
    account_type character varying(2) NOT NULL,
    balance numeric NOT NULL,
    branch_id integer NOT NULL,
    customer_id integer NOT NULL,
    ifsc_code character varying NOT NULL,
    PRIMARY KEY (account_id)
);

ALTER TABLE public.account_data
    OWNER to postgres;