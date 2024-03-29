-- Enabling the replication database
use master
exec sp_replicationdboption @dbname = N'CarRental', @optname = N'merge publish', @value = N'true'
GO

-- Adding the merge publication
use [CarRental]
exec sp_addmergepublication @publication = N'CarRental4', @description = N'Merge publication of database ''CarRental'' from Publisher ''LAPTOP-FC24HOJJ\KHIET''.', @sync_mode = N'native', @retention = 14, @allow_push = N'true', @allow_pull = N'true', @allow_anonymous = N'true', @enabled_for_internet = N'false', @snapshot_in_defaultfolder = N'true', @compress_snapshot = N'false', @ftp_port = 21, @ftp_subdirectory = N'ftp', @ftp_login = N'anonymous', @allow_subscription_copy = N'false', @add_to_active_directory = N'false', @dynamic_filters = N'false', @conflict_retention = 14, @keep_partition_changes = N'false', @allow_synctoalternate = N'false', @max_concurrent_merge = 0, @max_concurrent_dynamic_snapshots = 0, @use_partition_groups = null, @publication_compatibility_level = N'100RTM', @replicate_ddl = 1, @allow_subscriber_initiated_snapshot = N'false', @allow_web_synchronization = N'false', @allow_partition_realignment = N'true', @retention_period_unit = N'days', @conflict_logging = N'both', @automatic_reinitialization_policy = 0
GO


exec sp_addpublication_snapshot @publication = N'CarRental4', @frequency_type = 4, @frequency_interval = 14, @frequency_relative_interval = 1, @frequency_recurrence_factor = 0, @frequency_subday = 1, @frequency_subday_interval = 5, @active_start_time_of_day = 500, @active_end_time_of_day = 235959, @active_start_date = 0, @active_end_date = 0, @job_login = null, @job_password = null, @publisher_security_mode = 0, @publisher_login = N'sa', @publisher_password = N''


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Asset', @source_owner = N'dbo', @source_object = N'Asset', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Bill', @source_owner = N'dbo', @source_object = N'Bill', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Car', @source_owner = N'dbo', @source_object = N'Car', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'CarBill', @source_owner = N'dbo', @source_object = N'CarBill', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'CarCondition', @source_owner = N'dbo', @source_object = N'CarCondition', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'CarContact', @source_owner = N'dbo', @source_object = N'CarContact', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Client', @source_owner = N'dbo', @source_object = N'Client', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Condition', @source_owner = N'dbo', @source_object = N'Condition', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Contact', @source_owner = N'dbo', @source_object = N'Contact', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'ContactAsset', @source_owner = N'dbo', @source_object = N'ContactAsset', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Shop', @source_owner = N'dbo', @source_object = N'Shop', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = N'[id] = 4', @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'ShopClient', @source_owner = N'dbo', @source_object = N'ShopClient', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'Staff', @source_owner = N'dbo', @source_object = N'Staff', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


use [CarRental]
exec sp_addmergearticle @publication = N'CarRental4', @article = N'StaffCar', @source_owner = N'dbo', @source_object = N'StaffCar', @type = N'table', @description = null, @creation_script = null, @pre_creation_cmd = N'drop', @schema_option = 0x000000010C034FD1, @identityrangemanagementoption = N'auto', @pub_identity_range = 10000, @identity_range = 1000, @threshold = 80, @destination_owner = N'dbo', @force_reinit_subscription = 1, @column_tracking = N'false', @subset_filterclause = null, @vertical_partition = N'false', @verify_resolver_signature = 1, @allow_interactive_resolver = N'false', @fast_multicol_updateproc = N'true', @check_permissions = 0, @subscriber_upload_options = 0, @delete_tracking = N'true', @compensate_for_errors = N'false', @stream_blob_columns = N'false', @partition_options = 0
GO


exec sp_addmergefilter @publication = N'CarRental4', @article = N'CarBill', @filtername = N'CarBill_Car', @join_articlename = N'Car', @join_filterclause = N'[Car].[id] = [CarBill].[carid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'CarCondition', @filtername = N'CarCondition_Car', @join_articlename = N'Car', @join_filterclause = N'[Car].[id] = [CarCondition].[carid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'CarContact', @filtername = N'CarContact_Car', @join_articlename = N'Car', @join_filterclause = N'[Car].[id] = [CarContact].[carid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'StaffCar', @filtername = N'StaffCar_Car', @join_articlename = N'Car', @join_filterclause = N'[Car].[id] = [StaffCar].[carid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'ContactAsset', @filtername = N'ContactAsset_CarContact', @join_articlename = N'CarContact', @join_filterclause = N'[CarContact].[id] = [ContactAsset].[carcontactid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'Car', @filtername = N'Car_Shop', @join_articlename = N'Shop', @join_filterclause = N'[Shop].[id] = [Car].[shopid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'ShopClient', @filtername = N'ShopClient_Shop', @join_articlename = N'Shop', @join_filterclause = N'[Shop].[id] = [ShopClient].[shopid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'Staff', @filtername = N'Staff_Shop', @join_articlename = N'Shop', @join_filterclause = N'[Shop].[id] = [Staff].[shopid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'Bill', @filtername = N'Bill_Staff', @join_articlename = N'Staff', @join_filterclause = N'[Staff].[id] = [Bill].[staffid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
exec sp_addmergefilter @publication = N'CarRental4', @article = N'Contact', @filtername = N'Contact_Staff', @join_articlename = N'Staff', @join_filterclause = N'[Staff].[id] = [Contact].[staffid]', @join_unique_key = 1, @filter_type = 1, @force_invalidate_snapshot = 1, @force_reinit_subscription = 1
GO
