package com.ignaciojgp.charactersheet.DTO;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by ignacio on 11/04/17.
 */

public class Spell implements Serializable {
    private  static  final long serialVersionUID = 40000000L;

    public UUID id;
    public String name, description, type;
    public int level, ammount, ammountPerDay;
    public boolean prepared;

}
