package com.skilldistillery.golfsocial.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JPASocialTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Player player1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAGolfSocial");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		player1 = em.find(Player.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		player1= null;
	}

	@Test
	void test_Player_mapping() {
		assertNotNull(player1);
		assertEquals("Ruben", player1.getFirstName());
		assertEquals("Rocha", player1.getLastName());
		assertEquals("11", player1.getHandicap());
		assertEquals("Denver", player1.getCity());
		assertEquals("Colorado", player1.getState());
	}

}
