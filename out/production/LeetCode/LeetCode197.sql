SELECT w2.ID AS ID
FROM Weather w1,Weather w2
WHERE datediff(w2.RecordDate,w1.RecordDate)=1 AND W2.Temperature>w1.Temperature;