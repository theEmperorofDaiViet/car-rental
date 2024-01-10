-- ================================================
-- Template generated from Template Explorer using:
-- Create Trigger (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- See additional Create Trigger templates for more
-- examples of different Trigger statements.
--
-- This block of comments will not be included in
-- the definition of the function.
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
CREATE trigger [dbo].[Asset_Trigger] on [dbo].[Asset]
for insert, update, delete
as
	if(@@SERVERNAME <> 'LAPTOP-FC24HOJJ\KHIET')
	begin
		print 'Chi duoc them, sua, xoa tai tru so chinh'
		rollback tran
	end
GO
