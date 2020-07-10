package section8.movie.pricing;


import section8.money.Money;
import section8.movie.DiscountPolicy;
import section8.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
