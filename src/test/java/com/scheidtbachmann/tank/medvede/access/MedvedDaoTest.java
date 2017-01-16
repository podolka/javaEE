package com.scheidtbachmann.tank.medvede.access;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lorman.erich on 8. 12. 2016.
 */
public class MedvedDaoTest {

    private MedvedDao medvedDao = new MedvedDao();

    @Test
    public void vratLesneMedvede() throws Exception {
        assertNotNull(medvedDao.vratLesneMedvede());
    }

    @Test
    public void vratKontaineroveMedvede() throws Exception {
        assertNotNull(medvedDao.vratKontaineroveMedvede());
    }

}