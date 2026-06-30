class SevenWonders {

    void showName() {
        System.out.println("Seven Wonders of the World");
    }

    void showLocation() {
        System.out.println("Location info:");
    }
}

// 7 subclasses
class TajMahal extends SevenWonders {
    void showLocation() {
        System.out.println("Taj Mahal - India");
    }
}

class GreatWall extends SevenWonders {
    void showLocation() {
        System.out.println("Great Wall - China");
    }
}

class Petra extends SevenWonders {
    void showLocation() {
        System.out.println("Petra - Jordan");
    }
}

class ChristRedeemer extends SevenWonders {
    void showLocation() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

class MachuPicchu extends SevenWonders {
    void showLocation() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChichenItza extends SevenWonders {
    void showLocation() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class Colosseum extends SevenWonders {
    void showLocation() {
        System.out.println("Colosseum - Italy");
    }
}

class l5acp {
    public static void main(String[] args) {

        SevenWonders w;

        w = new TajMahal();
        w.showLocation();

        w = new GreatWall();
        w.showLocation();

        w = new Petra();
        w.showLocation();

        w = new ChristRedeemer();
        w.showLocation();

        w = new MachuPicchu();
        w.showLocation();

        w = new ChichenItza();
        w.showLocation();

        w = new Colosseum();
        w.showLocation();
    }
}
