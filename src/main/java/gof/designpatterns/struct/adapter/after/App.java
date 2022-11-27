package gof.designpatterns.struct.adapter.after;

import gof.designpatterns.struct.adapter.after.security.LoginHandler;
import gof.designpatterns.struct.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("abc", "abc");
        System.out.println("login = " + login);
    }
}
