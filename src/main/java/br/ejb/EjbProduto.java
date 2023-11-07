/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import br.data.crud.CrudProduto;
import br.data.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author willi
 */
@Stateless
public class EjbProduto {

    public ArrayList<Produto> getAll(){
        return new CrudProduto().getAll();
    }
}
