/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

/**
 *
 * @author 6530729
 */
final class Objetiva extends Questao {

     //ATRIBUTOS
    private String[] opcoes;
    private int respostaCorreta;

    //CONSTRUTOR
    public Objetiva() {

        this.opcoes = new String[5];

    }

    public String retornaQuestao() {

        String retorno = "";

        //QUESTÕES OBJETIVAS
        //retorno += "Questões Objetivas. \n";

        retorno +=  this.getPergunta() + " " + "[" + this.getPeso() + "]" + "\r\n";

        String[] op = this.getOpcoes();
        char alter='a';
        for (int j = 0; j < 5; j++) {
            retorno += " (" + (alter++) + ") " + op[j] + "\r\n\r\n";
        }
        //retorno += "R: " + this.getRespostaCorreta() + "\r\n\r\n";

        return retorno;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

}
