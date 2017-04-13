package com.ignaciojgp.charactersheet.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

import static com.ignaciojgp.charactersheet.Characters.CharacterDefinition.characterSkills;

/**
 * Created by ignacio on 11/04/17.
 */

public class Character implements Serializable {
    private  static  final long serialVersionUID = 10000000L;

    public UUID id;

    public String name, race, gear, feats, specialAbilities, languages;

    public int damage, hp, speed, damageReduction, experiencePoints, spellSave, arcaneSpellFailure;
    public int[] staticsValues = new int[6];

    public Map<characterSkills,Skill> skillsValues;

    public ArrayList<Class> classes;
    public ArrayList<Modifier> mods;

    public int[] money = new int[4];




}
