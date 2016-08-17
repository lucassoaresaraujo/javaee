/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pi.sefaz.javaee.teste;

import javax.persistence.Persistence;

/**
 *
 * @author lucassoares
 */
public class CriaTabelas {
    
    public static void main(String[] args){
        Persistence.createEntityManagerFactory("FinanceiroPU");
    }
    
}
