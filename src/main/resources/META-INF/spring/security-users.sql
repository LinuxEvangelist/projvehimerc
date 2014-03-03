-----
--Insert Users
insert into users (username,password,enabled) values ('user1','user1',true);
insert into users (username,password,enabled) values ('admin1','admin1',true);
insert into users (username,password,enabled) values ('user2','admin1',true);
insert into users (username,password,enabled) values ('disabled1','disabled1',false);
--Insert Authorities
insert into authorities(username,authority) values ('user1','ROLE_USER');
insert into authorities(username,authority) values ('admin1','ROLE_ADMIN');
insert into authorities(username,authority) values ('admin1','ROLE_USER');
insert into authorities(username,authority) values ('user2','ROLE_USER');
insert into authorities(username,authority) values ('disabled1','ROLE_USER');
-----
-- Create the Groups
insert into groups(group_name) values ('Users');
insert into groups(group_name) values ('Administrators');

-----
-- Map the Groups to Roles
insert into group_authorities(group_id, authority) select id,'ROLE_USER' from groups where group_name='Users';
-- Administrators are both a ROLE_USER and ROLE_ADMIN
insert into group_authorities(group_id, authority) select id,'ROLE_USER' from groups where group_name='Administrators';
insert into group_authorities(group_id, authority) select id,'ROLE_ADMIN' from groups where group_name='Administrators';

-----
-- Map the users to Groups
insert into group_members(group_id, username) select id,'user1' from groups where group_name='Users';
insert into group_members(group_id, username) select id,'admin1' from groups where group_name='Administrators';
insert into group_members(group_id, username) select id,'user2' from groups where group_name='Users';
insert into group_members(group_id, username) select id,'disabled1' from groups where group_name='Users';