package com.scheidtbachmann.tank.medvede.action;

import com.scheidtbachmann.tank.medvede.model.FlowMedvedModel;
import com.scheidtbachmann.tank.medvede.model.MedvedModel;
import com.scheidtbachmann.tank.medvede.service.MedvedService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@ApplicationScoped
@Named
public class FlowMedvedAction {


  @Inject
  MedvedService medvedService;

  @Inject
  FlowMedvedModel flowMedvedModel;

  @Inject
  MedvedModel medvedModel;


  public FlowMedvedAction() {
    System.out.println("Instancia triedy FlowMedvedAction sa vytvorila");
  }

  @PostConstruct
  public void oznacPrvehoMedvedaAkoAktualny() {
    if (medvedService.vratVsetkyMedvede().size() != 0) {
      flowMedvedModel.setAktualnyMedved(medvedService.vratVsetkyMedvede().get(0));
    }
  }

  public boolean jeNejakyMedvedOznacenyAkoAktualny() {
    if (medvedModel.getMedvede() == null) {
      return false;
    } else if (medvedModel.getMedvede().size() == 0) {
      return false;
    } else {
      return true;
    }
  }

  //Conversation methods

  public void initConversation() {
    if (!FacesContext.getCurrentInstance().isPostback()
        && flowMedvedModel.getConversation().isTransient()) {
      flowMedvedModel.getConversation().begin();
      System.out.println("Zacinam konverzaciu");
    }
  }

  public String endConversation() {
    if (!flowMedvedModel.getConversation().isTransient()) {
      flowMedvedModel.getConversation().end();
      System.out.println("Koncim konverzaciu");
    }
    return "";
  }


}
