package com.scheidtbachmann.tank.medvede.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.scheidtbachmann.tank.medvede.access.MedvedDao;
import com.scheidtbachmann.tank.medvede.model.MedvedPojo;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@ApplicationScoped
public class MedvedService {

  @Inject
  MedvedDao medvedDao;

  public List<MedvedPojo> vratVsetkyMedvede() {
    List<MedvedPojo> medvedPojoList = new ArrayList<>();
    medvedPojoList.addAll(medvedDao.vratLesneMedvede());
    medvedPojoList.addAll(medvedDao.vratKontaineroveMedvede());
    return medvedPojoList;
  }

}
