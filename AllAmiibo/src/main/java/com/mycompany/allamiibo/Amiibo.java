/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.allamiibo;
import java.util.ArrayList;
import java.net.*;

/**
 *
 * @author Edwar
 */
public class Amiibo {
    private String amiiboSeries; //field that holds series of amiibo the amiibo is a part of
    private String character; //field that holds character this amiibo represents
    private String gameSeries; //field that holds what game series this amiibo is a part of
    private String image; //field that holds image url of amiibo
    private String name; //field that holds name of amiibo
    private String type; //field that holds what type of amiibo this amiibo is (figure, card, etc.)
    
    public Amiibo (String amiiboSeries, String character, String gameSeries, String image, String name, String type){
        this.amiiboSeries = amiiboSeries;
        this.character = character;
        this.gameSeries = gameSeries;
        this.image = image;
        this.name = name;
        this.type = type;
    }
    
    public String getName(){ //gets name of amiibo
        return this.name;
    }
    
    public String getAmiiboSeries(){ //gets amiibo series of amiibos
        return this.amiiboSeries;
    }
    
    public String getGameSeries(){ //gets game series amiibo is a part of
        return this.gameSeries;
    }
    
    public String getImage(){ //gets image url of amiibo
        return this.image;
    }
    
    public String getType(){ //gets type of amiibo this amiibo is
        return this.type;
    }
    
    public String getCharacter(){ //gets character amiibo represents
        return this.character;
    }
    
    public String getInfo(){ //gets description of amiibo that includes fields
        return getName() + ": This amiibo is from the " + getGameSeries() + " series of games, released as part of the " + getAmiiboSeries() + " amiibo series as a " + getType() + " amiibo. This amiibo is a variation of the " + getCharacter() + " amiibo(s).";
    }
    
    public static void main(String[] args) {
        
    }
}
