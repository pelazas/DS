package form.main;

import form.Form;
import form.editableItem.MonumentEditable;
import form.editableItem.PhotoEditable;
import form.editableItem.RestaurantEditable;
import google.maps.*;
import model.*;

public class Main {
	
	public static void main(String[] args) {
		Monument coliseo = new Monument("Coliseo", "Vespasiano", "Piazza del Colosseo, 1, 00184 Roma, Italia");
		Photo photoColosseum = new Photo("Colosseum in Rome, Italy - April 2007", "DAVID ILIFF", new Coordinates(20, 20));
		Restaurant tavernaDeiFori = new Restaurant("La Taverna dei Fori Imperiali", 
				"via Madonna dei Monti, 9, 00184 Roma, Italia", "+39 06 6798643");
		
		Form form = new Form();
		
		// Se editan el autor y la dirección del monumento
		form.edit(new MonumentEditable(coliseo), new String[] {"author", "address"});
		
		// Tarea 1. Editar también el restaurante: que se puedan editar el nombre y la dirección
		form.edit(new RestaurantEditable(tavernaDeiFori), new String[] {"name", "address"});
		
		// Tarea 2. Editar también la foto (usuario y descripción)
		form.edit(new PhotoEditable(photoColosseum), new String[] {"user", "description"});

		// Tarea 3. Editar de nuevo el monumento, pero ahora el nombre y la dirección
		form.edit(new MonumentEditable(coliseo), new String[] {"name", "address"});
	}
}
