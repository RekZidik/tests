package com.adneom.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Project          : ADNEOM_lyazidi_rezki
 * Date             : 18/06/2017.
 * Name             : Lyazidi
 * First name       : Rezki
 * email            : lyazidi.rezki@gmail.com
 */
public class Helper {

    public static <T> List<List<T>> partition(List<T> liste, int taille){
        if (taille <= 0)
            throw new IllegalArgumentException("The 'size' argument must be greater than zero");

        List<List<T>> result = new ArrayList<List<T>>();

        if (liste.isEmpty() || liste.size() <= taille){
            result.add(liste);
            return result;
        }

        for (int i = 0; i < liste.size(); i+=taille) {
            result.add(liste.subList(i, Math.min(i+taille,  liste.size())));
        }

        return result;
    }

}
