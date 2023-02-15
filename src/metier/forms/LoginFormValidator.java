package metier.forms;

import java.util.HashMap;
import java.util.Map;

import dao.IUtilisateurDAO;
import dao.dbVolatile.UtilisateurDAO;
import metier.Colors;
import metier.InteractiveConsole;
import presentation.modele.Admin;
import presentation.modele.Banque;
import presentation.modele.Client;
import presentation.modele.Utilisateur;

public class LoginFormValidator implements InteractiveConsole, Colors {

    private static final String FIELD_LOGIN = " login", FIELD_PASS = "pass";

    private Map<String, String> errors = new HashMap<>();
    private String resultMsg;
    private IUtilisateurDAO userDao;

    public LoginFormValidator() {
    }

    public LoginFormValidator(IUtilisateurDAO dao) {

        this.userDao = dao;
    }

    public Map<String, String> Errors() {
        return errors;
    }

    public void setError(String fieldName, String errorMsg) {
        Errors().put(fieldName, errorMsg);
    }

    public String ResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public IUtilisateurDAO getUserDao() {
        return userDao;
    }

    public void setUserDao(IUtilisateurDAO userDao) {
        this.userDao = userDao;
    }

    // fonctions de verification
    private void verifierLogin(String login) throws FormException {
        if (login != null && login.trim().length() != 0) {
            if (login.trim().length() < 4)
                throw new FormException("Login must have moe than 4 chars !!!");
        } else {
            throw new FormException("Login is Required !!!");
        }
    }

    private void verifierPass(String pass) throws FormException {
        if (pass != null && pass.trim().length() != 0) {
            if (pass.trim().length() < 4)
                throw new FormException("Password must have moe than 4 chars !!!");
        } else {
            throw new FormException("Password is Required !!!");
        }
    }

    // fonctions de validation
    private void validerLogin(String login) {

        try {
            verifierLogin(login);

        } catch (FormException e) {
            setError(FIELD_LOGIN, e.getMessage());
        }
    }

    private void validerPass(String pass) {

        try {
            verifierPass(pass);

        } catch (FormException e) {
            setError(FIELD_PASS, e.getMessage());
        }
    }

    // fonction de validation de formulaire
    public Utilisateur validerSession(String login, String password) {

        errors.clear();
        Utilisateur session = null;

        validerLogin(login);
        validerPass(password);

        if (Errors().isEmpty()) {

            session = userDao.findByLoginAndPass(login, password);
            if (session != null) {
                if (session instanceof Admin)
                    setResultMsg("Successfully Connected [ADMIN] " + session.getNomComplet());
                else if (session instanceof Client) {
                    setResultMsg("Successfully Connected [CLIENT] " + session.getNomComplet());
                }
            }

            else {
                setResultMsg("Connection Failed :( ");
            }
        }

        return session;
    }

    public static void main(String[] args) {

        LoginFormValidator form = new LoginFormValidator(new UtilisateurDAO(new Banque()));
        Utilisateur session = null;

        do {
            System.out.println(BLUE);
            System.out.print("=> Login       :");
            String login = clavier.nextLine();
            System.out.println();
            System.out.print("=> pass        :");
            String pass = clavier.nextLine();
            System.out.println();
            System.out.println(BLACK);

            session = form.validerSession(login, pass);

            if (session == null) {
                if (form.Errors().isEmpty()) {
                    System.out.println(RED + form.ResultMsg());
                    System.out.println(BLACK);
                } else {
                    form.Errors().forEach((field, errMsg) -> {
                        System.out.println(RED + errMsg);
                    });
                    System.out.println(BLACK);
                }

            } else {
                System.out.println(YELLOW_BOLD + form.ResultMsg());
                System.out.println(BLACK);
            }

        } while (session == null);

    }
}
