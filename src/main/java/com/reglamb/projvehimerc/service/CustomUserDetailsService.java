package com.reglamb.projvehimerc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.UsersDao;
import com.reglamb.projvehimerc.domain.security.SecurityUser;
import com.reglamb.projvehimerc.domain.security.Users;

@Service
@Transactional(readOnly=true)
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	UsersDao usersDao;
//	private Map<String, Users> users = new HashMap<String, Users>();
	
//	public  CustomUserDetailsService(Collection<Users> users) {
//	for (Users user : users) {
//	this.users.put(user.getName_user().toLowerCase(), user);
//	}
//	}

	@Override
	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {
		Users domainUser = usersDao.getUser(login);
		
        boolean accountNonExpired = true;  
        boolean credentialsNonExpired = true;  
        boolean accountNonLocked = true;  
        
  
        return new SecurityUser(  
                domainUser.getLogin(),   
                domainUser.getPassword(),  
                domainUser.getEnabled(),   
                accountNonExpired,   
                credentialsNonExpired,   
                accountNonLocked,  
                getAuthorities(domainUser.getauthorities().getId()),domainUser.getName_user());  
        }

	private Collection<? extends GrantedAuthority> getAuthorities(Integer id) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(id));
		return authList;
	}

	private List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

	private List<String> getRoles(Integer id) {
		List<String> roles = new ArrayList<String>();
		if (id.intValue() == 1) {
			roles.add("ROLE_USER");
			roles.add("ROLE_ADMIN");
		} else if (id.intValue() == 2) {
			roles.add("ROLE_USER");
		}
		return roles;
	}
	
}
