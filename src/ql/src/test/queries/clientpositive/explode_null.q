SELECT explode(col) AS myCol FROM 
    (SELECT array(1,2,3) AS col FROM src LIMIT 1 
     UNION ALL
     SELECT IF(false, array(1,2,3), NULL) AS col FROM src LIMIT 1) a;
     