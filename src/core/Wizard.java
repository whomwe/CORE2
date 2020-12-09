/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.*;

/**
 *
 * @author black
 */
public class Wizard extends Champions {

private int entFee;    
private boolean necromancer;

public Wizard(String name, ChampionState state, int skillLvl, int entryFee, boolean necromancer, String spellSpeciality){
  super(name, state, skillLvl, entryFee);
  super.setChampEntryFee(300);
 
}

public void setEntryFee(int finalFee){
    
    finalFee = entFee / 100;
}

public String hasSpells(){
    return "";}

  
}
