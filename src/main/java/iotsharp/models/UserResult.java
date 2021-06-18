package iotsharp.models;

import iotsharp.CommonResult;

public class UserResult extends CommonResult {

    private SignIn signIn;

    public SignIn getSignIn() {
        return signIn;
    }

    public void setSignIn(SignIn signIn) {
        this.signIn = signIn;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    private Token token;

}
