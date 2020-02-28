use pizzadb;

1.CREATE TABLE fooditems (
    id INT AUTO_INCREMENT,
    name VARCHAR(40),
    description VARCHAR(100),
    img_src VARCHAR(300),
    itemtype VARCHAR(40),
    category VARCHAR(40),
    price DOUBLE,
    PRIMARY KEY (id)
);

insert into fooditems (name,description,img_src,itemtype,category,price) values ('Chicken Turbinator',
'Chicken Tikka, Grilled Onions, Grilled Tomatoes','../../assets/img/chicken_dominator.jpg','Pizza'
,'non-veg',299.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('Chicken Fiery',
'Smoked Chicken, Onions, Tomatoes, Green Capsicum','../../assets/img/chicken_fiesta.jpg','Pizza'
,'non-veg',380.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('Spicy Paneer',
'Bhuna Paneer,Green Capsicum, Red Paprika, Grilled Tomatoes','../../assets/img/peppy_paneer.jpg','Pizza'
,'veg',300.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('Veg Extravaganza',
'Green Capsicum, Paprika, Grilled Tomatoes, Olives, Mushrooms','../../assets/img/veg_extravaganza.jpg','Pizza'
,'veg',299.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('IndiePaneerTandoori',
'Green Capsicum, Paprika, Grilled Tomatoes, Olives, Mushrooms','../../assets/img/IndianTandooriPaneer.jpg','Pizza'
,'veg',290.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('IndieChickenTandoori',
'Tandoori masala with Chicken tikka, onion, red paprika','../../assets/img/IndianTandooriChickenTikka.jpg','Pizza'
,'non-veg',320.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('Pepsi (500ml)',
'Sparkling and Refreshing Beverage','../../assets/img/pepsi.png','Beverages'
,'veg',60.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('Lipton Ice Tea (250ml)',
'Naturally Refreshing, Zero Calories','../../assets/img/tea.jpg','Beverages'
,'veg',50.00);
insert into fooditems (name,description,img_src,itemtype,category,price) values ('Bailley Premium Water (500ml)',
'Cool and Refreshing','../../assets/img/water.png','Beverages'
,'veg',20.00);

select * from fooditems;


2. CREATE TABLE order_fooditems (
    id INT AUTO_INCREMENT,
    orderid INT,
    PRIMARY KEY (id),
    itemid INT REFERENCES fooditems (id)
);
    
select * from order_items;

3.CREATE TABLE order_user (
    orderid INT REFERENCES order_fooditems(id) ,
	username VARCHAR(40),
    useraddress VARCHAR(40),
    useremail VARCHAR(40),
    orderdatetime Datetime,
    order_received boolean,
    order_accepted boolean,
    order_outfordelivery boolean,
     PRIMARY KEY (orderid)
     );

ALTER TABLE order_user
Add order_delivered boolean,
Add orderdelivereddatetime Datetime;

 -- update order_user set order_received = true where orderid = 7519;

select * from order_user;