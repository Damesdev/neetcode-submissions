-- Write your query below
SELECT name
FROM sales_person
WHERE sales_id NOT IN (
    SELECT O.sales_id
    FROM orders o
    LEFT JOIN company c ON c.com_id = o.com_id
    WHERE c.name = 'CRIMSON'
);