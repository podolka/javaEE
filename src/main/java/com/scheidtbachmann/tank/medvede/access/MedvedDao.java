package com.scheidtbachmann.tank.medvede.access;

import com.scheidtbachmann.tank.medvede.model.MedvedPojo;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@ApplicationScoped
public class MedvedDao {

  private static MedvedPojo[] lesneMedvede = new MedvedPojo[]{new MedvedPojo(1L, "Macko Usko")};
  private static MedvedPojo[] kontaineroveMedvede = new MedvedPojo[]{new MedvedPojo(2L, "Macko PU"), new MedvedPojo(3L, "Bubu")};

  public List<MedvedPojo> vratLesneMedvede() {
    return Arrays.asList(lesneMedvede);
  }

  public List<MedvedPojo> vratKontaineroveMedvede() {
    return Arrays.asList(kontaineroveMedvede);
  }

}
