/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playerproject;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Arman
 */
public class Player {
    String _player;
    int _number;
    
public Player(String player, int number) {
    _player = player;
    _number = number;
}
public String getName() {
        return _player;
    }

 public int getNumber() {
        return _number;
        
    }
}
