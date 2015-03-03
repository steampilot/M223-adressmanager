package gui;

import java.util.List;

import domain.Bl;
import mytools.StdInput;
import bo.Person;

public class AVGui {
	private Bl bl = new Bl();

	public static void main(String[] args) {
		AVGui gui = new AVGui();
		gui.run();
	}

	private void run() {
		char selection;
		do {
			selection = mainMenu();
			switch(selection) {
			case '1':
				showAll();
				break;
			case '2':
				showSinglePerson();
				break;
			case '3':
				insertAddress();
				break;
            case '4':
                showSinglePersonByName();
                break;
			case '5':
				deletePerson();
				break;
			case 'x':
				break;
			default:
				System.out.println();
				System.out.println("Ung�ltige Auswahl");
				System.out.println();
			}
		} while(selection != 'x');
	}
	
	private void insertAddress() {
		String name    = StdInput.readString("Name:    ");
		String vorname = StdInput.readString("Vorame:  ");
		String strasse = StdInput.readString("Strasse: ");
		String plz     = StdInput.readString("PLZ:     ");
		String ort     = StdInput.readString("Ort:     ");
		
		Person person = new Person();
		person.setName(name);
		person.setVorname(vorname);
		person.setStrasse(strasse);
		person.setPlz(plz);
		person.setOrt(ort);
		bl.insertPerson(person);
	}
	
	private void showSinglePerson() {
		long id = (long)StdInput.readInt("ID: ");
		Person person = bl.getPerson(id);
		if(person != null) {
			showPerson(person);
		} else {
			System.out.println();
			System.out.println("Nicht gefunden");
		}
		System.out.println();
	}
    private void showSinglePersonByName() {
        System.out.print("Nicht implementiert");
    }
	
	private void deletePerson() {
		long id = (long)StdInput.readInt("ID: ");
		System.out.println();
		if(bl.deletePerson(id)) {
			System.out.println("Gel�scht");
		} else {
			System.out.println("Nicht gefunden");
		}
		System.out.println();
	}
	
	private void showPerson(Person person) {
		System.out.println();
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getVorname());
		System.out.println(person.getStrasse());
		System.out.println(person.getPlz());
		System.out.println(person.getOrt());
	}
	private void showAll() {
		List<Person> persons = bl.getAllPersons();
		if(persons.size() == 0) {
			System.out.println();
			System.out.println("keine Adressen");
		} else {
			System.out.println();
			for(Person p : persons) {
				showPerson(p);
			}
		}
		System.out.println();
	}
	
	private char mainMenu() {
		System.out.println("Adress-Verwaltung");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("1 - Alle Adressen anzeigen");
		System.out.println("2 - Eine Adresse anzeigen");
		System.out.println("3 - Neue Adresse");
		System.out.println("4 - Name Suchen");
		System.out.println("5 - Adresse l�schen");
		System.out.println("");
		System.out.println("x - Programm beenden");
		System.out.println("");
		return StdInput.readChar("Ihre Wahl: ");
	}
	
}
