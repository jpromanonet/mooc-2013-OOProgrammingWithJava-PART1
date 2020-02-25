public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money newMoney = new Money((added.euros()+this.euros()), (added.cents()+this.cents()));
        return newMoney;
    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        int newEuros = this.euros()-decremented.euros();
        int newCents = this.cents()-decremented.cents();

        if (newEuros<0 && newCents<0) {
            newEuros = 0;
            newCents = 0;
        } else if (newEuros<0) {
            newEuros = 0;
            newCents = 0;
        } else if (newCents<0) {
            newCents = 100+newCents;
            newEuros-=1;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }
}