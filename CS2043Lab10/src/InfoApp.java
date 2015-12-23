
public class InfoApp {

	public static void main(String[] args) {
		System.out.println("Team 5 Member List:");
		InfoPrintJared.printJared();
		InfoPrintAyedi infoPrintAyedi = new InfoPrintAyedi();
		infoPrintAyedi.printAyedi();
		InfoPrintFraser.printFraser();
		InfoPrintFraser infoPrintFraser = new InfoPrintFraser();
		infoPrintFraser.printFraser();
		InfoPrintKwak infoPrintKwak = new InfoPrintKwak();
		infoPrintKwak.printKwak();
	}

}
