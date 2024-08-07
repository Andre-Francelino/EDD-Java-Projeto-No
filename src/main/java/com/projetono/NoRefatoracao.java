package com.projetono;

public class NoRefatoracao<T> {
    private T conteudo;
    private NoRefatoracao<T> proximoNo;

    public NoRefatoracao(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefatoracao<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoRefatoracao<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoRefatoração{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
