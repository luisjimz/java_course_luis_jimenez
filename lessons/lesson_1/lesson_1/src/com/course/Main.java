package com.course;

import java.io.File;

public class Main {

    public static void main(String[] args){
        FileStorageService x = new FileStorageService();
        File datos = x.CargarDatos();
        x.read(datos);
    }
}
