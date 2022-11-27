package gof.designpatterns.struct.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
