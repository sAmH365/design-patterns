package gof.designpatterns.struct._6_adapter.after;

import gof.designpatterns.struct._6_adapter.after.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
