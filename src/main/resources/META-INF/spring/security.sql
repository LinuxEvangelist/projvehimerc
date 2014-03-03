INSERT INTO "DBMERCANCIAS".authorities (id,role) VALUES (1,'admin'), (2,'user');  
  
INSERT INTO "DBMERCANCIAS".users (id,login,name_user,password,enabled) VALUES (1,'cesar','Cesar Ayambo Toledo','38aab7ba97bd6bb2e51add1e5617eabfc8d13ec85c004e909eec4b70172437ae85e0c56e43fe51b0',true), (2,'admin','Administrador del Sistema','98afcd6f54569da7fea7fe4b1bf79d59dd27e559d38ee75cabd796f43058ebe15f201dfd453942e0',true);  
  
INSERT INTO "DBMERCANCIAS".users_authorities (user_id, authorities_id) VALUES (1, 2), (2, 1); 