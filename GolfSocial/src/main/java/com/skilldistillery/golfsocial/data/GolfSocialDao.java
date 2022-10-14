package com.skilldistillery.golfsocial.data;

import java.util.List;

import com.skilldistillery.golfsocial.entities.Player;

public interface GolfSocialDao {
	
	List<Player> findAll();
	Player findById(int playerId);
	Player createPlayer(Player player);
	Player updatePlayer(int playerId, Player player);
	boolean deletePlayer(int playerId);

}
