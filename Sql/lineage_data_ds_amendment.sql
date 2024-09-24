create table if not exists lineage_data_ds_amendment(
change_request_id Integer not null,
ref_name varchar(255) null,
amend_route varchar(255) null,
route_active char null,
route_name varchar(255) null,
route_type Integer null,
auto_approval char null,
auto_approval_step Integer null,
change_request_creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint lineage_data_ds_amendment_pk primary key(change_request_id));