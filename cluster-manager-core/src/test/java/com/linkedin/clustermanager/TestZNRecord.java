package com.linkedin.clustermanager;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test (groups = {"unitTest"})
public class TestZNRecord
{

  @Test
  public void testEquals(){
    ZNRecord record1 = new ZNRecord("id");
    record1.setSimpleField("k1","v1");
    record1.setMapField("m1", new HashMap<String, String>());
    record1.getMapField("m1").put("k1","v1");
    record1.setListField("l1", new ArrayList<String>());
    record1.getListField("l1").add("v1");
    ZNRecord record2 = new ZNRecord("id");
    record2.setSimpleField("k1","v1");
    record2.setMapField("m1", new HashMap<String, String>());
    record2.getMapField("m1").put("k1","v1");
    record2.setListField("l1", new ArrayList<String>());
    record2.getListField("l1").add("v1");

    
    AssertJUnit.assertEquals(record1,record2);
    record2.setSimpleField("k2","v1");
    AssertJUnit.assertNotSame(record1,record2);
  }
}