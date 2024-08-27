/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Enum.EnumOperacao;

/**
 *
 * @author vinic
 */
public class CalculadoraController {
    private Double Total;
    public CalculadoraController(){
    Total = 0.00;
    }
    public Double RealizaOperacao(EnumOperacao operacao,Double valor, char origem){
        if(operacao.equals(EnumOperacao.SOMA)){
            Total += valor;
        }
        else if(operacao.equals(EnumOperacao.SUBTRACAO)){
            Total -= valor;
        }
        else if(operacao.equals(EnumOperacao.DIVISAO)){
            Total /= valor;
        }
        else if(operacao.equals(EnumOperacao.MULTIPLICACAO)){
            if(origem == 'M')
            {
               Total = 1.0;
               Total *= valor;
            }
            else{
                System.out.println(Total);
                System.out.println(valor);
               
            Total *= valor;
             System.out.println(Total);
            }
        }
        return Total;
    }
    public double getTotal(){
        return this.Total;
    };
    public void zerar(){
        Total = 0.0;
    }
}
