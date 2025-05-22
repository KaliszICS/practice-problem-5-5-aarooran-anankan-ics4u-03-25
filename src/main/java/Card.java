class Card implements Comparable<Card> {
    
    //Instance Variables
    private String name;
    private String suit;
    
    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSuit(String newSuit) {
        this.suit = newSuit;
    }

    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    @Override
    public int compareTo(Card compare) {
        
        String[] cardNames = new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] cardSuits = new String[] {"Hearts", "Clubs", "Diamonds", "Spades"};

        int thisSuit = -1;

        for (int i=0; i<cardSuits.length; i++) {
            if (cardSuits[i].equals(this.suit)) {
                thisSuit = i;
                i=cardSuits.length;
            }
        }

        int compareSuit = -1;

        for (int i=0; i<cardSuits.length; i++) {
            if (cardSuits[i].equals(compare.getSuit())) {
                compareSuit = i;
                i=cardSuits.length;
            }
        }

        int suitComparison =  thisSuit - compareSuit;
        
        if (suitComparison!=0) {
            return suitComparison;
        }

            int thisName = -1;

            for (int i=0; i<cardNames.length; i++) {
                if (cardNames[i].equals(this.name)) {
                    thisName = i;
                    i=cardNames.length;
                }
            }

            int compareName = -1;

            for (int i=0; i<cardNames.length; i++) {
                if (cardNames[i].equals(compare.getName())) {
                    compareName = i;
                    i=cardNames.length;
            } 
        }
            return thisName - compareName;
    }   
}