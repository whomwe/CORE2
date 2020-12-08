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
private String spellSpeciality; 
private boolean necromancer = false;

public Wizard(String name, int skillLvl, int entryFee){
  super(name, skillLvl, entryFee);
  
  super.setChampEntryFee(300);
  
  if(isNecromancer()){
  super.setChampEntryFee(400);
  };
}

public void setEntryFee(int finalFee){
    
    finalFee = entFee / 100;
}

public String hasSpells(){
    return "";}

public boolean isNecromancer(){
    
return necromancer;
}
    
    
    
}
