-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE ALL_CLIENT 
AS
BEGIN
	SELECT Shop.id, Shop.shopname, count(ShopClient.id) as num_of_client
	FROM (Shop INNER JOIN ShopClient ON Shop.id = ShopClient.shopid)
	GROUP BY Shop.id, Shop.shopname
END
GO
