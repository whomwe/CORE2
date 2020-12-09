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
public class Warrior extends Champions {
    
    private String weapon;
    private int skill;
    private int Fee;
    
    Warrior(String name, ChampionState state, int skillLvl, int entryFee, String weapon){
        super(name, state, skillLvl, entryFee);
        skillLvl = skill;
        entryFee = Fee;
    }

public String getWeapon(){
return weapon;}  

public int getSkillLvl(){
    skill = Fee / 100;
return skill;}

}
