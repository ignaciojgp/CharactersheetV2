package com.ignaciojgp.charactersheet.Characters;

import com.ignaciojgp.charactersheet.DTO.Character;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by ignacio on 9/04/17.
 */

public class CharacterController {


    private static CharacterController instance;
    public static CharacterController sharedInstance(){
        if (instance == null){
            instance = new CharacterController();
        }

        return instance;
    }


    private static Character selectedCharacter;
    public static Character getSelectedCharacter() {
        return selectedCharacter;
    }

    public static void setSelectedCharacter(Character selectedCharacter) {
        CharacterController.selectedCharacter = selectedCharacter;
    }



    public ArrayList<Character> getCharacters(){

        Character c1 = CharacterDefinition.createCharacter();
        c1.name = "Nacho";
        c1.experiencePoints = 1;
        c1.id = UUID.randomUUID();
        Character c2 = CharacterDefinition.createCharacter();
        c2.name = "Bucho";
        c2.experiencePoints = 2;
        c2.id = UUID.randomUUID();
        ArrayList<Character> lista = new ArrayList<Character>();

        lista.add(c1);
        lista.add(c2);


        return  lista;

    }

}
