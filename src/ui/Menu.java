package ui;
import java.util.*;
import model.infrastructureDepartment;

public class Menu {

	private final String ASTERISKS = "*****************";
	private infrastructureDepartment infraDept;
	private Scanner in;

	public Menu() {
		in = new Scanner(System.in);
		infraDept = new infrastructureDepartment();

	}

	public void startProgram() {
		boolean exit = false;
		int option = 0;
		System.out.println("\n" + ASTERISKS);
		System.out.println("*****WELCOME*****");

		do {
			showMenu();

			try {
				option = Integer.parseInt(in.nextLine());

			} catch (NumberFormatException numberFormatException) {
				System.out.println("the Option entered " + option + " is not valid.\n"
						+ "please select an option in between ( 1 - 5)");

			}

			exit = runOption(option);

		} while (!exit);

	}

	private void showMenu() {
		System.out.println(ASTERISKS + "*PRINCIPAL MENU*" + ASTERISKS + "1.Agregar valla publicitaria\n"
				+ "2.Mostrar vallas publicitarias\n" + "3.Importar vallas publicitarias\n"
				+ "4.Exportar reporte de peligrosidad\n" + "5.Salir\n");

	}

	private boolean runOption(int option) {
		boolean exit = false;
		switch (option) {
		case 1:
			try {
				runOptionOne();
			} catch (NumberFormatException numberFormatException) {
				System.err.println(numberFormatException);
			}

			break;

		case 2:
			runOptionTwo();
			break;

		case 3:
			runOptionTree();
			break;
		case 4:
			runOptionFour();
			break;

		case 5:
			runOptionFive();
			break;

		default:
			System.out.println("-\n" + ASTERISKS);
			System.out.println(
					"Not a valid option. \nPlease only type the number next to the option (1 to 4), or 5 to exit the program\n-");
			break;
		}
		return exit;
	}

	private void runOptionOne() throws NumberFormatException {
		double width;
		double heigth;
		boolean inUse;
		String brand;

		System.out.println("\n" + ASTERISKS);
		System.out.println("- Enter the width of the billboard");
		width = Double.parseDouble(in.nextLine());

		System.out.println("\n" + ASTERISKS);
		System.out.println("- Enter the heigth of the billboard");
		heigth = Double.parseDouble(in.nextLine());

		System.out.println("\n" + ASTERISKS);
		System.out.println("- billboard in use?" + "1- YES\n" + "2- NO");
		int option = Integer.parseInt(in.nextLine());
		if (option == 1 || option == 2) {
			inUse = (option == 1) ? true : false;

		} else {
			throw new NumberFormatException();
		}

		System.out.println("\n" + ASTERISKS);
		System.out.println("- Enter the brand of the billboard");
		brand = in.nextLine();

		infraDept.addBilboard(width, heigth, inUse, brand);

	}

	private void runOptionTwo() {
		// TODO Auto-generated method stub

	}

	private void runOptionTree() {
		// TODO Auto-generated method stub

	}

	private void runOptionFour() {
		// TODO Auto-generated method stub

	}

	private void runOptionFive() {
		// TODO Auto-generated method stub

	}

}
