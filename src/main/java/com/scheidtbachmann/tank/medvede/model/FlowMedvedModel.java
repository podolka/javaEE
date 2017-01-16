package com.scheidtbachmann.tank.medvede.model;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by lajdova.romana on 15. 4. 2015.
 */

@ConversationScoped
@Named
public class FlowMedvedModel implements Serializable {

  @Inject
  private Conversation conversation;

  private MedvedPojo aktualnyMedved;


  public FlowMedvedModel(){
    System.out.println("Instancia triedy FlowMedvedModel sa vytvorila");
  }

  public MedvedPojo getAktualnyMedved() {
    return aktualnyMedved;
  }

  public void setAktualnyMedved(MedvedPojo aktualnyMedved) {
    this.aktualnyMedved = aktualnyMedved;
  }

  public Conversation getConversation() {
    return conversation;
  }

  public void setConversation(Conversation conversation){
    this.conversation=conversation;
  }
}