package com.skilldistillery.golfsocial.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.golfsocial.entities.Player;

@Service
@Transactional
public class GolfSocialDaoImpl implements GolfSocialDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Player> findAll() {
		String jpql = "SELECT player FROM Player player";
		return em.createQuery(jpql, Player.class).getResultList();
		 
	}

	@Override
	public Player findById(int playerId) {
		String jpql = "SELECT player from Player player WHERE player.id = :id";
		
		return em.createQuery(jpql, Player.class).getSingleResult();
	}

	@Override
	public Player createPlayer(Player player) {
		em.persist(player);
		return player;
	}

	@Override
	public Player updatePlayer(int playerId, Player player) {
		player = em.find(Player.class, playerId);
		if(player != null) {
			player.setFirstName(player.getFirstName());
			player.setLastName(player.getLastName());
			player.setHandicap(player.getHandicap());
			player.setCity(player.getCity());
			player.setState(player.getState());
			em.persist(player);
		}
		return player;
	}

	@Override
	public boolean deletePlayer(int playerId) {
        Player deletePlayer = em.find(Player.class, playerId); //find player we're deleting
        if (deletePlayer != null) { //if player exists
            em.remove(deletePlayer); //removes player from database
        }
        return em.contains(deletePlayer); //returns true if delete player is still in persistence mngr
        //returns false if not
    }

}
