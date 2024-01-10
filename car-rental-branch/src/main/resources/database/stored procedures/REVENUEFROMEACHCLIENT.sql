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
CREATE PROCEDURE [dbo].REVENUEFROMEACHCLIENT 
AS
BEGIN
	SELECT Client.id, Client.name,
			sum(rentalfee) as revenue
	FROM (((Client INNER JOIN Bill ON Client.id = Bill.clientid)
				   INNER JOIN CarBill ON Bill.id = CarBill.billid)
				   INNER JOIN Staff ON Bill.staffid = Staff.id)
	WHERE Staff.shopid = 4
	GROUP BY client.id, client.name
END
GO
