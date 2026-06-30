class HillStation {
    void location() {
        System.out.println("Location info:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

class Ooty extends HillStation {
    void location() {
        System.out.println("Ooty is in Tamil Nadu");
    }

    void famousFor() {
        System.out.println("Famous for tea gardens and hills");
    }
}

class Shimla extends HillStation {
    void location() {
        System.out.println("Shimla is in Himachal Pradesh");
    }

    void famousFor() {
        System.out.println("Famous for snow and tourism");
    }
}

class Munnar extends HillStation {
    void location() {
        System.out.println("Munnar is in Kerala");
    }

    void famousFor() {
        System.out.println("Famous for tea plantations");
    }
}

class l5a1 {
    public static void main(String[] args) {

        HillStation h1 = new HillStation();
        HillStation h2 = new Ooty();
        HillStation h3 = new Shimla();
        HillStation h4 = new Munnar();

        h1.location();
        h1.famousFor();

        h2.location();
        h2.famousFor();

        h3.location();
        h3.famousFor();

        h4.location();
        h4.famousFor();
    }
}
