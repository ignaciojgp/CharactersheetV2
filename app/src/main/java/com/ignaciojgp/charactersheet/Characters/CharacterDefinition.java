package com.ignaciojgp.charactersheet.Characters;

import com.ignaciojgp.charactersheet.DTO.Character;
import com.ignaciojgp.charactersheet.DTO.Class;
import com.ignaciojgp.charactersheet.DTO.Modifier;
import com.ignaciojgp.charactersheet.DTO.Skill;
import com.ignaciojgp.charactersheet.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by ignacio on 9/04/17.
 */

public class CharacterDefinition {

    public static enum ability{
        STR, DEX, CON, INT, WIS, CHA
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

    public static enum characterSkills  {
        appraise,
        autohypnosis,
        balance,
        bluff,
        climb,
        concentration,
        controlShape,
        craft,
        decipherScript,
        diplomacy,
        disableDevice,
        disguise,
        escapeArtist,
        forgery,
        gatherInformation,
        handleAnimal,
        heal,
        hide,
        intimidate,
        jump,
        knowledge,
        listen,
        moveSilently,
        openLock,
        perform,
        psicraft,
        profession,
        ride,
        search,
        senseMotive,
        sleightOfHand,
        speakLanguage,
        spellcraft,
        spot,
        survival,
        swim,
        tumble,
        useMagicDevice,
        usePsionicDevice,
        useRope,
        knowledgeArcana,
        knowledgeDungeoneering,
        knowledgeEngineering,
        knowledgeGeography,
        knowledgeHistory,
        knowledgeLocal,
        knowledgeNature,
        knowledgeNobility,
        knowledgePlanes,
        knowledgeReligion
    };

    public static final Map<characterSkills, ability> skillAbilitesMap;
    static
    {
        skillAbilitesMap = new HashMap<characterSkills, ability>();

        skillAbilitesMap.put(characterSkills.appraise,ability.INT);
        skillAbilitesMap.put(characterSkills.autohypnosis,ability.INT);
        skillAbilitesMap.put(characterSkills.balance,ability.DEX );
        skillAbilitesMap.put(characterSkills.bluff,ability.CHA );
        skillAbilitesMap.put(characterSkills.climb,ability.STR );
        skillAbilitesMap.put(characterSkills.concentration,ability.CON);
        skillAbilitesMap.put(characterSkills.controlShape,ability.WIS);
        skillAbilitesMap.put(characterSkills.craft,ability.INT);
        skillAbilitesMap.put(characterSkills.decipherScript,ability.INT);
        skillAbilitesMap.put(characterSkills.diplomacy,ability.CHA );
        skillAbilitesMap.put(characterSkills.disableDevice,ability.INT);
        skillAbilitesMap.put(characterSkills.disguise,ability.CHA );
        skillAbilitesMap.put(characterSkills.escapeArtist,ability.DEX );
        skillAbilitesMap.put(characterSkills.forgery,ability.INT);
        skillAbilitesMap.put(characterSkills.gatherInformation,ability.CHA );
        skillAbilitesMap.put(characterSkills.handleAnimal,ability.CHA );
        skillAbilitesMap.put(characterSkills.heal,ability.WIS );
        skillAbilitesMap.put(characterSkills.hide,ability.DEX);
        skillAbilitesMap.put(characterSkills.intimidate,ability.CHA);
        skillAbilitesMap.put(characterSkills.jump,ability.STR);
        skillAbilitesMap.put(characterSkills.knowledge,ability.INT);
        skillAbilitesMap.put(characterSkills.listen,ability.WIS);
        skillAbilitesMap.put(characterSkills.moveSilently,ability.DEX);
        skillAbilitesMap.put(characterSkills.openLock,ability.DEX);
        skillAbilitesMap.put(characterSkills.perform,ability.CHA);
        skillAbilitesMap.put(characterSkills.psicraft,ability.INT);
        skillAbilitesMap.put(characterSkills.profession,ability.WIS);
        skillAbilitesMap.put(characterSkills.ride,ability.STR);
        skillAbilitesMap.put(characterSkills.search,ability.INT);
        skillAbilitesMap.put(characterSkills.senseMotive,ability.WIS);
        skillAbilitesMap.put(characterSkills.sleightOfHand,ability.DEX);
        skillAbilitesMap.put(characterSkills.speakLanguage,ability.INT);
        skillAbilitesMap.put(characterSkills.spellcraft,ability.INT);
        skillAbilitesMap.put(characterSkills.spot,ability.WIS);
        skillAbilitesMap.put(characterSkills.survival,ability.WIS);
        skillAbilitesMap.put(characterSkills.swim,ability.STR);
        skillAbilitesMap.put(characterSkills.tumble,ability.DEX);
        skillAbilitesMap.put(characterSkills.useMagicDevice,ability.CHA);
        skillAbilitesMap.put(characterSkills.usePsionicDevice,ability.CHA);
        skillAbilitesMap.put(characterSkills.useRope,ability.DEX);
        skillAbilitesMap.put(characterSkills.knowledgeArcana,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeDungeoneering,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeEngineering,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeGeography,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeHistory,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeLocal,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeNature,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeNobility,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgePlanes,ability.INT);
        skillAbilitesMap.put(characterSkills.knowledgeReligion,ability.INT);
    }

    public static final Map<characterSkills, Integer> skillTextMap;
    static
    {
        skillTextMap = new HashMap<characterSkills, Integer>();

        skillTextMap.put(characterSkills.appraise,R.string.appraise);
        skillTextMap.put(characterSkills.autohypnosis,R.string.autohypnosis);
        skillTextMap.put(characterSkills.balance,R.string.balance);
        skillTextMap.put(characterSkills.bluff,R.string.bluff);
        skillTextMap.put(characterSkills.climb,R.string.climb);
        skillTextMap.put(characterSkills.concentration,R.string.concentration);
        skillTextMap.put(characterSkills.controlShape,R.string.control_shape);
        skillTextMap.put(characterSkills.craft,R.string.craft);
        skillTextMap.put(characterSkills.decipherScript,R.string.decipher_script);
        skillTextMap.put(characterSkills.diplomacy,R.string.diplomacy);
        skillTextMap.put(characterSkills.disableDevice,R.string.disable_device);
        skillTextMap.put(characterSkills.disguise,R.string.disguise);
        skillTextMap.put(characterSkills.escapeArtist,R.string.escape_artist);
        skillTextMap.put(characterSkills.forgery,R.string.forgery);
        skillTextMap.put(characterSkills.gatherInformation,R.string.gather_information);
        skillTextMap.put(characterSkills.handleAnimal,R.string.handle_animal);
        skillTextMap.put(characterSkills.heal,R.string.heal);
        skillTextMap.put(characterSkills.hide,R.string.hide);
        skillTextMap.put(characterSkills.intimidate,R.string.intimidate);
        skillTextMap.put(characterSkills.jump,R.string.jump);
        skillTextMap.put(characterSkills.knowledge,R.string.knowledge);
        skillTextMap.put(characterSkills.listen,R.string.listen);
        skillTextMap.put(characterSkills.moveSilently,R.string.move_silently);
        skillTextMap.put(characterSkills.openLock,R.string.open_lock);
        skillTextMap.put(characterSkills.perform,R.string.perform);
        skillTextMap.put(characterSkills.psicraft,R.string.psicraft);
        skillTextMap.put(characterSkills.profession,R.string.profession);
        skillTextMap.put(characterSkills.ride,R.string.ride);
        skillTextMap.put(characterSkills.search,R.string.search);
        skillTextMap.put(characterSkills.senseMotive,R.string.sense_motive);
        skillTextMap.put(characterSkills.sleightOfHand,R.string.sleight_of_hand);
        skillTextMap.put(characterSkills.speakLanguage,R.string.speak_language);
        skillTextMap.put(characterSkills.spellcraft,R.string.spellcraft);
        skillTextMap.put(characterSkills.spot,R.string.spot);
        skillTextMap.put(characterSkills.survival,R.string.survival);
        skillTextMap.put(characterSkills.swim,R.string.swim);
        skillTextMap.put(characterSkills.tumble,R.string.tumble);
        skillTextMap.put(characterSkills.useMagicDevice,R.string.use_magic_device);
        skillTextMap.put(characterSkills.usePsionicDevice,R.string.use_psionic_device);
        skillTextMap.put(characterSkills.useRope,R.string.use_rope);
        skillTextMap.put(characterSkills.knowledgeArcana,R.string.knowledge_arcana);
        skillTextMap.put(characterSkills.knowledgeDungeoneering,R.string.knowledge_dungeoneering);
        skillTextMap.put(characterSkills.knowledgeEngineering,R.string.knowledge_engineering);
        skillTextMap.put(characterSkills.knowledgeGeography,R.string.knowledge_geography);
        skillTextMap.put(characterSkills.knowledgeHistory,R.string.knowledge_history);
        skillTextMap.put(characterSkills.knowledgeLocal,R.string.knowledge_local);
        skillTextMap.put(characterSkills.knowledgeNature,R.string.knowledge_nature);
        skillTextMap.put(characterSkills.knowledgeNobility,R.string.knowledge_nobility);
        skillTextMap.put(characterSkills.knowledgePlanes,R.string.knowledge_planes);
        skillTextMap.put(characterSkills.knowledgeReligion,R.string.knowledge_religion);
    }

    public static characterSkills[] armorAffectedSkills = {
            characterSkills.balance,
            characterSkills.climb,
            characterSkills.escapeArtist,
            characterSkills.hide,
            characterSkills.jump,
            characterSkills.moveSilently,
            characterSkills.sleightOfHand,
            characterSkills.swim,
            characterSkills.tumble
    };



    public static Character createCharacter(){

        Character c = new Character();

        c.id = UUID.randomUUID();
        c.name = "Unnamed";
        c.race = "unknown race";
        c.gear = "";
        c.feats = "";
        c.specialAbilities = "";
        c.languages = "common";
        c.damage = 0;
        c.hp = 0;
        c.speed = 30;
        c.damageReduction = 0;
        c.experiencePoints = 0;
        c.spellSave = 0;
        c.arcaneSpellFailure = 0;


        //init for skills
        c.skillsValues = new HashMap<characterSkills, Skill>();

        for (characterSkills skill: CharacterDefinition.characterSkills.values()) {

            Skill s = new Skill();
            s.points = 0;
            s.trained = false;

            c.skillsValues.put( skill, s );
        }

        //init for classes
        Class firstC = new Class();
        firstC.baseAttack = attackType.BAD;
        firstC.Fortitude = savingThrowsValues.BAD;
        firstC.Reflex = savingThrowsValues.BAD;
        firstC.Will = savingThrowsValues.BAD;
        firstC.hitdice = 4;
        firstC.id = UUID.randomUUID();
        firstC.level = 1;
        firstC.name = "Unnamed class";
        firstC.pointsperlevel = 2;

        c.classes = new ArrayList<Class>();
        c.classes.add( firstC );

        //init for mods
        c.mods = new ArrayList<Modifier>();


        return c;


    }

}
