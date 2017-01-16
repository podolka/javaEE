package com.scheidtbachmann.tank.medvede.model;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
public class MedvedPojo {

  private Long id;
  private String meno;

  public MedvedPojo(final Long id, final String meno) {
    this.id = id;
    this.meno = meno;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getMeno() {
    return meno;
  }

  public void setMeno(final String meno) {
    this.meno = meno;
  }

  public String toString(){
    return meno + id;
  }
}

