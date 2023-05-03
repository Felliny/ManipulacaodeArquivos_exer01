package View;

import Controller.LerArquivo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LerArquivo lerArquivo= new LerArquivo();
        String path= "D:\\TEMP";
        String name= "generic_food.csv";

        try {
            lerArquivo.readFile(path, name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
