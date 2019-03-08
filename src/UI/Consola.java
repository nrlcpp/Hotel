package UI;

import Domain.RatingMediu;
import Domain.Rezervare;
import Service.RezervareService;

import java.util.Scanner;

public class Consola {
    private RezervareService service;
    private Scanner scanner;

    public Consola(RezervareService service) {
        this.service = service;
        scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("1. CheckIn");
        System.out.println("2. CheckOut");
        System.out.println("3. Feedback");
        System.out.println("a. Afisare toate rezervarile");
        System.out.println("x. Iesire");
    }

    public void run() {

        label:
        while (true) {
            showMenu();
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    handleServiceEntry();
                    break;
                case "2":
                    handleServiceExit();
                    break;
                case "3":
                    handleStandsReport();
                    break;
                case "a":
                    handleShowAll();
                    break;
                case "x":
                    break label;
            }
        }
    }

    private void handleStandsReport() {
        for (RatingMediu ratingAverage : service.getRating())
            System.out.println(ratingAverage);
    }


    private void handleServiceExit() {
        try {
            System.out.println("Dati numarul de camera:");
            int camera = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati feedback:");
            String feedback = scanner.nextLine();
            System.out.println("Dati ratingul:");
            double rating = Double.parseDouble(scanner.nextLine());

            service.exitService(camera, feedback, rating);
        } catch (RuntimeException runtimeException) {
            System.out.println("Avem erori: " + runtimeException.getMessage());
        }
    }

    private void handleShowAll() {
        for (Rezervare r : service.getAll())
            System.out.println(r);
    }

    private void handleServiceEntry() {

        try {
            System.out.println("Dati id-ul:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati numarul camerei:");
            int camera = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati numarul de persoane:");
            String persoane = scanner.nextLine();
            System.out.println("Dati numarul de zile:");
            int zile = Integer.parseInt(scanner.nextLine());

            service.enterService(id, camera, persoane, zile);
        } catch (RuntimeException runtimeException) {
            System.out.println("Avem erori: " + runtimeException.getMessage());
        }
    }
}
