-- Insert data into brand
INSERT INTO brand (_brand_code, _brand_name, _description)
VALUES
    ('BRD001', 'Nike', 'Leading brand in sports apparel and footwear'),
    ('BRD002', 'Adidas', 'Global brand known for sports shoes and apparel'),
    ('BRD003', 'Puma', 'Popular brand for sports and lifestyle products'),
    ('BRD004', 'Reebok', 'Renowned brand for fitness and running shoes'),
    ('BRD005', 'Under Armour', 'Well-known for sportswear and performance gear');


-- Insert data into catery
INSERT INTO category (_category_code, _category_name, _description)
VALUES
    ('CAT001', 'Running Shoes', 'Shoes designed for running and jogging'),
    ('CAT002', 'Basketball Shoes', 'Shoes designed for playing basketball'),
    ('CAT003', 'Casual Shoes', 'Shoes designed for everyday casual wear'),
    ('CAT004', 'Formal Shoes', 'Shoes designed for formal occasions'),
    ('CAT005', 'Sandals', 'Open-toe footwear for casual wear');


-- Insert data into material
INSERT INTO material (_material_code, _material_name)
VALUES
    ('MAT001', 'Leather'),
    ('MAT002', 'Mesh'),
    ('MAT003', 'Rubber'),
    ('MAT004', 'Synthetic'),
    ('MAT005', 'Canvas');


-- Insert data into sole
INSERT INTO sole (_sole_code, _sole_name)
VALUES
    ('SOLE001', 'Rubber Sole'),
    ('SOLE002', 'EVA Sole'),
    ('SOLE003', 'PU Sole'),
    ('SOLE004', 'TPR Sole'),
    ('SOLE005', 'PVC Sole');


-- Insert data into color
INSERT INTO color (_color_code, _color_name)
VALUES
    ('COL001', 'Red'),
    ('COL002', 'Blue'),
    ('COL003', 'Green'),
    ('COL004', 'Black'),
    ('COL005', 'White');


-- Insert data into size
INSERT INTO sizes (_size_code, _size_name)
VALUES
    ('SIZE001', '34'),
    ('SIZE002', '35'),
    ('SIZE003', '36'),
    ('SIZE004', '37'),
    ('SIZE005', '38'),
    ('SIZE006', '39'),
    ('SIZE007', '40'),
    ('SIZE008', '41'),
    ('SIZE009', '42');

-- Insert data into sale
INSERT INTO sale (_sale_code, _percent, _date_created, _deadline)
VALUES
    ('SALE001', 10, NOW(), DATEADD(day, 30, NOW())),
    ('SALE002', 20, NOW(), DATEADD(day, 30, NOW())),
    ('SALE003', 30, NOW(), DATEADD(day, 30, NOW())),
    ('SALE004', 40, NOW(), DATEADD(day, 30, NOW())),
    ('SALE005', 50, NOW(), DATEADD(day, 30, NOW()));

-- Insert data into product
INSERT INTO product (_product_code, _product_name, _id_brand, _id_category, _id_sole, _id_material, _image, _date_created, _date_updated)
VALUES
    ('PROD001', 'Nike Air Max', 1, 1, 1, 1, 'https://sneakerbardetroit.com/wp-content/uploads/2020/10/Nike-Air-Max-90-Infrared-Release-Date-CT1685-100-1-1068x1068.jpg', NOW(), NOW()),
    ('PROD002', 'Adidas Ultraboost', 2, 1, 2, 2, 'https://www.roadrunningreview.com/Adidas-Ultraboost-22_1920_1_100990.jpg', NOW(), NOW()),
    ('PROD003', 'Puma Suede', 3, 3, 3, 3, 'https://th.bing.com/th/id/OIP.JrH1OKgOghr6ZqkTSr1_IAHaJT?w=1000&h=1256&rs=1&pid=ImgDetMain', NOW(), NOW()),
    ('PROD004', 'Reebok Nano', 4, 2, 4, 4, 'https://th.bing.com/th/id/OIP.k_uDK8_1yBXU-_5j4SyIpAHaJ4?rs=1&pid=ImgDetMain', NOW(), NOW()),
    ('PROD005', 'Under Armour HOVR', 5, 1, 5, 5, 'https://th.bing.com/th/id/OIP.0-ooTZBq8igVHmx9bFZJNwHaHV?rs=1&pid=ImgDetMain', NOW(), NOW());

-- Insert data into product_details
INSERT INTO product_details (_id_product, _id_color, _id_size, _id_sale, _price_old, _price_new, _quantity, _status, _date_created, _date_updated)
VALUES
    (1, 1, 1, 1, 150.00, 135.00, 100, 'Available', NOW(), NOW()),
    (2, 2, 2, 2, 200.00, 160.00, 100, 'Available', NOW(), NOW()),
    (3, 3, 3, 3, 180.00, 126.00, 100, 'Available', NOW(), NOW()),
    (4, 4, 4, 4, 130.00, 78.00, 100, 'Available', NOW(), NOW()),
    (5, 5, 5, 5, 170.00, 85.00, 100, 'Available', NOW(), NOW());

