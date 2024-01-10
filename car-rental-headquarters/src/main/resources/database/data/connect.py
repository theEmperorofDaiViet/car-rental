import pyodbc
import random

from datetime import date
random.seed(77)
# Kết nối với cơ sở dữ liệu SQL Server
conn = pyodbc.connect('Driver={SQL Server};'
                      'Server=LAPTOP-FC24HOJJ\KHIET;'
                      'Database=Testing;'
                      'UID = sa;'
                      'PW=12345678')

cursor = conn.cursor()
datashop = [
    ('HaNoi', 'HaNoiRentalCar', ' Van Quan - Ha Dong - Ha Noi', str(random.randint(1000000000, 9999999999)), 'HNCRT@gmail.com', 'Something'),
    ('NgheAn', 'NgheAnRentalCar', ' Thanh Pho Vinh - Nghe An', str(random.randint(1000000000, 9999999999)), 'NACRT@gmail.com', 'Something'),
    ('VinhPhuc', 'VinhPhucRentalCar', 'Tam Dao - Vinh Phuc', str(random.randint(1000000000, 9999999999)), 'VPCRT@gmail.com', 'Something'),
    ('BacGiang', 'BacGiangRentalCar', 'Xuong Giang - TP Bac Giang - Bac Giang', str(random.randint(1000000000, 9999999999)), 'BG@gmail.com', 'Something'),
]


for row in datashop:
    sql = "INSERT INTO Shop (facilityname,shopname,address,phone,email,describes) VALUES ('{}', '{}','{}','{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()




dataStaff = [
    ('Nguyen Van A',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVA', '123456',0,1),
    ('Nguyen Van B',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVB', '123456',1,1),
    ('Nguyen Van C',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVC', '123456',0,2),
    ('Nguyen Van D',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVD', '123456',1,2),
    ('Nguyen Van E',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVE', '123456',0,2),
    ('Nguyen Van F',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVF', '123456',1,3),
    ('Nguyen Van G',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVG', '123456',0,3),
    ('Nguyen Van H',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVH', '123456',1,3),
    ('Nguyen Van I',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVI', '123456',0,3),
    ('Nguyen Van K',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVK', '123456',1,2),
    ('Nguyen Van L',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVL', '123456',0,2),
    ('Nguyen Van M',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVM', '123456',1,1),
    ('Nguyen Van N',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVN', '123456',0,1),
    ('Nguyen Van O',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVO', '123456',1,1),
    ('Nguyen Van P',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVP', '123456',0,3),
    ('Nguyen Van Q',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVQ', '123456',1,2),
    ('Nguyen Van S',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVS', '123456',0,2),
    ('Nguyen Van T',str(random.randint(1000000000, 9999999999)), 'Ha Noi', 'NVT', '123456',1,2),
    
]
    
for row in dataStaff:
    sql = "INSERT INTO Staff (name,phone,address,username,password, ismanagement, shopid) VALUES ('{}', '{}','{}','{}','{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()




carname = ['Audi', 'Toyota', 'Mercedez', 'Huyndai','Honda','Suzuki','Isuzu','VinFast']
kind = ['S', 'M', 'L', 'H']
ver = ['v1', 'v2', 'v3', 'v4', 'v5', 'v6', 'v7']


dataCar =[
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    (random.choice(carname),random.choice(kind) ,'30B-'+str(random.randint(100000, 999999)), random.choice(ver), str(random.randint(1000000, 99999999)), random.randint(0,1), 'something', random.randint(1,4)),
    
]

for row in dataCar:
    sql = "INSERT INTO Car (carname, rangevehicle, licenseplate, carlife , expense, status, describes, shopid) VALUES ('{}', '{}','{}','{}','{}','{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()



ClientFisrtname = ['Nguyen', 'Pham', 'Than', 'Tran', 'Ly', 'To', 'Bui']
ClientMidname = ['Van', 'Hoang', 'Phi','Manh','Hong','Tuan','Hai','Thi','Mai']
Clientname = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I']
address = ['Ha Dong', 'Thanh Xuan','Dong Da','Hai Ba Trung',' Cau Giay','Tu Liem']
dataClient = [
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    (random.choice(ClientFisrtname)+random.choice(ClientMidname)+random.choice(Clientname) , str(random.randint(1000000000, 9999999999)), random.choice(address), 'Something'),
    
]

for row in dataClient:
    sql = "INSERT INTO Client (name, phone, address, note) VALUES ('{}', '{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


dataContact = [
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1000000,5000000), random.randint(1,27), random.randint(1,18)),
    
]

for row in dataContact:
    sql = "INSERT INTO Contact ([rentaldate], [deposit], [clientid], [staffid]) VALUES ('{}', '{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


dataBill = [
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,27), random.randint(1,18)),
    
    
    
]

for row in dataBill:
    sql = "INSERT INTO Bill ([payday], [clientid], [staffid]) VALUES ('{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


Conditionname = ['Hong guong', 'Hong kinh', 'Thung xam','Mop, meo xe', 'Hong den','Hong ghe', 'Vo cabin xe']

dataCondition = [
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),
    (random.choice(Conditionname), random.randint(1000,10000)*1000),

]
for row in dataCondition:
    sql = "INSERT INTO Condition ([conditionname],[expense]) VALUES ('{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()



dataAsset = [
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    ('Something......'),
    
]
for row in dataAsset:
    sql = "INSERT INTO Asset (assetname) VALUES ('{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


dataStaffCar = [
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    (date(2023,random.randint(1,12), random.randint(1,28)), 'Something.....', random.randint(1,18), random.randint(1,25)),
    
]
for row in dataStaffCar:
    sql = "INSERT INTO StaffCar ([fixdate], [fixed], [staffid], [carid]) VALUES ('{}','{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


dataShopClient = [
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    (random.randint(1,4), random.randint(1,27)),
    
]
for row in dataShopClient:
    sql = "INSERT INTO ShopClient ([shopid], [clientid]) VALUES ('{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


dataCarContact = [
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    (date(2023, random.randint(1,12), random.randint(1,28)), random.randint(1,34),  random.randint(1,25)),
    
]

for row in dataCarContact:
    sql = "INSERT INTO CarContact ([returndate], [contactid], [carid]) VALUES ('{}','{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()


dataCarCondition =[
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),
    (random.randint(1,25),random.randint(1,22) ),

    
]

for row in dataCarCondition:
    sql = "INSERT INTO CarCondition ([carid], [conditionid]) VALUES ('{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()



dataCarBill = [
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    (random.randint(1000,10000)*1000, random.randint(1000,10000)*1000, random.randint(1,28),  random.randint(1,25) ),
    
]
for row in dataCarBill:
    sql = "INSERT INTO CarBill ([damages], [rentalfee], [billid], [carid]) VALUES ('{}','{}','{}', '{}')".format(*row)
    cursor.execute(sql)
    conn.commit()



dataContactAsset =[
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    (random.randint(1,19), random.randint(1,23)),
    
]

for row in dataContactAsset:
    sql = "INSERT INTO ContactAsset ([carcontactid], [assetid]) VALUES ('{}','{}')".format(*row)
    cursor.execute(sql)
    conn.commit()
    
    
    
    
conn.close() #dòng này để chạy chung 