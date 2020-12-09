/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.*;
/**
 *
 * @author Wayne Homwe, Anwar Carruthers
 */
public class Champions {

   private String name;
   private int skillLvl;
   private int entryFee;
  
//*@param name is the name of the champion
//*@param skillLvl is the skill level of the champion
//*@param entryFee is the entry fee of the Champion   
public Champions(String name, ChampionState state, int skillLvl, int entryFee){
    this.name = name;
    this.skillLvl= skillLvl;
    this.entryFee = entryFee;
}

//@param name is to return the name of the champion
public void setChampName(String name){
this.name = name;
}

//@param skillLvl is to return the skill level of the champion
public void setChampSkillLvl(int skillLvl){
this.skillLvl = skillLvl;
}

public void setChampEntryFee(int entryFee){
this.entryFee = entryFee;
}

public String getChampName(){
return name;}

public int getChampSkillLvl(){
return skillLvl;
}

public int getGhampEntryFee(){
return entryFee;
}


}


 

  
        
