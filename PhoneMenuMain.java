import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneMenuMain {

    public static int len;

    public static void main(String[] args) {
        while(len != 1){
            try {
                phone();
            }
            catch (InputMismatchException e) {
                System.out.println(">> Incorrect argument");
            }
        }
    }


    public static void phone() {
        PhoneMenu phone = new PhoneMenu();
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> menuCode = new ArrayList<>();

        menuCode.add(1);
        int num;

        while(len != 1) {

            if(menuCode.size() == 1) {
                if(menuCode.get(0) == 1) {
                    System.out.println("\nMenu");
                    phone.displayMenuOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1, 0 -> len = 1;
                        case 1, 2, 3, 4, 5 -> menuCode.add(num);
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 2) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 1) {
                    System.out.println("\nPhonebook");
                    phone.displayPhoneBookOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> menuCode.add(num);
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 2) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 2) {
                    System.out.println("\nMessages");
                    phone.displayMessageOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> menuCode.add(num);
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 2) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 3) {
                    System.out.println("\nCall history");
                    phone.displayCallHistoryOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> menuCode.add(num);
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }


            if(menuCode.size() == 2) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 4) {
                    System.out.println("\nSettings");
                    phone.displaySettingOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> menuCode.add(num);
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 2) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 5) {
                    System.out.println("\nExtra");
                    phone.displayExtraOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> menuCode.add(num);
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 1 && menuCode.get(2) == 1) {
                    System.out.println("\nSearch");
                    phone.displaySearchOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-Only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 1 && menuCode.get(2) == 2) {
                    System.out.println("\nNew");
                    phone.displayNewOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-Only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 1 && menuCode.get(2) == 3) {
                    System.out.println("\nDelete");
                    phone.displayPhDeleteOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3 -> System.out.println(">> Read-Only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 1 && menuCode.get(2) == 4) {
                    System.out.println("\nCopy/Move");
                    phone.displayCopy_MoveOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 1 && menuCode.get(2) == 5) {
                    System.out.println("\nImport/Export");
                    phone.displayImport_ExportOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 2 && menuCode.get(2) == 1) {
                    System.out.println("\nWrite message");
                    phone.displayWriteMessageOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 2 && menuCode.get(2) == 2) {
                    System.out.println("\nInbox");
                    phone.displayInboxOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 2 && menuCode.get(2) == 3) {
                    System.out.println("\nOutbox");
                    phone.displayOutBoxOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 2 && menuCode.get(2) == 4) {
                    System.out.println("\nSent-box");
                    phone.displaySentBoxOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 2 && menuCode.get(2) == 5) {
                    System.out.println("\nDraft");
                    phone.displayDraftOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 3 && menuCode.get(2) == 1) {
                    System.out.println("\nCall logs");
                    phone.displayCallLogsOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5, 6 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 3 && menuCode.get(2) == 2) {
                    System.out.println("\nDialed calls");
                    phone.displayDialedCallOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5, 6 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 3 && menuCode.get(2) == 3) {
                    System.out.println("\nReceived calls ");
                    phone.displayReceivedCallOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5, 6 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 3 && menuCode.get(2) == 4) {
                    System.out.println("\nMissed calls");
                    phone.displayMissedCallOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5, 6 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 3 && menuCode.get(2) == 5) {
                    System.out.println("\nDelete");
                    phone.displayChDeleteOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 4 && menuCode.get(2) == 1) {
                    System.out.println("\nPhone settings");
                    phone.displayPhoneSettingOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4, 5 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 4 && menuCode.get(2) == 2) {
                    System.out.println("\nCall settings");
                    phone.displayCallSettingOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 4 && menuCode.get(2) == 3) {
                    System.out.println("\nDisplay");
                    phone.displayDisplayOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 4 && menuCode.get(2) == 4) {
                    System.out.println("\nProfiles");
                    phone.displayProfileOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 4 && menuCode.get(2) == 5) {
                    System.out.println("\nSecurity");
                    phone.displaySecurityOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 5 && menuCode.get(2) == 1) {
                    System.out.println("\nTorch");
                    phone.displayTorchOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 5 && menuCode.get(2) == 2) {
                    System.out.println("\nCalender");
                    phone.displayCalenderOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 5 && menuCode.get(2) == 3) {
                    System.out.println("\nAlarm");
                    phone.displayAlarmOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2, 3, 4 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 5 && menuCode.get(2) == 4) {
                    System.out.println("\nCalculator");
                    phone.displayCalculatorOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }

            if(menuCode.size() == 3) {
                if(menuCode.get(0) == 1 && menuCode. get(1) == 5 && menuCode.get(2) == 5) {
                    System.out.println("\nGames");
                    phone.displayGameOptions();
                    System.out.println("0 -> back : -1 -> quit");
                    System.out.print("> ");
                    num = input.nextInt();

                    switch(num) {
                        case -1 -> len = 1;
                        case 0 -> menuCode.remove(menuCode.size() - 1);
                        case 1, 2 -> System.out.println(">> Read-only");
                        default -> System.out.println(">> Invalid input");
                    }
                }
            }
        }
    }
}
