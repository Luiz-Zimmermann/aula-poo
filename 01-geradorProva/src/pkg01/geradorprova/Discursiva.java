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
final class Discursiva extends Questao {

     //ATRIBUTOS
    private String criteriosCorrecao;

    //METODOS
    public String retornaQuestao() {

        String retorno = "";
        //QUESTÕES DISCURSIVAS

            //retorno += "Questões Discursivas. \n";

            retorno +=  this.getPergunta() + " [" + this.getPeso() + "]" + "\r\n";
            retorno += "________________________________________________________________\r\n";
            retorno += "________________________________________________________________\r\n";
            retorno += "________________________________________________________________\r\n";
            retorno += "Critério: " + this.getCriteriosCorrecao() + "\r\n\r\n";

        return retorno;

    }

    public String getCriteriosCorrecao() {
        return criteriosCorrecao;
    }

    public void setCriteriosCorrecao(String criteriosCorrecao) {
        this.criteriosCorrecao = criteriosCorrecao;
    }

}
