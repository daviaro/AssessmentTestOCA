/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daviaro.punto7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class HandleList {

    public static void main(String[] args) {
        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.add(array[1]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }

}
