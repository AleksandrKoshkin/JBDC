select product_name
from test.orders
         inner join test.customers
                    on test.orders.customer_id = test.customers.id
where lower(test.customers.name) = lower(:name);