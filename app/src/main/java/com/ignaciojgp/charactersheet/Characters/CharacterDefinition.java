package com.ignaciojgp.charactersheet.Characters;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by ignacio on 9/04/17.
 */

public class CharacterDefinition {

    public static enum ability{
        FRZ, DES, CON, INT, SAB, CAR
    };
    public static enum savingThrows {
        FORTITUDE, REFLEX, WILL
    };
    public static enum savingThrowsValues {
        GOOD, BAD
    };
    public static enum attackType {
        GOOD, REGULAR, BAD
    };
    public static enum modType{
        ABILITY, SAVING_THROW, SKILL, CA, CHARACTERISTIC
    };
    public static enum moneyKind{
        PPT, PO, PP, PC
    };

    public static int[][] baseSaving = {
        {0,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12},
        {0,0,0,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6}
    };

    public static int[][] baseAttack = {
        {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 },
        {0,0,1,2,3,3,4,5,6,6,7,8,9,9,10,11,12,12,13,14,15 },
        {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10}
    };

    public static String[] skills = {
        "appraise",
        "autohypnosis",
        "balance",
        "bluff",
        "climb",
        "concentration",
        "controlShape",
        "craft",
        "decipherScript",
        "diplomacy",
        "disableDevice",
        "disguise",
        "escapeArtist",
        "forgery",
        "gatherInformation",
        "handleAnimal",
        "heal",
        "hide",
        "intimidate",
        "jump",
        "knowledge",
        "listen",
        "moveSilently",
        "openLock",
        "perform",
        "psicraft",
        "profession",
        "ride",
        "search",
        "senseMotive",
        "sleightOfHand",
        "speakLanguage",
        "spellcraft",
        "spot",
        "survival",
        "swim",
        "tumble",
        "useMagicDevice",
        "usePsionicDevice",
        "useRope",
        "knowledgeArcana",
        "knowledgeDungeoneering",
        "knowledgeEngineering",
        "knowledgeGeography",
        "knowledgeHistory",
        "knowledgeLocal",
        "knowledgeNature",
        "knowledgeNobility",
        "knowledgePlanes",
        "knowledgeReligion"
    };

    public static String[] armorAffectedSkills = {
        "balance",
        "climb",
        "escapeArtist",
        "hide",
        "jump",
        "moveSilently",
        "sleightOfHand",
        "swim",
        "tumble"
    };


    public String id = UUID.randomUUID().toString();;
    public String name;
    public int nivel;

}
