package com.ignaciojgp.charactersheet.DTO;

import com.ignaciojgp.charactersheet.Characters.CharacterDefinition;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by ignacio on 11/04/17.
 */

public class Modifier implements Serializable {
    private  static  final long serialVersionUID = 30000000L;

    public UUID id;
    public String name, source;
    public CharacterDefinition.modType modType;
    public int modCharacteristic;
    public int value;
    public boolean isActive;

}
