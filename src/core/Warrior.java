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
    
    Warrior(String name, int skillLvl, int entryFee){
        super(name, skillLvl, entryFee);
        this.skillLvl(skill);
    }

public String getWeapon(){

return weapon;}  

public int skillLvl(int Lvl){
    skill = Lvl / 100;
return skill;}

}
