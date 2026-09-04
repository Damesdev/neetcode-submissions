-- Write your query below
SELECT e.left_operand, e.operator, e.right_operand,
CASE
    WHEN operator = '>' AND lv.value > rv.value THEN 'true'
    WHEN operator = '<' AND lv.value < rv.value THEN 'true'
    WHEN operator = '=' AND lv.value = rv.value THEN 'true'
    ELSE 'false'
END AS value
FROM expressions e
LEFT JOIN variables lv ON lv.name = e.left_operand
LEFT JOIN variables rv ON rv.name = e.right_operand;