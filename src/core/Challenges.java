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
public class Challenges {
    
   private int challNum;
   private String enemyNme;
   private int skillReq;
   private int reward;
   
   Challenges(int challNum, ChallengeType challType,  String enemyNme, int skillReq, int reward){
   this.challNum = challNum;
   this.enemyNme = enemyNme;
   this.skillReq = skillReq;
   this.reward = reward;
}

public void setChallNum(int challNum){
this.challNum = challNum;}

public void setEnemyNme(String enemyNme){
this.enemyNme = enemyNme;}

public void setSkillReq(int skillReq){
this.skillReq = skillReq;}

public void setReward(int reward){
this.reward = reward;}

public int getChallNum(){
return challNum;}

public String getEnemyNme(){
return enemyNme;}

public int getSkillReq(){
return skillReq;}

public int getReward(){
return reward;}

}



