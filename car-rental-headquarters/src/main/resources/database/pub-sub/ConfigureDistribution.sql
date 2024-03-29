/****** Scripting replication configuration. Script Date: 08/11/2023 04:38:02 CH ******/
/****** Please Note: For security reasons, all password parameters were scripted with either NULL or an empty string. ******/

/****** Installing the server as a Distributor. Script Date: 08/11/2023 04:38:02 CH ******/
use master
exec sp_adddistributor @distributor = N'LAPTOP-FC24HOJJ\KHIET', @password = N''
GO
exec sp_adddistributiondb @database = N'distribution', @data_folder = N'G:\Program Files\Microsoft SQL Server\MSSQL16.KHIET\MSSQL\Data', @log_folder = N'G:\Program Files\Microsoft SQL Server\MSSQL16.KHIET\MSSQL\Data', @log_file_size = 2, @min_distretention = 0, @max_distretention = 72, @history_retention = 48, @deletebatchsize_xact = 5000, @deletebatchsize_cmd = 2000, @security_mode = 1
GO

use [distribution] 
if (not exists (select * from sysobjects where name = 'UIProperties' and type = 'U ')) 
	create table UIProperties(id int) 
if (exists (select * from ::fn_listextendedproperty('SnapshotFolder', 'user', 'dbo', 'table', 'UIProperties', null, null))) 
	EXEC sp_updateextendedproperty N'SnapshotFolder', N'\\Laptop-fc24hojj\repldata', 'user', dbo, 'table', 'UIProperties' 
else 
	EXEC sp_addextendedproperty N'SnapshotFolder', N'\\Laptop-fc24hojj\repldata', 'user', dbo, 'table', 'UIProperties'
GO

exec sp_adddistpublisher @publisher = N'LAPTOP-FC24HOJJ\KHIET', @distribution_db = N'distribution', @security_mode = 0, @login = N'sa', @password = N'', @working_directory = N'\\Laptop-fc24hojj\repldata', @trusted = N'false', @thirdparty_flag = 0, @publisher_type = N'MSSQLSERVER'
GO
