package presentation.controleur;

import java.util.Scanner;

import metier.authentification.IAuth;
import metier.authentification.Auth;
import presentation.modele.Banque;

public class MaBanque {
    public static IAuth loginService;

    public static void main(String[] args) {

        Banque maBanque = new Banque("BP", "Hassan Rabat", "212535224433", "bp@banquePop.ma");

        Scanner clavier = new Scanner(System.in);
        // loginService = new Auth(maBanque, clavier);
        loginService = new Auth(maBanque);
        loginService.seConnecter();

        clavier.close();

    }

}
