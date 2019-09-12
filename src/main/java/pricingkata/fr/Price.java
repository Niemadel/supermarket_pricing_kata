package pricingkata.fr;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Price {

    private BigDecimal amount;

    private Price(BigDecimal amount) {

        this.amount = amount.setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static Price of(BigDecimal amount) {
        return new Price(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(amount, price.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
