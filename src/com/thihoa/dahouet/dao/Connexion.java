package com.thihoa.dahouet.dao;
import java.sql.*;


public class Connexion {
    
    
    String urlPilote = "com.mysql.jdbc.Driver";  // Chemin pour charger le pilote
   // pour une connexion ou importer bdd d'heidiSql à Netbeans 
    String urlBaseDonnees= "jdbc:mysql://localhost:3306/bdddahouet"; //chemin de coonnexion à la base de données
    
    // String urlBaseDonnees= "jdbc:derby://localhost:1527/Voilier"; // connection à la bdd APP.VOILIER créer dans netbeans
    
    Connection con;     //Objet "con", c'est cette objet que nous allons appelé pour manipuler les données de la BDD
    public Object ObtenirConnexion;

  
//Constructeur de la classe
public Connexion (){
      
//Chargement de notre pilote
    try {
    Class.forName("jdbc:mysql://localhost:3306/bdddahouet");//Syntaxe pour charger notre pilote
    System.out.println ("Chargement du pilote réussie");
}
    catch(ClassNotFoundException ex) {
    System.out.println (ex);

}
//Connexion à la base de données
    try {
    // "con" c'est lui qu'on va appeler à chaque fois que nous allons vouloir manipuler les données qui se rtouvent dans la bdd 
    con=DriverManager.getConnection(urlBaseDonnees, "root", ""); //lien à la base de données, root = utilisateur et "" =pas de mdp
    System.out.println ("Connexion à la base de données réussie");
}
    catch (SQLException ex){
    System.out.println(ex);
}
}
// Méthode qui va nous retourner cette connexion
public Connection ObtenirConnexion(){
    return con;
}
}