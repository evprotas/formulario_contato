create index IX_6B9BB75C on FC_Estado (groupId);
create index IX_DA5F2782 on FC_Estado (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A12FA684 on FC_Estado (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C2D5212E on FC_FormularioContato (groupId);
create index IX_16EAA9F0 on FC_FormularioContato (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F9F4EC72 on FC_FormularioContato (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E3147FF9 on FC_Municipio (groupId);
create index IX_7B51BF85 on FC_Municipio (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F2DE6347 on FC_Municipio (uuid_[$COLUMN_LENGTH:75$], groupId);