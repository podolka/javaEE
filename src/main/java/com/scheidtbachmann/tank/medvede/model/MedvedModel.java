package com.scheidtbachmann.tank.medvede.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@SessionScoped
@Named
public class MedvedModel implements Serializable{

  private int pocetMedvedov;
  private List<MedvedPojo> medvede;

  public int getPocetMedvedov() {
    return pocetMedvedov;
  }

  public void setPocetMedvedov(final int pocetMedvedov) {
    this.pocetMedvedov = pocetMedvedov;
  }

  public void setMedvede(List<MedvedPojo> medvede){
    this.medvede = medvede;
  }

  public List<MedvedPojo> getMedvede(){
    return medvede;
  }

}
