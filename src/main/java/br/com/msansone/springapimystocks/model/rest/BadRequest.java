package br.com.msansone.springapimystocks.model.rest;

public class BadRequest extends AbstractResponse {

    public BadRequest(String erroMessage) {
        this.erroMessage = erroMessage;
    }

    String erroMessage;

    public String getErroMessage() {
        return erroMessage;
    }

    public void setErroMessage(String erroMessage) {
        this.erroMessage = erroMessage;
    }
}
