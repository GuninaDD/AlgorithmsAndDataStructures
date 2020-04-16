package com.geekbrains.lesson5.sample;

import com.geekbrains.lesson5.sample.game.Assasin;
import com.geekbrains.lesson5.sample.game.Doctor;
import com.geekbrains.lesson5.sample.game.Hero;
import com.geekbrains.lesson5.sample.game.Warrior;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.awt.*;
import java.util.Random;

public class Controller {
    @FXML
    TextArea team1;

    @FXML
    TextArea team2;

    @FXML
    TextArea result;

    @FXML
    ChoiceBox team1_list;

    @FXML
    ChoiceBox team2_list;

    @FXML
    Button btn_go;

    @FXML
    Button btn_repeat;

    public void setChoices(){

    }

    public void game(){
        Random randomStep = new Random();
        Random randomHealing = new Random();
        int round = 3;

        Hero[] team1 = new Hero[]{new Warrior(250, "Тигрил", 50, 0)
                , new Assasin(150, "Акали", 70, 0)
                , new Doctor(120, "Жанна", 0, 60)};


        Hero[] team2 = new Hero[]{new Warrior(290, "Минотавр", 60, 0)
                , new Assasin(160, "Джинкс", 90, 0)
                , new Doctor(110, "Зои", 0, 80)};

        team1_list.getItems().setAll(team1);
        team2_list.getItems().setAll(team2);


        for (int j = 0; j < round; j++) {
            for (int i = 0; i < team1.length; i++) {
                if(randomStep.nextInt(2) == 0) {
                    if(team1[i] instanceof Doctor) {
                        team1[i].healing(team1[randomHealing.nextInt(2)]);
                    } else {
                        team1[i].hit(team2[i]);
                    }
                } else {
                    if(team2[i] instanceof Doctor) {
                        team2[i].healing(team2[randomHealing.nextInt(2)]);
                    } else {
                        team2[i].hit(team1[i]);
                    }
                }
            }
        }

        System.out.println("---------------");

        for (Hero t1: team1) {
            t1.info();
        }

        for (Hero t2: team2) {
            t2.info();
        }
    }

}
