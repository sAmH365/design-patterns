package gof.designpatterns.struct._6_adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
