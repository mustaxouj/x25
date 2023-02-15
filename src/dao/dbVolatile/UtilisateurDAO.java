package dao.dbVolatile;

import java.util.List;

import dao.IUtilisateurDAO;
import presentation.modele.Admin;
import presentation.modele.Banque;
import presentation.modele.Client;
import presentation.modele.Utilisateur;

public class UtilisateurDAO implements IUtilisateurDAO {

    Banque banque;

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Banque getBanque() {
        return banque;
    }

    public UtilisateurDAO() {
    }

    public UtilisateurDAO(Banque banque) {
        this.banque = banque;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }

    @Override
    public Utilisateur findById(Long aLong) {
        return null;
    }

    /**
     * @param liste
     * @return
     */
    @Override
    public List<Utilisateur> saveAll(List<Utilisateur> liste) {
        return null;
    }

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public Utilisateur update(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public Boolean delete(Long aLong) {
        return false;
    }

    /**
     * @param client
     * @return
     */
    @Override
    public Boolean delete(Client client) {
        return null;
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public Boolean deleteById(Long aLong) {
        return null;
    }

    @Override
    public Utilisateur findByLoginAndPass(String login, String pass) {

        Utilisateur user = null;

        Admin admin = Admin.getInstance();

        if (admin.getLogin().equals(login) && admin.getMotDePasse().equals(pass))
            user = admin;
        else {
            user = banque.getClientsDeBanque().stream().filter(client -> {
                return client.getLogin().equals(login) && client.getMotDePasse().equals(pass);
            }).findFirst().orElse(null);
        }
        return user;
    }
}
