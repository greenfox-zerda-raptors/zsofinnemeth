package com.greenfox.bx;

/**
 * Created by false on 2016. 11. 16..
 */
public class CreditCard implements CreditCardy {
    private int SumCVV;
    private String nameCardHolder;
    private int codeAccount;

    @Override
    public void setSumCVV(int sumCVV) {

    }

    @Override
    public int getSumCVV() {
        return this.sumCVV();
    }

    @Override
    public void setNameCardholder(String nameCardholder) {

    }

    @Override
    public String getNameCardholder() {
        return this.nameCardHolder;
    }

    @Override
    public void setCodeAccount(String codeAccount) {

    }

    @Override
    public String getCodeAccount() {
        return this.codeAccount;
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        int sum = 0;
        char c;

        for (int i = 0; i < codeAccount.length(); i++) {
            c = codeAccount.charAt(i);
            sum += (c >= '0' && c <= '9') ? Character.getNumericValue(c) : 0;
        }

        return sum;

    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return false;
    }
}
