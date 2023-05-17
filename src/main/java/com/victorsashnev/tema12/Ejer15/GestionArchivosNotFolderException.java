package com.victorsashnev.tema12.Ejer15;

import java.nio.file.NoSuchFileException;

public class GestionArchivosNotFolderException extends NoSuchFileException {
    public GestionArchivosNotFolderException(String message){super(message);}
}
