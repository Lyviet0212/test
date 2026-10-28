package com.example.christmassong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class christmasong extends Application {

    @Override
    public void start(Stage primaryStage) {
        StringBuilder song = new StringBuilder();

        for (int day = 1; day <= 12; day++) {

            String suffix;
            switch (day) {
                case 1:  suffix = "1st"; break;
                case 2:  suffix = "2nd"; break;
                case 3:  suffix = "3rd"; break;
                default: suffix = day + "th"; break;
            }
            song.append("On the ").append(suffix).append(" day of Christmas my true love gave to me\n");

            switch (day) {
                case 12: song.append("Twelve drummers drumming,\n");
                case 11: song.append("Eleven pipers piping,\n");
                case 10: song.append("Ten lords a-leaping,\n");
                case 9:  song.append("Nine ladies dancing,\n");
                case 8:  song.append("Eight maids a-milking,\n");
                case 7:  song.append("Seven swans a-swimming,\n");
                case 6:  song.append("Six geese a-laying,\n");
                case 5:  song.append("Five golden rings,\n");
                case 4:  song.append("Four calling birds,\n");
                case 3:  song.append("Three French hens,\n");
                case 2:  song.append("Two turtle doves, and\n");
                case 1:  song.append("A partridge in a pear tree.\n");
            }
            song.append("\n");
        }

        TextArea textArea = new TextArea(song.toString());
        textArea.setEditable(false);

        StackPane root = new StackPane(textArea);
        Scene scene = new Scene(root, 450, 500);

        primaryStage.setTitle("12 Days of Christmas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
