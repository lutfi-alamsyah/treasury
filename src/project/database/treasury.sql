CREATE DATABASE treasury
GO
USE treasury
GO

----------------------------------
-- 1. Creating Schema and table --
----------------------------------

CREATE TABLE person
(
    [id] INT NOT NULL IDENTITY(1,1), -- Primary Key column
    [name] VARCHAR(50) NOT NULL,
    [alamat] VARCHAR(255) NULL,
    [phone_number] INT NULL,
    [catatan] VARCHAR(max) NULL,
    -- Specify more columns here
);
GO

CREATE TABLE debt
(
    [id] INT NOT NULL IDENTITY(1,1), -- Primary Key column
    [person_id] INT NOT NULL, -- Foreign Key column
    [jumlah_pinjaman] INT NOT NULL,
    [status] VARCHAR(50) NOT NULL,
    -- Specify more columns here
);
GO

CREATE TABLE treasury_set
(
    [id] INT NOT NULL IDENTITY(1,1), -- Primary Key column
    [name] VARCHAR(50) NOT NULL,
    [treasury_total] INT NOT NULL,
    -- Specify more columns here
);
GO

CREATE TABLE treasury
(
    [id] INT NOT NULL IDENTITY(1,1), -- Primary Key column
    [person_id] INT NOT NULL, -- Foreign Key column
    [treasury_set_id] INT NOT NULL, -- Foreign Key column
    [total_bayar] INT NOT NULL,
    [kekurangan] INT NOT NULL,
    [status] VARCHAR(50) NOT NULL,
    [created_at] DATETIME,
    [updated_at] DATETIME
    -- Specify more columns here
);
GO

------------------------
-- 2. Add primary key --
------------------------

ALTER TABLE person
add CONSTRAINT keyPerson PRIMARY KEY (id)
GO

ALTER TABLE debt
add CONSTRAINT keyDebt PRIMARY KEY (id)
GO

ALTER TABLE treasury_set
add CONSTRAINT keyTreasurySet PRIMARY KEY (id)
GO

ALTER TABLE treasury
add CONSTRAINT keyTreasury PRIMARY KEY (id)
GO


------------------------
-- 3. Add foreign key --
------------------------
ALTER TABLE debt
add CONSTRAINT ForKeyDebt_person FOREIGN KEY (person_id) REFERENCES person(id)
GO

ALTER TABLE treasury
add CONSTRAINT ForKeyTreasury_person FOREIGN KEY (person_id) REFERENCES person(id)
GO

ALTER TABLE treasury
add CONSTRAINT ForKeyTreasury_set FOREIGN KEY (treasury_set_id) REFERENCES treasury_set(id)
GO


------------------
-- 4. add rules --
------------------
ALTER TABLE debt
add CONSTRAINT checkStatusDebt CHECK (status IN('lunas', 'belum')) 
GO

ALTER TABLE treasury
add CONSTRAINT checkStatusTreasury CHECK (status IN('lunas', 'belum')) 
GO


----------------------------------
-- 5. Inserting data into table --
----------------------------------

INSERT INTO person (
    [name],
    [alamat],
    [phone_number],
    [catatan]
) VALUES 
    ( 'Lutfi', 'alamat', '1234567890', '' ),
    ( 'Mahfudz', 'alamat', '1234567890', ''),
    ( 'Azwar', 'alamat', '1234567890', '' )
GO

INSERT INTO debt (
    [person_id],
    [jumlah_pinjaman],
    [status]
) VALUES 
    ( 1, 1000, 'lunas'),
    ( 2, 2000, 'belum'),
    ( 3, 3000, 'belum')
GO

INSERT INTO treasury_set (
    [name],
    [treasury_total]
) VALUES 
    ( 'kas 1', 100000 ),
    ( 'kas 2', 100000 ),
    ( 'kas 3', 100000 )
GO

INSERT INTO treasury (
    [person_id],
    [treasury_set_id],
    [total_bayar],
    [kekurangan],
    [status],
    [created_at],
    [updated_at]
) VALUES 
    ( 1, 1, 10000, 90000, 'belum', GETDATE(), GETDATE() ),
    ( 2, 1, 20000, 80000, 'belum', GETDATE(), GETDATE() ),
    ( 3, 1, 30000, 70000, 'belum', GETDATE(), GETDATE() )
GO


-------------------------
-- 6. Stored Procedure --
-------------------------
-- person --
CREATE PROCEDURE SelectPerson
AS
BEGIN
    SELECT * FROM person
END
GO

CREATE PROCEDURE SelectDetailPerson 
    @id INT
AS
BEGIN
    SELECT * FROM person WHERE id = @id
END
GO

CREATE PROCEDURE AddPerson 
    @name VARCHAR(50),
    @alamat VARCHAR(255),
    @phone_number INT,
    @catatan VARCHAR(max)
AS
BEGIN
    INSERT INTO person (
        [name], 
        [alamat], 
        [phone_number],
        [catatan]
    ) VALUES ( @name, @alamat, @phone_number, @catatan )
END
GO

CREATE PROCEDURE UpdatePerson
    @name VARCHAR(50),
    @alamat VARCHAR(255),
    @phone_number INT,
    @catatan VARCHAR(max),
    @id INT
AS
BEGIN
    UPDATE person SET 
        name = @name, alamat = @alamat, phone_number = @phone_number, catatan = @catatan
    WHERE id = @id
END
GO

CREATE PROCEDURE DeletePerson 
    @id INT
AS
BEGIN
    DELETE FROM person WHERE id = @id
END
GO
-- end person --







-- debt --
CREATE PROCEDURE SelectDebt
AS
BEGIN
    SELECT * FROM debt JOIN person ON person.id = debt.person_id
END
GO

CREATE PROCEDURE SelectDetailDebt 
    @id INT
AS
BEGIN
    SELECT * FROM debt JOIN person ON person.id = debt.person_id WHERE debt.id = @id
END
GO

CREATE PROCEDURE AddDebt 
    @person_id INT,
    @jumlah_pinjaman INT,
    @status VARCHAR(50)
AS
BEGIN
    INSERT INTO debt ([person_id], [jumlah_pinjaman], [status]) VALUES ( @person_id, @jumlah_pinjaman, @status )
END
GO

CREATE PROCEDURE UpdateDebt
    @person_id INT,
    @jumlah_pinjaman INT,
    @status VARCHAR(50),
    @id INT
AS
BEGIN
    UPDATE debt SET person_id = @person_id, jumlah_pinjaman = @jumlah_pinjaman, status = @status WHERE id = @id
END
GO

CREATE PROCEDURE DeleteDebt 
    @id INT
AS
BEGIN
    DELETE FROM debt WHERE id = @id
END
GO
-- end debt --






-- treasury_set --
CREATE PROCEDURE Selecttreasury_set
AS
BEGIN
    SELECT * FROM treasury_set
END
GO

CREATE PROCEDURE SelectDetailtreasury_set 
    @id INT
AS
BEGIN
    SELECT * FROM treasury_set WHERE id = @id
END
GO

CREATE PROCEDURE Addtreasury_set 
    @name VARCHAR(50),
    @treasury_total INT
AS
BEGIN
    INSERT INTO treasury_set (
        [name], 
        [treasury_total]
    ) VALUES ( @name, @treasury_total )
END
GO

CREATE PROCEDURE Updatetreasury_set
    @name VARCHAR(50),
    @treasury_total INT,
    @id INT
AS
BEGIN
    UPDATE treasury_set SET 
        name = @name, treasury_total = @treasury_total
    WHERE id = @id
END
GO

CREATE PROCEDURE Deletetreasury_set 
    @id INT
AS
BEGIN
    DELETE FROM treasury_set WHERE id = @id
END
GO
-- end treasury_set --







-- treasury --
CREATE PROCEDURE SelectTreasury
AS
BEGIN
    SELECT a.id, a.person_id, a.treasury_set_id, a.total_bayar, a.kekurangan, a.status, a.created_at, a.updated_at, b.id AS persons_id, b.name, c.id AS set_id, c.name AS set_name, c.treasury_total FROM treasury a JOIN person b ON b.id = a.person_id JOIN treasury_set c ON c.id = a.treasury_set_id
END
GO

CREATE PROCEDURE SelectDetailTreasury 
    @id INT
AS
BEGIN
    SELECT a.id, a.person_id, a.treasury_set_id, a.total_bayar, a.kekurangan, a.status, a.created_at, a.updated_at, b.id AS persons_id, b.name, c.id AS set_id, c.name AS set_name, c.treasury_total FROM treasury a JOIN person b ON b.id = a.person_id JOIN treasury_set c ON c.id = a.treasury_set_id WHERE a.id = @id
END
GO

CREATE PROCEDURE AddTreasury 
    @person_id INT,
    @treasury_set_id INT,
    @total_bayar INT,
    @kekurangan INT,
    @status VARCHAR(50)
AS
BEGIN
    INSERT INTO treasury (
        [person_id], [treasury_set_id], [total_bayar], [kekurangan], [status], [created_at], [updated_at]
    ) VALUES ( 
        @person_id, @treasury_set_id, @total_bayar, @kekurangan, @status, GETDATE(), GETDATE() 
    )
END
GO

CREATE PROCEDURE UpdateTreasury
    @person_id INT,
    @treasury_set_id INT,
    @total_bayar INT,
    @kekurangan INT,
    @status VARCHAR(50),
    @id INT
AS
BEGIN
    UPDATE treasury SET person_id = @person_id, treasury_set_id = @treasury_set_id, total_bayar = @total_bayar, kekurangan = @kekurangan, status = @status, updated_at = GETDATE() WHERE id = @id
END
GO

CREATE PROCEDURE DeleteTreasury 
    @id INT
AS
BEGIN
    DELETE FROM treasury WHERE id = @id
END
GO
-- end treasury --


----------------------
-- 7. show all data --
----------------------
-- SELECT * FROM users
EXEC SelectPerson
GO
EXEC SelectDebt
GO
EXEC Selecttreasury_set
GO
EXEC SelectTreasury
GO