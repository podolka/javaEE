package com.scheidtbachmann.tank.medvede.action;

import com.scheidtbachmann.tank.medvede.model.FlowMedvedModel;
import com.scheidtbachmann.tank.medvede.model.MedvedModel;
import com.scheidtbachmann.tank.medvede.model.MedvedPojo;
import com.scheidtbachmann.tank.medvede.service.MedvedService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@ApplicationScoped
@Named
public class MedvedAction {

  @Inject
  MedvedModel medvedModel;

  @Inject
  MedvedService medvedService;


  public MedvedAction() {
    System.out.println("Instancia triedy MedvedAction sa vytvorila");
  }

  public String nacitajPocetMedvedovDoModelu() {
    medvedModel.setPocetMedvedov(medvedService.vratVsetkyMedvede().size());
    return null;
  }

  public void nacitajVsetkyMedvedeDoModelu() {
    medvedModel.setMedvede(medvedService.vratVsetkyMedvede());
  }

  public String nulovaciGombik() {
    medvedModel.setPocetMedvedov(0);
    medvedModel.setMedvede(null);
    System.out.println("Nulujem");
    return null;
  }

  public String zobrazDetail() {
    return "success";
  }

  public String ulozMenoMedveda() {
    return "success";
  }

}
