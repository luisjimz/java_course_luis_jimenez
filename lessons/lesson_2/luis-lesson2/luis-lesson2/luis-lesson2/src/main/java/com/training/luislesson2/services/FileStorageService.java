package com.training.luislesson2.services;

import jdk.internal.org.jline.utils.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FileStorageService implements StorageService {

    private static final Logger LOG = LoggerFactory.getLogger(FileStorageService.class);

    private File getFile(){
        return new File("storageSomething.txt");
    }

    @Override
    public void save(String text) {
        LOG.debug("saved method called with text: " + text);
        File file = getFile();

        try{
            FileUtils.writeStringToFile(file, text, Charset.defaultCharset());
            LOG.debug("save method completed succesfully");
        }
        catch (IOException e){
            Log.error(e.getMessage());
        }
    }

    @Override
    public String load() {
        LOG.debug("load method called");
        File file = getFile();
        try{
            String text = FileUtils.readFileToString(file, Charset.defaultCharset());
            LOG.trace("Load method completed succesfully");
            return text;
        }
        catch(IOException e){
            LOG.warn(e.getMessage());
            return "";
        }
    }
}
