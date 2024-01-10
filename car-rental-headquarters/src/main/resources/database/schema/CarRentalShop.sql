USE CarRental;

CREATE TABLE Shop(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[facilityname] VARCHAR(100) NOT NULL,
	[shopname] VARCHAR(100) NOT NULL,
	[address] VARCHAR(150) NOT NULL,
	[phone] VARCHAR(20) NOT NULL,
	[email] VARCHAR(100) NOT NULL,
	[describes] VARCHAR(255),
);

CREATE TABLE Staff(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[name] VARCHAR(100) NOT NULL,
	[phone] VARCHAR(20) NOT NULL,
	[address] VARCHAR(150) NOT NULL,
	[username] VARCHAR(50) NOT NULL,
	[password] VARCHAR(50) NOT NULL,
	[ismanagement] BIT NOT NULL,
	[shopid] int FOREIGN KEY REFERENCES Shop(id)
);

CREATE TABLE Car(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[carname] VARCHAR(100) NOT NULL,
	[rangevehicle] VARCHAR(100) NOT NULL,
	[licenseplate] VARCHAR(50) NOT NULL,
	[carlife] VARCHAR(100) NOT NULL,
	[expense] int NOT NULL,
	[status] BIT NOT NULL,
	[describes] VARCHAR(255),
	[shopid] int FOREIGN KEY REFERENCES Shop(id)
);

CREATE TABLE Client(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[name] VARCHAR(100) NOT NULL,
	[phone] VARCHAR(20) NOT NULL,
	[address] VARCHAR(150) NOT NULL,
	[note] VARCHAR(255),
);

CREATE TABLE Contact(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[rentaldate] DATE NOT NULL,
	[deposit] int NOT NULL,
	[clientid] int FOREIGN KEY REFERENCES Client(id),
	[staffid] int FOREIGN KEY REFERENCES Staff(id)
);

CREATE TABLE Bill(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[payday] DATE NOT NULL,
	[clientid] int FOREIGN KEY REFERENCES Client(id),
	[staffid] int FOREIGN KEY REFERENCES Staff(id)
);

CREATE TABLE Condition(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[conditionname] VARCHAR(255) NOT NULL,
	[expense] int NOT NULL
);

CREATE TABLE Asset(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[assetname] VARCHAR(255) NOT NULL,
);

CREATE TABLE StaffCar(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[fixdate] DATE NOT NULL,
	[fixed] VARCHAR(255) NOT NULL,
	[staffid] int FOREIGN KEY REFERENCES Staff(id),
	[carid] int FOREIGN KEY REFERENCES Car(id),
);

CREATE TABLE ShopClient(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[shopid] int FOREIGN KEY REFERENCES Shop(id),
	[clientid] int FOREIGN KEY REFERENCES Client(id)
);

CREATE TABLE CarContact(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[returndate] DATE NOT NULL,
	[contactid] int FOREIGN KEY REFERENCES Contact(id),
	[carid] int FOREIGN KEY REFERENCES Car(id)
);

CREATE TABLE CarCondition(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[carid] int FOREIGN KEY REFERENCES Car(id),
	[conditionid] int FOREIGN KEY REFERENCES Condition(id)
);

CREATE TABLE CarBill(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[damages] INT NOT NULL,
	[rentalfee] INT NOT NULL,
	[billid] int FOREIGN KEY REFERENCES Bill(id),
	[carid] int FOREIGN KEY REFERENCES Car(id)
);

CREATE TABLE ContactAsset(
	[id] INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[carcontactid] int FOREIGN KEY REFERENCES CarContact(id),
	[assetid] int FOREIGN KEY REFERENCES Asset(id)
);