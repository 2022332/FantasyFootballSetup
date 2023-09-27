/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy.football.setup;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Ari
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        mainMenu();
        dataInput();
    }    
        
    public static void mainMenu(){
        System.out.println("Welcome to Fantasy Fotball Team \n What would you like to do?");
        Scanner myKB = new Scanner(System.in);
        System.out.println("1. Intialise the Program. \n 2. See the Performance of a Team.");
        String option = myKB.nextLine();
        int optionNum = Integer.parseInt(option);
        if (optionNum == 1){
            System.out.println("You chose to initialise the program.");
        }
        else if (optionNum == 2){   
            System.out.println("You chose to see the performance of team.");
        }
    }
    public static void dataInput() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData2.csv")); // Comma Separated Values
        String line;
        while ((line = br.readLine()) != null) {
            
            String[] playerData = line.split(",");
            System.out.println(playerData[0]);
            if (playerData[4].equals("Forward")) {
                Forward player = new Forward(0, playerData[0], playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
            }
        }
    }
}
        

    

        
