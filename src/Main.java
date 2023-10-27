import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static int selectedOption = 1;
    private static final List<Informacje> psy = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_UP) {
                    if (selectedOption > 1) {
                        selectedOption--;
                    }
                } else if (key == KeyEvent.VK_DOWN) {
                    if (selectedOption < 7) {
                        selectedOption++;
                    }
                } else if (key == KeyEvent.VK_ENTER) {
                    if (selectedOption == 1) {
                        // Przejdź do dodawania nowych informacji o psach
                        dodajPsa();
                    } else {
                        handleOption(selectedOption);
                    }
                }
                printMenu(selectedOption);
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });
        printMenu(selectedOption);
    }

    public static void printMenu(int selectedOption) {
        System.out.println("Witaj w Adoptuj Psa Online!");
        for (int i = 1; i <= 7; i++) {
            if (i == selectedOption) {
                System.out.println("-> Opcja " + i);
            } else {
                System.out.println("   Opcja " + i);
            }
        }
    }

    public static void handleOption(int option) {
        switch (option) {
            case 2:
                // Obsługa opcji "Wypełnij formularz adopcyjny"
                break;
            case 3:
                // Obsługa opcji "Moje ulubione psy"
                break;
            case 4:
                // Obsługa opcji "Kontakt z schroniskiem"
                break;
            case 5:
                // Obsługa opcji "Zaloguj się"
                break;
            case 6:
                // Obsługa opcji "Zarejestruj się"
                break;
            case 7:
                System.out.println("Dziękujemy za skorzystanie z aplikacji. Do zobaczenia!");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public static void dodajPsa() {
        // Tworzenie nowej instancji klasy Informacje i przypisanie nowych informacji o psie
        Informacje pies1 = new Informacje(1,"Rex", 3, "Owczarek niemiecki",
                "Czarny", "Suczka", 25.5, "Krótka", "Duży", new Date());
        Informacje pies2 = new Informacje(2,"Alex", 1, "Boxer",
                "Brązowy", "Pies", 15, "Krótka", "Duży", new Date());
        Informacje pies3= new Informacje(3, "Buddy", 2, "Golden Retriever",
                "Złoty", "Pies", 30.0, "Długa", "Średni", new Date());
        Informacje pies4= new Informacje(4, "Luna", 4, "Labrador",
                "Czekoladowy", "Suczka", 28.0, "Krótka", "Duży", new Date());
        Informacje pies5= new Informacje(5, "Max", 5, "Bulldog",
                "Biały", "Pies", 18.5, "Krótka", "Średni", new Date());
        Informacje pies6= new Informacje(6, "Lola", 2, "Yorkshire Terrier",
                "Czarny i brązowy", "Suczka", 4.0, "Długa", "Mały", new Date());
        Informacje pies7= new Informacje(7, "Rocky", 3, "Siberian Husky",
                "Szary i biały", "Pies", 22.0, "Długa", "Duży", new Date());
        Informacje pies8=new Informacje(8, "Charlie", 2, "Cavalier King Charles Spaniel",
                "Brązowy i biały", "Pies", 7.5, "Długa", "Mały", new Date());
        psy.add(pies1);
        psy.add(pies2);
        psy.add(pies3);
        psy.add(pies4);
        psy.add(pies5);
        psy.add(pies6);
        psy.add(pies7);
        psy.add(pies8);
        wyswietlWszystkiePsy();

        }
    public static void wyswietlWszystkiePsy() {
        System.out.println("Lista wszystkich psów:");
        for (Informacje pies : psy) {
            System.out.println("Pies " + pies.getNrpsa());
            System.out.println("Imię: " + pies.getImie());
            System.out.println("Wiek: " + pies.getWiek() + " lat");
            System.out.println("Rasa: " + pies.getRasa());
            System.out.println("Kolor sierści: " + pies.getKolorSiersci());
            System.out.println("Płeć: " + pies.getPlec());
            System.out.println("Waga: " + pies.getWaga() + " kg");
            System.out.println("Rodzaj sierści: " + pies.getRodzajSiersci());
            System.out.println("Wielkość: " + pies.getWielkosc());
            System.out.println("Data przyjęcia do schroniska: " + pies.getDataPrzyjeciaDoSchroniska());
            System.out.println();
        }
    }

}

