package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
     
    }
      if (headcoach == null) {
          throw new IllegalArgumentException("headcoach is null");
    // TODO validity checking for headcoach
    // TODO validity checking for funding
  
    // TODO complete this constructor
  }
  if (funding == null) {
    throw new IllegalArgumentException("funding is null");
  }
this.name = name;
this.headcoach = headcoach;
this.funding = funding; 
}
  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
      return this.headcoach;
    // TODO complete this method
  }

  /** Returns the team's funding level. */
  public int getFunding() {
      return this.funding;
      
    // TODO complete this method
 
  }}