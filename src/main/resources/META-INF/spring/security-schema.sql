DROP TABLE "authorities";
DROP TABLE "users";

DROP TABLE group_members;
DROP TABLE group_authorities;
DROP TABLE groups;

DROP SEQUENCE id_seq_group;
DROP SEQUENCE id_seq_groupm;
--Create tables security; UserDetailsService for useschema
 CREATE TABLE "users"(username varchar(50) not null PRIMARY KEY,password varchar(50) not null,enabled boolean not null);

 CREATE TABLE "authorities" (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references "users"(username));create unique index ix_auth_username on authorities (username,authority);

--Group Authorities
 CREATE SEQUENCE id_seq_group;
 CREATE SEQUENCE id_seq_groupm;

 CREATE TABLE "groups" (id INT NOT NULL DEFAULT NEXTVAL('id_seq_group') PRIMARY KEY,group_name varchar(50) not null);

 CREATE TABLE "group_authorities" (group_id bigint not null,authority varchar(50) not null,constraint fk_group_authorities_group foreign key(group_id) references "groups"(id));

 CREATE TABLE "group_members" (id INT NOT NULL DEFAULT NEXTVAL('id_seq_groupm') PRIMARY KEY,username varchar(50) not null,group_id bigint not null,constraint fk_group_members_group foreign key(group_id) references "groups"(id));