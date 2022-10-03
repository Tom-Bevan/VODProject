package Implementation;

import Interface.ConnectionInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, InterruptedException, RemoteException {
        Registry reg = LocateRegistry.getRegistry("127.0.0.1",2001);

        ConnectionInterface connection =  (ConnectionInterface)reg.lookup("ClientConnection");


    }
    /*
            void stream([]bytes chunck);
    The Flow
	1. Le client s'inscrit (si besoin).
            2. Le client se connecte pour récupérer le service de VOD.
            3. Le client appelle viewCatalog() pour récupérer les descriptions des films. (On suppose que le serveur se lance avec un catalogue
    de films prédéfini, et pour chaque film , une description de la classe MovieDesc).
    Pour ceux intéressés par faire le bonus:
    on suppose que dans le catalogue, (certains) des films disposent également d'une description selon MovieDescExtended.
            4. Il affiche dans la console la liste des films : pour cela il affiche
    le synopsis, et, si c'est un MovieDescExtended, il joue (automatiquement) la bande-annonce,
    et propose à l'utilisateur de choisir un film
            5. Quand un film est sélectionné dans la console coté client, le client appelle playMovie(...):
            5a. Le serveur envoie le premier bloc du film, en appellant la méthode stream(...) du client, lui fournissant le début du film (qui
    sera affiché sur la sortie standard coté client).
            5b. Le serveur lance un thread localement pour continuer à streamer les autres blocs les uns à la suite des autres, appelant stream(...)
		5c. Le serveur renvoie la facture en guise de return de la méthode playMovie.*/
}