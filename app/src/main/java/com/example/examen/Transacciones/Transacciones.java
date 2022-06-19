package com.example.examen.Transacciones;

public class Transacciones {
    //partimos de crear las tablas
    public  static  final String tablacontactos = "Contactos";
    public  static  final String tablapaises = "Paises";
    // luego creamos los campos de las tabla
    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombre = "nombre";
    public static final String telefono = "telefono";
    public static final String nota = "nota";
    public static final String idpais = "idpais";

    // Creamos la tabla con su campos respectivos (Contactos).
    public static final String CreateTableContactos = "CREATE TABLE Contactos( id INTEGER PRIMARY KEY AUTOINCREMENT, pais TEXT, nombre TEXT, telefono INTEGER," +
            "nota TEXT)";

    // Si es necesario la elminacion de la tabla
    public static final String DropTableContactos = "DROP TABLE IF EXISTS Contactos";

    //Creamos la tabla con su campos respectivos (Paises).
    public static final String CreateTablePaises = "CREATE TABLE Paises( id INTEGER PRIMARY KEY AUTOINCREMENT, idpais TEXT, pais TEXT )";

    public static final String DropTablePaises = "DROP TABLE IF EXISTS Paises";

    // Creamos nuestra base de datos.
    public static final String NameDataBase = "PM01E18124";
}
