package it.softwareinside.squadra;

public class Team {
	private Player[] players;
	private Allenatore allenatore;
	private String nome;
	private int numeroTrofei;

	public Team(String nome, int numeroTrofei, Allenatore allenatore) {
		setNome(nome);
		setAllenatore(allenatore);
		setNumeroTrofei(numeroTrofei);
		setPlayers(new Player[11]);
	}

	public Team() {
		this("Default Team", 0, new Allenatore());
		//setPlayers(new Player[11]);
	}

	public void stampaPlayer() {
		for (Player player : players)
			System.out.println(player);
		
		System.out.println("Allenatore: " + allenatore);
	}

	public boolean addPlayer(Player player) {
		if (player == null)
			return false;

		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				players[i] = player;
				return true;
			}

		}
		return false;
	}
	
	public Player removePlayer(int index) {
		if(index < 0 || index >= players.length)
			return null;
		
		Player giocatoreRimosso = players[index];
		
		players[index] = null;
		
		return giocatoreRimosso;
	}

	@Override
	public String toString() {
		String ris = "";
		
		for(Player player : players)
			ris += player + "\n";

		return "Nome: " + nome + " Numero Trofei: " + numeroTrofei + " Allenatore: " + allenatore + " Giocatori: "
				+ ris;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAllenatore(Allenatore allenatore) {
		this.allenatore = allenatore;
	}

	public void setPlayers(Player[] players) {
		if(players.length == 11)
			this.players = players;
	}

	public void setNumeroTrofei(int numeroTrofei) {
		if(numeroTrofei > this.numeroTrofei)
			this.numeroTrofei = numeroTrofei;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroTrofei() {
		return numeroTrofei;
	}

	public Player[] getPlayers() {
		return players;
	}

	public Allenatore getAllenatore() {
		return allenatore;
	}

}
