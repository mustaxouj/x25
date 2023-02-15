package dao.dbFiles;

import java.util.List;

import dao.IUtilisateurDAO;
import presentation.modele.Client;
import presentation.modele.Utilisateur;

public class UtilisateurDAOFile implements IUtilisateurDAO {

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
        return null;
    }
}
