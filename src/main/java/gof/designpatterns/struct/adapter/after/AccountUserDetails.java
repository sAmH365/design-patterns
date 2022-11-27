package gof.designpatterns.struct.adapter.after;

import gof.designpatterns.struct.adapter.after.security.UserDetails;

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
