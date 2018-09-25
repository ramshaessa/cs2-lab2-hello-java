package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
        
    }
  

  // TODO makeListFixture

  @Test
  public void testFindPositionArray0() {
  final Team[] arr = makeArrayFixture(0);
  assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }
     

  @Test
  public void testFindPositionArray10s() {
  final Team[] arr = makeArrayFixture(10);
  assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }
  

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
    }
  
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0(){
  final Team[] arr = makeArrayFixture(0);
  assertFalse(Search.FindPositionList(List, "Team 0").isPresent());
      }
  

@Test
public void testFindPositionList10s(){
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(List,"Team 5").isPresent());
    }


@Test    
public void testFindPositionList10f(){
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(List, "Team 12").isPresent());
    }

  
  // TODO: testFindMinFundingArray for several sizes and scenarios
  @Test
 public void TestFindMinFundingArray(){
 final Team[] arr = makeArrayFixture(0);
 assertTrue(Search.findMinFundingArray(arr, "0"). isPresent());
 }
 
 
 
@Test
public void FindMinFundingArray(){ 
final Team[] arr = makeArrayFixture(5);
assertFalse(Search.findMinFinding(arr, "10"). isPresent());
}



@Test
public void FindMinFundingArray(){
final Team[] arr = makeArrayFixture(10);
assertFalse(Search. FindMinFunding(arr, "10"). isPresent());
}


@Test
public void FindMinFundingArrayFast(){
    final Team[] arr = makeArrayFixture(5);
assertFalse(Search. FindMinFundingArrayFast(arr, "6"). isPresent());
}

@Test
public void FindMinFundingArrayFast(){
    final Team[] arr = makeArrayFixture(5);
assertTrue(Search. FindMinFundingArrayFast(arr, "5"). isPresent());
}}
  

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios



