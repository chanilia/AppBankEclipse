package Dao;

import Model.Client;

public class MainAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client clt = new Client("john", null);
		System.out.println(clt.getNom());
	}
}