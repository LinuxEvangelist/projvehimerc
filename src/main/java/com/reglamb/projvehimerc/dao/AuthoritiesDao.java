package com.reglamb.projvehimerc.dao;

import com.reglamb.projvehimerc.domain.security.Authorities;

public interface AuthoritiesDao extends GenericDao<Authorities>{
    public Authorities getAuthority(int id);  
}
