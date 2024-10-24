package main;
import adapters.map.MonumentMapElement;
import adapters.map.PhotoMapElement;
import adapters.map.RestaurantMapElement;
import database.Database;
import google.maps.*;
import model.*;

public class Main {
	
	public static void main(String[] args) {
		Database database = new Database();
		Map map = new Map();
		
		// 1. Meter elementos en el mapa
		System.out.println("\n 1. Se a�aden varios elementos al mapa...");
		
		for (Monument monument : database.selectMonuments()) {
			map.add(new MonumentMapElement(monument));
		}
		
		for (Photo photo : database.selectPhotos()) {
			map.add(new PhotoMapElement(photo));
		}

		for (Restaurant restaurant : database.selectRestaurants()) {
			map.add(new RestaurantMapElement(restaurant));
		}

		// 2. Se dibuja el mapa con los marcadores de los elementos añadidos
		System.out.println("\n 2. Se muestra el mapa:");
		
		map.draw();

		// 3. El usuario presiona brevemente la pantalla para recibir información de cada elemento
		System.out.println("\n 3. Pulsaci�n breve sobre cada elemento: se muestra un \"tooltip\"");
		map.userTouch(160, 160); // informaci�n resumida del coliseo
		map.userTouch(22, 21);   // informaci�n de la foto
		map.userTouch(219, 221); // informaci�n del restaurante

		// 4. El usuario deja pulsado un marcador para abrir un elemento
		System.out.println("\n 4. Pulsaci�n larga sobre cada elemento: realiza la acci�n predeterminada con cada elemento");
		map.userLongTouch(160, 158); // navegar hasta el coliseo con el GPS
		map.userLongTouch(19, 22);   // descargar foto
		map.userLongTouch(222, 218); // llamar al restaurante
	}
}
