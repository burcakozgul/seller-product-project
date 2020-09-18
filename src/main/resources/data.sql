INSERT INTO SELLER (id, name, city, address, phone_number) VALUES ('1', 'Panora AVM', 'Ankara', 'Oran, Mahallesi Bulvarı, Turan Güneş Blv. No:182, 06550 Çankaya/Ankara', '(0312) 490 42 50')
INSERT INTO SELLER (id, name, city, address, phone_number) VALUES ('2', 'Hilltown', 'İstanbul', 'Aydınevler, Siteler Yolu No:28, 34854 Maltepe/İstanbul', '0850 207 57 67')
INSERT INTO SELLER (id, name, city, address, phone_number) VALUES ('3', 'Forum Bornova', 'İzmir', 'Kazımdirik, 372. Sk. No:75, 35100 Bornova/İzmir', '(0232) 396 00 38')

INSERT INTO PRODUCT (id, name, price) VALUES ('1', 'Telefon', '9000')
INSERT INTO PRODUCT (id, name, price) VALUES ('2', 'Kulaklık', '1800')
INSERT INTO PRODUCT (id, name, price) VALUES ('3', 'Şarj Aleti', '250')

INSERT INTO RELATION (id, seller_id, product_id) VALUES ('1', '1', '2')
INSERT INTO RELATION (id, seller_id, product_id) VALUES ('2', '1', '3')
INSERT INTO RELATION (id, seller_id, product_id) VALUES ('3', '2', '1')
INSERT INTO RELATION (id, seller_id, product_id) VALUES ('4', '3', '2')
INSERT INTO RELATION (id, seller_id, product_id) VALUES ('5', '3', '3')
