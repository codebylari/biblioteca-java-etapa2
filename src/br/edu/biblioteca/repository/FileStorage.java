package br.edu.biblioteca.repository;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {

    public void salvar(String arquivo, String conteudo) {

        try(FileWriter writer = new FileWriter(arquivo, true)) {

            writer.write(conteudo + "\n");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}