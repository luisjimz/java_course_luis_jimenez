package com.course;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;


public class FileStorageService implements StorageService {

    public FileStorageService(){
    }

    @Override
    public File CargarDatos() {
        File miArchivo = new File("C:\\Test\\catalogo.txt");
        return miArchivo;
    }

    public void read(File miArchivo) {

        if(miArchivo != null){
            List<String> list = new ArrayList<>();
            try {
                BufferedReader lector = new BufferedReader(new FileReader(miArchivo));
                String stream = null;

                while((stream = lector.readLine()) != null){
                    list.add(stream);
                }
                System.out.println(list);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Archivo es nulo");
            return;
        }
    }





}
