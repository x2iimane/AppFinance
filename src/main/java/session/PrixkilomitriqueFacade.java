/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Prixkilomitrique;

/**
 *
 * @author Marouane
 */
@Stateless
public class PrixkilomitriqueFacade extends AbstractFacade<Prixkilomitrique> {

    @PersistenceContext(unitName = "FSSM_AppFinanciereFssm_war_2.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrixkilomitriqueFacade() {
        super(Prixkilomitrique.class);
    }
    
}
