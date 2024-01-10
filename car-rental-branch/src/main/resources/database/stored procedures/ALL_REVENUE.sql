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
CREATE PROCEDURE [dbo].ALL_REVENUE 
AS
BEGIN
	SELECT shop.id, shop.shopname,
			sum(rentalfee) as revenue
	FROM ((Shop INNER JOIN Car ON Shop.id = Car.shopid)
				INNER JOIN CarBill ON Car.id = CarBill.carid)
	GROUP BY shop.id, shop.shopname
END
GO
