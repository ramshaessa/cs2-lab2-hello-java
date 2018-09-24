package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorValidName() {
    new Team(null, "Klinsmann", 500);
  }
  
  // TODO testConstructorValidHeadcoach
  @Test
  public void testConstructorValidHeadcoach(){
      new Team(null, "Rueda", 600);
  }
  // TODO testConstructorValidFunding
  @Test
  public void testConstructorValidFunding(){
      new Team(null, "Löw", 700);
  }

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  @Test
  public void testGetHeadcoach() {
  final String Headcoach = "Chile";
  final Team t = makeTeamFixture(Headcoach, "klinsmann", 500);
  assertEquals(Headcoach, t.getHeadcoach());
  }
  // TODO testGetHeadcoach
  // TODO testGetFunding
  
  @Test
  public void testGetFunding(){
  final String Funding = "Germany";
  final Team t = makeTeamFixture(Funding, "Low", 700);
  assertEquals(Funding,t.getFunding());
  }}
