package com.ignaciojgp.charactersheet.DTO;

import com.ignaciojgp.charactersheet.Characters.CharacterDefinition;

import java.io.Serializable;

/**
 * Created by ignacio on 11/04/17.
 */

public class Skill implements Serializable{
    private  static  final long serialVersionUID = 50000000L;
    public String id;
    public int points;
    public CharacterDefinition.ability ability;
    public boolean trained;
}
