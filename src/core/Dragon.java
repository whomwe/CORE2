/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author black
 */
public class Dragon extends Champions {
    
    private boolean talks;
    
Dragon(String name, int skillLvl, int entryFee){
    
    super(name, skillLvl, entryFee);
    super.setChampEntryFee(500);
    super.setChampSkillLvl(7);
}

public void dragonTalks(String talks){
    
}

}


