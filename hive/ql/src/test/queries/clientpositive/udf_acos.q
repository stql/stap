DESCRIBE FUNCTION acos;
DESCRIBE FUNCTION EXTENDED acos;

SELECT acos(null)
FROM src LIMIT 1;

SELECT acos(0)
FROM src LIMIT 1;

SELECT acos(-0.5), asin(0.66)
FROM src LIMIT 1;

SELECT acos(2)
FROM src LIMIT 1;
