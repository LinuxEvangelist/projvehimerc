package com.reglamb.projvehimerc.dao;

import com.reglamb.projvehimerc.domain.security.Users;

public interface UsersDao extends GenericDao<Users>{
    public Users getUser(String login);  

}
