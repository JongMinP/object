package section2.policy2;

import section2.Money;
import section2.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}

