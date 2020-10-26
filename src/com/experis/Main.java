package com.experis;

import com.experis.menu.MenuDisplayer;
import com.experis.userInteraction.UserInput;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        do {
            MenuDisplayer.displayMenuOptions();
            userInput.handleUserChoice();
        } while (userInput.getUserChoice() != 6);
            System.out.println("The program has closed successfully.");
        }
    }

