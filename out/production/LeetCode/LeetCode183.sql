SELECT Customers.Name As Customers
FROM Customers
WHERE customers.Id NOT IN (
    SELECT DISTINCT Orders.CustomerId FROM Orders
);