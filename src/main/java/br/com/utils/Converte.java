package br.com.utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Converte {

    public static String jsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
