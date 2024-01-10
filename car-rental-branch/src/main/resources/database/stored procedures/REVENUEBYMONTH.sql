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
CREATE PROCEDURE [dbo].REVENUEBYMONTH	
AS
BEGIN
	SELECT YEAR(Bill.payday) as year, MONTH(Bill.payday) as month, sum(CarBill.rentalfee) as revenue
	FROM (((Shop INNER JOIN Car on Shop.id = Car.shopid)
				 INNER JOIN CarBill ON Car.id = CarBill.carid)
				 INNER JOIN Bill ON CarBill.billid = Bill.id)
	WHERE Shop.id = 4
	GROUP BY Year(Bill.payday), Month(Bill.payday)
END
GO
