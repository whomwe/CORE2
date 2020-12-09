package core;
import java.util.*;
import java.io.*;
/**
 * This class implements the behaviour expected from the CORE
* as required for 6COM1037 Cwk Assignment - Nov 2020
 * 
 * @author 
 * @version 05/10/20
 */

public class Tournament implements CORE
{
    // Fields
    ArrayList<Champions> allChampions = new ArrayList<Champions>();
    ArrayList<Challenges> allChallenges = new ArrayList<Challenges>(); 
    
   
    
    //**************** CORE ************************** 
    //Constructor requires the name of the player
    //@param p1 represents the name of the player
    public Tournament(String pl)
    {
     
    }
    
     
    //******* Implements interface CORE *******************
    /**Returns a String representation of the state of the game,
     * including the name of the player, state of the treasury,
     * whether defeated or not, and the champions currently in the 
     * team,(or, "No champions" if team is empty)
     * 
     * @return a String representation of the state of the game,
     * including the name of the player, state of the treasury,
     * whether defeated or not, and the champions currently in the 
     * team,(or, "No champions" if team is empty)
     */
    public String toString() {
        return "";
     }
  
    /** returns true if Treasury <=0 and the player's team has no 
     * champions which can be withdrawn. 
     * @returns true if Treasury <=0 and the player's team has no 
     * champions which can be decommissioned. 
     */
    public boolean isDefeated(){
        
       return false;
    }
    
    /** returns the amount of money in the Treasury
     * @returns the amount of money in the Treasury
     */
    public int getMoney(){
      int money = 100;
       return money;
    }    
    
    /**Returns a String representation of all champions in reserve
     * @return a String representation of all champions in reserve
     **/
    public String getReserve(){
        
       
     
    
       return "";
    }
       
    /** Returns details of any champion with the given name
     * @return details of any champion with the given name
     **/
    public String getChampionDetails(String nme){
        
       return "";
    }
    
    /** returns whether champion is in reserve
    * @param nme is the champion's name
    * @return true if champion in reserve, false otherwise
    */
    public boolean isInReserve(String nme) {
       
      
        return false;
    }
    
 // ***************** Players Team************************   
    /** Allows a champion to be entered for the player's team, if there 
     * is enough money in the Treasury for the entry fee.The champions 
     * state is set to "active"
     * 0 if champion is entered in the player's team, 
     * 1 if champion is not in reserve, 
     * 2 if not enough money in the treasury, 
     * -1 if there is no such champion 
     * @param nme represents the name of the champion
     * @return as shown above
     **/        
    public int enterChampion(String nme){
      
        
     
       return 0;
    }
    
        
    /** Returns true if the champion with the name is in 
     * the player's team, false otherwise.
     * @param nme is the name of the champion
     * @return returns true if the champion with the name
     * is in the player's team, false otherwise.
     **/
    public boolean isInPlayersTeam(String nme){
        
       return false;
    }
    
    
    /** Removes a champion from the team to the reserves (if they are in the team)
     * Pre-condition: isChampion()
     * 0 - if champion is retired to reserves
     * 1 - if champion not retired because dead
     * 2 - if champion not retired because not in team
     * -1 - if no such champion
     * @param nme is the name of the champion
     * @return as shown above 
     **/
    public int retireChampion(String nme){
        
       return 0;
    }
        
        
    /**Returns a String representation of the champions in the player's team
     * or the message "No champions entered"
     * @return a String representation of the champions in the player's team
     **/
    public String getTeam(){
        
       return "";
    }
    
    
//**********************Challenges************************* 
    /** returns true if the number represents a challenge
     * @param num is the number of the challenge
     * @returns true if the number represents a challenge
     **/
    
     public boolean isChallenge(int num){
         
       return false;
    }
     
     
    /** Provides a String representation of an challenge given by 
     * the challenge number
     * @param num the number of the challenge
     * @return returns a String representation of a challenge given by 
     * the challenge number
     **/
    public String getChallenge(int num){
        
      
        
    return "";
    }
    
    /** Provides a String representation of all challenges 
     * @return returns a String representation of all challenges
     **/
    public String getAllChallenges(){
        
       return "";
    }
    
    /** Retrieves the challenge represented by the challenge 
     * number.Finds a champion from the team which can challenge the 
     * challenge. The results of fighting an challenge will be 
     * one of the following:  
     * 0 - challenge won, add reward to the treasury, 
     * 1 - challenge lost on battle skills  - deduct reward from
     * treasury and record champion as "dead"
     * 2 - challenge lost as no suitable champion is  available, deduct
     * the reward from treasury 
     * 3 - If a challenge is lost and player completely defeated (no money and 
     * no champions to withdraw) 
     * -1 - no such challenge 
     * @param chalNo is the number of the challenge
     * @return an int showing the result(as above) of fighting the challenge
     */ 
    public int fightChallenge(int chalNo){
        
       return 0;
    }
  
// These methods are not needed until Task 4.4
    // ***************   file write/read  *********************
    /** Writes whole game to the specified file
     * @param fname name of file storing requests
     */
    public void saveGame(String fname){
        
       
    }
    
    /** reads all information about the game from the specified file 
     * and returns a CORE reference to a Tournament object
     * @param fname name of file storing the game
     * @return the game (as a Tournament object)
     */
    public CORE loadGame(String fname){
        
       return null;
    }
    
    /**
     * reads challenges from a comma-separated textfile and stores
     * @param filename of the comma-separated textfile storing information about challenges
     */
    public void readChallenges(String filename){
    }
    
    //*************************************** Private Classes************************
        private void setupChampions(){
        Champions c1 = new Wizard("Garfunk", ChampionState.WAITING, 7, 400 , true, "transmutation");
        Champions c2 = new Wizard("Rudolf", ChampionState.WAITING , 6, 400, true, "invisibility");
        Champions c3 = new Warrior("Elbond", ChampionState.WAITING , 1, 150, "sword");
        Champions c4 = new Warrior("Flimsi", ChampionState.WAITING , 2, 200, "bow");
        Champions c5 = new Dragon("Drabina",ChampionState.WAITING, 7, 500);
        Champions c6 = new Dragon("Golum", ChampionState.WAITING, 7, 500);
        Champions c7 = new Warrior("Argon", ChampionState.WAITING, 9, 900, "mace");
        Champions c8 = new Wizard("Neon", ChampionState.WAITING, 2, 300, false, "");
        Champions c9 = new Dragon("Xenon", ChampionState.WAITING, 7, 500);
        Champions c10 = new Warrior("Atlanta", ChampionState.WAITING, 5, 500, "bow");
        Champions c11 = new Wizard ("Krypton", ChampionState.WAITING, 8, 300, false, "fireballs");
        Champions c12 = new Wizard ("Hedwig", ChampionState.WAITING, 1, 400, true, "flying");
            allChampions.add(c1);
            allChampions.add(c2);
            allChampions.add(c3);
            allChampions.add(c4);
            allChampions.add(c5);
            allChampions.add(c6);
            allChampions.add(c7);
            allChampions.add(c8);
            allChampions.add(c9);
            allChampions.add(c10);
            allChampions.add(c11);
            allChampions.add(c12);
        }
      
        
        
        private void setupChallenges(){
        Challenges ch1 = new Challenges(1, ChallengeType.MAGIC,"Borg",3,100 );
        Challenges ch2 = new Challenges(2, ChallengeType.FIGHT, "Huns",3, 120);
        Challenges ch3 = new Challenges(3, ChallengeType.MYSTERY, "Ferengi",3, 150);
        Challenges ch4 = new Challenges(4, ChallengeType.MAGIC, "Vandal",9,200);
        Challenges ch5 = new Challenges(5, ChallengeType.MYSTERY, "Borg",7,90);
        Challenges ch6 = new Challenges(6, ChallengeType.FIGHT, "Goth",8,45);
        Challenges ch7 = new Challenges(7, ChallengeType.MAGIC, "Frank",10,200);
        Challenges ch8 = new Challenges(8, ChallengeType.FIGHT, "Sith",10,170);
        Challenges ch9 = new Challenges(9, ChallengeType.MYSTERY, "Cardashian",9,300);
        Challenges ch10 = new Challenges(10, ChallengeType.FIGHT, "Jute",2,300);
        Challenges ch11 = new Challenges(11, ChallengeType.MAGIC, "Celt",2,250);
        Challenges ch12 = new Challenges(12, ChallengeType.MYSTERY, "Celt",1,250);
            allChallenges.add(ch1);
            allChallenges.add(ch2);
            allChallenges.add(ch3);
            allChallenges.add(ch4);
            allChallenges.add(ch5);
            allChallenges.add(ch6);
            allChallenges.add(ch7);
            allChallenges.add(ch8);
            allChallenges.add(ch9);
            allChallenges.add(ch10);
            allChallenges.add(ch11);
            allChallenges.add(ch12);
        }
       
        
}

