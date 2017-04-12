package com.ignaciojgp.charactersheet.DTO;

import com.ignaciojgp.charactersheet.Characters.CharacterDefinition;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by ignacio on 11/04/17.
 */

public class Class implements Serializable{
    private  static  final long serialVersionUID = 20000000L;

    public UUID id;
    public String name;
    public CharacterDefinition.savingThrowsValues Fortitude, Reflex, Will;
    public CharacterDefinition.attackType baseAttack;
    public int hitdice, pointsperlevel, level;



}
