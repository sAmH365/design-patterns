package gof.designpatterns.struct._6_adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
